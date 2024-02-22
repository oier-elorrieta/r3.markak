package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.Button;

public class Erosketak {
    public static void main(String[] args) {
        String bezeroa = "Bezeroa";
        String zinema = "Zinema";
        String filma = "Filma";
        String eguna = "Eguna";
        String ordua = "Ordua";
        String kantitatea = "Kantitatea";
        String prezioa = "Prezioa";
        String deskontua = "Deskontua";
        String prezioTotala = "Prezio Totala";

        Object[][] data = {
            {bezeroa, ""},
            {zinema, ""},
            {filma, ""},
            {eguna, ""},
            {ordua, ""},
            {kantitatea, ""},
            {prezioa, ""},
            {deskontua, ""},
            {prezioTotala, ""}
        };

        DefaultTableModel model = new DefaultTableModel(data, new Object[]{"Ticket", "Datuak"});

        JTable erosketaTaula = new JTable(model);

        erosketaTaula.setDefaultEditor(Object.class, null);

        JFrame frame = new JFrame("Datos del Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 263);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        erosketaTaula.setBounds(10, 30, 369, 144);
        panel.add(erosketaTaula);

        frame.getContentPane().add(panel);
        
        JLabel lblNewLabel = new JLabel("EROSKETA TIKETA");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 0, 369, 33);
        panel.add(lblNewLabel);
        
        Button btnErosketaBotoia = new Button("Baieztatu erosketa");
        btnErosketaBotoia.setBounds(145, 192, 94, 22);
        panel.add(btnErosketaBotoia);

        frame.setVisible(true);
    }
}
