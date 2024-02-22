package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

import Modelo.Bezeroa;
import Modelo.Zinema;
import DAO.BezeroaDAO;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Logina extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textErabiltzailea;
    private JPasswordField pasahitzaField;

   
    public Logina(Zinema[] zinemakList, Bezeroa[] bezeroak) {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        textErabiltzailea = new JTextField();
        textErabiltzailea.setBounds(173, 80, 118, 20);
        contentPane.add(textErabiltzailea);
        textErabiltzailea.setColumns(10);

        pasahitzaField = new JPasswordField();
        pasahitzaField.setBounds(173, 120, 118, 20);
        contentPane.add(pasahitzaField);

        JButton btnEzeztatu = new JButton("Ezeztatu");
        btnEzeztatu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                datuakEzabatu(textErabiltzailea, pasahitzaField);
            }
        });
        btnEzeztatu.setBounds(227, 227, 89, 23);
        contentPane.add(btnEzeztatu);

        JLabel lblErabiltzailea = new JLabel("Erabiltzailea");
        lblErabiltzailea.setBounds(93, 83, 80, 14);
        contentPane.add(lblErabiltzailea);

        JLabel lblPasahitza = new JLabel("Pasahitza");
        lblPasahitza.setBounds(93, 123, 57, 14);
        contentPane.add(lblPasahitza);

        JButton btnOndo = new JButton("Ondo");
        btnOndo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String erabiltzailea = textErabiltzailea.getText();
                String pasahitza = new String(pasahitzaField.getPassword());

                BezeroaDAO bezeroaDAO = new BezeroaDAO();
                Bezeroa[] bezeroak = bezeroaDAO.getAllBezeroak();

                boolean authenticated = false;
                for (Bezeroa bezeroa : bezeroak) {
                    if (erabiltzailea.equals(bezeroa.getErabiltzailea()) && pasahitza.equals(bezeroa.getPasahitza())) {
                        authenticated = true;
                        break;
                    }
                }

                if (authenticated) {
                    JOptionPane.showMessageDialog(null, "Sesión iniciada correctamente");
                    Zinemak zinemak = new Zinemak(zinemakList, bezeroak);
                    zinemak.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza txarto daude");
                    datuakEzabatu(textErabiltzailea, pasahitzaField);
                }
            }
        });
        btnOndo.setBounds(95, 227, 89, 23);
        contentPane.add(btnOndo);
    }

    private static void datuakEzabatu(JTextField textErabiltzailea, JPasswordField pasahitzaField) {
        textErabiltzailea.setText("");
        pasahitzaField.setText("");
    }
    
}
