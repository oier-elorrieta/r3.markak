package Vista;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;

public class Data {
    public static void main(String[] args) {
        // Crear el frame
        JFrame frame = new JFrame("Ejemplo de JDatePicker");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear el modelo de fecha
        UtilDateModel model = new UtilDateModel();
        Properties properties = new Properties();
        properties.put("text.today", "Hoy");
        properties.put("text.month", "Mes");
        properties.put("text.year", "Año");

        // Configurar el modelo para no permitir fechas pasadas
        model.setDate(2024, Calendar.FEBRUARY, 1);  // Configuramos la fecha mínima (1 de febrero de 2024)
        model.setSelected(true);

        // Crear el panel de fecha
        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);

        // Crear el picker de fecha con DateComponentFormatter
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());

        // Configurar el picker de fecha
        datePicker.getJFormattedTextField().setEditable(true);

        // Añadir un PropertyChangeListener al modelo para validar las fechas
        model.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                Date selectedDate = model.getValue();
                Date currentDate = new Date();
                if (selectedDate != null && selectedDate.before(currentDate)) {
                    // Restablecer la fecha a la fecha mínima
                    model.setDate(2024, Calendar.FEBRUARY, 1);
                    model.setSelected(true);
                }
            }
        });

        // Añadir el picker al frame
        Container container = frame.getContentPane();
        container.setLayout(new FlowLayout());
        container.add(datePicker);

        // Configurar el frame
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}


//public void Data() {
//		
//		UtilDateModel model = new UtilDateModel();
//        Properties properties = new Properties();
//        properties.put("text.today", "Hoy");
//        properties.put("text.month", "Mes");
//        properties.put("text.year", "Año");
//
//        // Configurar el modelo para no permitir fechas pasadas
//        model.setDate(2024, Calendar.FEBRUARY, 1);  // Configuramos la fecha mínima (1 de febrero de 2024)
//        model.setSelected(true);
//
//        // Crear el panel de fecha
//        JDatePanelImpl datePanel = new JDatePanelImpl(model, properties);
//        // Crear el picker de fecha con DateComponentFormatter
//        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, new DateComponentFormatter());
//        SpringLayout springLayout = (SpringLayout) datePicker.getLayout();
//        springLayout.putConstraint(SpringLayout.NORTH, datePicker.getJFormattedTextField(), 0, SpringLayout.NORTH, datePicker);
//        datePicker.setSize(202, 26);
//        datePicker.setLocation(117, 45);
//
//        // Configurar el picker de fecha
//        datePicker.getJFormattedTextField().setEditable(true);
//
//        // Añadir un PropertyChangeListener al modelo para validar las fechas
//        model.addPropertyChangeListener(new PropertyChangeListener() {
//            @Override
//            public void propertyChange(PropertyChangeEvent evt) {
//                Date selectedDate = model.getValue();
//                Date currentDate = new Date();
//                if (selectedDate != null && selectedDate.before(currentDate)) {
//                    // Restablecer la fecha a la fecha mínima
//                    model.setDate(2024, Calendar.FEBRUARY, 1);
//                    model.setSelected(true);
//                }
//            }
//        });
//        
//       
////        contentPaneZinemak.add(datePicker);
//	
//	}