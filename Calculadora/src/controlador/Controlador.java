package controlador;

import modelo.Modelo;
import vista.Vista;
import vista.VentanaHistorial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador {

    private Vista vista;
    private Modelo modelo;
    private JButton[] botones;
    private VentanaHistorial ventanaHistorial;
    private String operacion;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        botones = new JButton[]{vista.getBtnSumar(), vista.getBtnRestar(), vista.getBtnMultiplicar(), vista.getBtnDividir()};
        ventanaHistorial = new VentanaHistorial();

        for (JButton boton : botones) {
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        double numero1 = Double.parseDouble(vista.getNumero1().getText());
                        double numero2 = Double.parseDouble(vista.getNumero2().getText());

                        double resultado = 0;
                        if (boton == vista.getBtnSumar()) {
                            resultado = modelo.suma(numero1, numero2);
                            operacion = "Suma: " + numero1 + " + " + numero2 + " = " + resultado;
                            ventanaHistorial.agregarOperacion(operacion);
                        } else if (boton == vista.getBtnRestar()) {
                            resultado = modelo.resta(numero1, numero2);
                            operacion = "Resta: " + numero1 + " + " + numero2 + " = " + resultado;
                            ventanaHistorial.agregarOperacion(operacion);
                        } else if (boton == vista.getBtnMultiplicar()) {
                            resultado = modelo.mult(numero1, numero2);
                            operacion = "Multiplicación: " + numero1 + " + " + numero2 + " = " + resultado;
                            ventanaHistorial.agregarOperacion(operacion);
                        } else if (boton == vista.getBtnDividir()) {
                            resultado = modelo.div(numero1, numero2);
                            operacion = "División: " + numero1 + " + " + numero2 + " = " + resultado;
                            ventanaHistorial.agregarOperacion(operacion);
                        }

                        double valorPequeno = 1E-15; // Define un valor pequeño para detectar el underflow
                        if (Math.abs(resultado) < valorPequeno) {
                            JOptionPane.showMessageDialog(vista, "El resultado es demasiado pequeño y ha ocurrido un underflow.", "Error", JOptionPane.ERROR_MESSAGE);
                            vista.setNumero1("");
                            vista.setNumero2("");
                            vista.setResultado("");
                        } else {
                            if (Double.isInfinite(resultado)) {
                                JOptionPane.showMessageDialog(vista, "El resultado es demasiado grande y ha excedido el límite de precisión.", "Error", JOptionPane.ERROR_MESSAGE);
                                vista.setNumero1("");
                                vista.setNumero2("");
                                vista.setResultado("");
                            } else if (Double.isNaN(resultado)) {
                                JOptionPane.showMessageDialog(vista, "El resultado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                                vista.setNumero1("");
                                vista.setNumero2("");
                                vista.setResultado("");
                            } else {
                                if (esEntero(resultado)) {
                                    int resultadoEntero = (int) resultado;
                                    vista.setResultado(String.valueOf(resultadoEntero));
                                } else {
                                    vista.setResultado(String.valueOf(resultado));
                                }
                            }
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(vista, "Ingresa números válidos en los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                        vista.setNumero1("");
                        vista.setNumero2("");
                        vista.setResultado("");
                    } catch (ArithmeticException ex) {
                        JOptionPane.showMessageDialog(vista, "No se puede dividir por cero", "Error", JOptionPane.ERROR_MESSAGE);
                        vista.setNumero1("");
                        vista.setNumero2("");
                        vista.setResultado("");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(vista, "Se ha producido un error inesperado.", "Error", JOptionPane.ERROR_MESSAGE);
                        vista.setNumero1("");
                        vista.setNumero2("");
                        vista.setResultado("");
                    }
                }

            });
        }
        vista.getBtnRedondear().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                redondear();
            }
        });

        vista.getBtnBorrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });

        vista.getBtnHistorial().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarHistorial();
            }
        });
    }

    private boolean esEntero(double numero) {
        return numero == Math.floor(numero) && !Double.isInfinite(numero);
    }

    private void redondear() {
        try{

            double numero = Double.parseDouble(vista.getResultado());
            double numeroRedondeado = Math.round(numero * 100.0) / 100.0;
            vista.setResultado(String.valueOf(numeroRedondeado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(vista, "El resultado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos(){
        vista.setNumero1("");
        vista.setNumero2("");
        vista.setResultado("");
    }

    private void mostrarHistorial() {
        ventanaHistorial.setVisible(true);
    }

}
