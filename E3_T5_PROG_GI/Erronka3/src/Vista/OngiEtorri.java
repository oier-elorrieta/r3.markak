package Vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.ZinemakDAO;
import Kontroladorea.Kontroladorea;
import Modelo.Bezeroa;
import Modelo.Saioa;
import Modelo.Zinema;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class OngiEtorri extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel OngiEtorri;
    private JPanel pProgreso;
    private JProgressBar progressBar;
    private JLabel lblEzkerrekoMargena;
    private JLabel lblEskuinekoMargena;
    private JLabel lblLogoa;
    public int tiempoCarga = 0;
	public static int barraBat = 0;

    public OngiEtorri(Zinema[] zinemakList, Bezeroa[] bezeroak) {
    	
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 380);
        OngiEtorri = new JPanel();
        OngiEtorri.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(OngiEtorri);
        OngiEtorri.setLayout(new BorderLayout(0, 0));

        
        JPanel Irudia = new JPanel();
        OngiEtorri.add(Irudia, BorderLayout.CENTER);
        Irudia.setLayout(null);

      
        lblLogoa = new JLabel("");
        lblLogoa.setBounds(26, 0, 548, 292);
        lblLogoa.setIcon(new ImageIcon("C:\\Users\\in1dm3-d\\Desktop\\E3_T5_PROG_GI\\Erronka3\\src\\Irudiak\\elorrietaB.png"));
        Irudia.add(lblLogoa);

     
        pProgreso = new JPanel();
        OngiEtorri.add(pProgreso, BorderLayout.SOUTH);
        pProgreso.setLayout(new BorderLayout(0, 0));

     
        progressBar = new JProgressBar();
        pProgreso.add(progressBar, BorderLayout.CENTER);

        progressBar.setMaximum(30);
        progressBar.setStringPainted(true);

        lblEzkerrekoMargena = new JLabel("                            ");
        pProgreso.add(lblEzkerrekoMargena, BorderLayout.WEST);

        lblEskuinekoMargena = new JLabel("                            ");
        pProgreso.add(lblEskuinekoMargena, BorderLayout.EAST);

        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Thread(new Runnable() {
                    public void run() {
                        pProgreso.setVisible(true);
                        while (barraBat == 0) {
                            barraBat++;
                            for (int i = 0; i <= 30; i++) {
                                final int value = i;
                                EventQueue.invokeLater(new Runnable() {
                                    public void run() {
                                        progressBar.setValue(value);
                                        System.out.println(value + " " + progressBar.getValue());
                                    }
                                });
                                try {
                                    Thread.sleep(100);
                                } catch (Exception p) {
                                    System.out.println("Algo va mal");
                                }
                            }
                            
                        }
                        Logina frame = new Logina(zinemakList, bezeroak);
                        frame.setVisible(true);
                        dispose();
                    }
                }).start();
            }
        });
        
    }
}
