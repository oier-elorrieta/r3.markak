package Vista;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.nio.file.FileAlreadyExistsException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.border.EmptyBorder;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import DAO.SaioaDAO;
import Modelo.Areto;
import Modelo.Bezeroa;
import Modelo.Filma;
import Modelo.Kontsultak;
import Modelo.Saioa;
import Modelo.Zinema;
import javax.swing.JLabel;

public class Saioak extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPaneSaioak;
    public  Zinema zinemaAukera;
    private JLabel lblData;
    private Filma filma;
    private Areto aretoa;
    private LocalTime ordua;
    private LocalDate date;
    private Saioa[] saioalist;
    Areto[] aretolist;
    private String id_zine;
    private String izena;
    private String helbidea;
    public Saioa saioa;
    private Filma aukeratutakoFilma;
    
 
    public Saioak(String closestMovies,Zinema[] zinemakList, Bezeroa[] bezeroak) { 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPaneSaioak = new JPanel();
        contentPaneSaioak.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPaneSaioak);
        
        JButton btnAtzeraSaioak = new JButton("Atzera");
        btnAtzeraSaioak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
				Filmak filmak = new Filmak(zinemaAukera, zinemakList, bezeroak ); 
                filmak.setVisible(true);
                dispose();
            }
        });
        contentPaneSaioak.setLayout(null);
        btnAtzeraSaioak.setBackground(SystemColor.activeCaption);
        btnAtzeraSaioak.setBounds(10, 10, 71, 21);
        contentPaneSaioak.add(btnAtzeraSaioak);
        
       
        
        JButton btnDataAukeratu = new JButton("Aukeratu");
        btnDataAukeratu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				lblData.setVisible(true);
				Date selectedDate = Data();
				System.out.println(selectedDate);
				
				
        	}
        });
        btnDataAukeratu.setBounds(317, 73, 85, 21);
        contentPaneSaioak.add(btnDataAukeratu);
        Date data = Data();
       String dataLabel = "";
       
        
          SimpleDateFormat dataFormatua = new SimpleDateFormat("yyyy-MM-dd");
            dataLabel = dataFormatua.format(data);
        
        
        lblData = new JLabel(dataLabel + " Ordutegia (" + closestMovies + ")");
        lblData.setBounds(41, 128, 286, 13);
        contentPaneSaioak.add(lblData);
        lblData.setVisible(false);
        
        JLabel lblIzena = new JLabel(closestMovies);
        lblIzena.setBounds(41, 167, 335, 14);
        contentPaneSaioak.add(lblIzena);
        
        String IraupenaLabel = "";
        String filmaGeneroa = "";
        
                System.out.println("Zinema: " + aukeratutakoFilma.getIzena());
                System.out.println("Saioa list array: " + aukeratutakoFilma.getIraupena());
                System.out.println("Areto list array: " + aukeratutakoFilma.getGeneroa());
        
        JLabel lblIraupena = new JLabel(IraupenaLabel + "min irauten du");
        lblIraupena.setBounds(35, 200, 355, 14);
        contentPaneSaioak.add(lblIraupena);
        
        JLabel lblGeneroa = new JLabel("Generoa" + filmaGeneroa);
        lblGeneroa.setBounds(35, 236, 321, 14);
        contentPaneSaioak.add(lblGeneroa);
       
         
        
        
        
    }
    
    public Date Data() {

        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");

        // Configurar el modelo para no permitir fechas pasadas
        model.setDate(2024, Calendar.FEBRUARY, 21);
        model.setSelected(true);
        SpringLayout springLayout = new SpringLayout();
        // Crear el panel de fecha
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
        springLayout.putConstraint(SpringLayout.NORTH, datePicker.getJFormattedTextField(), 0, SpringLayout.NORTH, datePicker);
        springLayout = (SpringLayout) datePicker.getLayout();
        datePicker.setSize(202, 31);
        datePicker.setLocation(109, 73);

        // Configurar el picker de fecha
        datePicker.getJFormattedTextField().setEditable(true);

        // Almacenar la fecha actual para comparar
        Date fechaActual = model.getValue();

        // Añadir un PropertyChangeListener al modelo para validar las fechas
        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Date selectedDate = model.getValue();
                Date currentDate = new Date();
                System.out.println(selectedDate);
                if (selectedDate != null && selectedDate.before(currentDate)) {
                    model.setSelected(true);
                    System.out.println(selectedDate);
                    
                }
            }
        });

        contentPaneSaioak.add(datePicker);

        return fechaActual; // Devolver la fecha seleccionada
    }
}
