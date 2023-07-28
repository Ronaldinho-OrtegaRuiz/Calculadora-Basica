package vista;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class VentanaHistorial extends JFrame {

    private JTextArea historialTextArea;
    private List<String> operaciones;

    public VentanaHistorial() {
        initComponents();
        setLocationRelativeTo(null);
        operaciones = new ArrayList<>();
    }

    private void initComponents() {
        historialTextArea = new JTextArea();
        historialTextArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(historialTextArea);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        setTitle("Historial");
        setSize(300, 400);
    }


    public void agregarOperacion(String operacion) {
        operaciones.add(operacion);
        actualizarHistorial();
    }

    private void actualizarHistorial() {
        historialTextArea.setText("");
        for (String operacion : operaciones) {
            historialTextArea.append(operacion + "\n");
        }
    }
}
