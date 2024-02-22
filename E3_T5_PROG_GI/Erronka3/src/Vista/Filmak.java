package Vista;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import Modelo.Bezeroa;
import Modelo.Saioa;
import Modelo.Zinema;
import Modelo.*;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Filmak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneFilmak;
    private Zinema zinemaAukera;
    private Zinema[] zinemakList;
    private Bezeroa[] bezeroak;
    private Filma aukeratutakoFilma;
    public Filmak(Zinema zinemaAukera, Zinema[] zinemakList, Bezeroa[] bezeroak) {
        this.zinemaAukera = zinemaAukera;
        this.zinemakList = zinemakList;
        initialize();
    }

    
    
    
    
    
    private void initialize() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneFilmak = new JPanel();
        contentPaneFilmak.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPaneFilmak);
        contentPaneFilmak.setLayout(null);

        JButton btnAtzeraFilmak = new JButton("Atzera");
        btnAtzeraFilmak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Zinemak zinemak = new Zinemak(zinemakList, bezeroak);
                zinemak.setVisible(true);
                dispose();
            }
        });
        btnAtzeraFilmak.setBackground(SystemColor.activeCaption);
        btnAtzeraFilmak.setBounds(10, 10, 85, 21);
        contentPaneFilmak.add(btnAtzeraFilmak);
        // no vaaaaaaaaaaaa 
        // Obtener las películas más cercanas al día actual usando el método de la clase Zinema
        String[] closestMovies = zinemaAukera.getClosestMovies(zinemaAukera.getSaioalistArray());
        int i;
        for (i = 0; i < closestMovies.length; i++) {
            final int index = i;
            JButton btnPelikula = new JButton(closestMovies[i]);
            btnPelikula.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Has seleccionado la película: " + closestMovies[index]);
                    // Aquí puedes abrir la pantalla de Saioak con la película seleccionada
                     Saioak saioa = new Saioak(closestMovies[index], zinemakList,bezeroak);  
                     saioa.setVisible(true);
                     dispose();
                }
            });
            btnPelikula.setBounds(10, 50 + i * 30, 150, 25);
            contentPaneFilmak.add(btnPelikula);
        }
    }
}
