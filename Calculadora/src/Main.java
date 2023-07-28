import com.formdev.flatlaf.FlatDarculaLaf;
import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Establecer el Look and Feel FlatLaf antes de crear cualquier ventana
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (Exception ex) {
            System.err.println("Error al establecer el Look and Feel FlatLaf: " + ex.getMessage());
        }

        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        vista.setVisible(true);

        Controlador controlador = new Controlador(vista, modelo);
    }
}
