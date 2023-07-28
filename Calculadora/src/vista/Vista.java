package vista;

import javax.swing.*;

public class Vista extends javax.swing.JFrame {

    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JButton btnRedondear;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnHistorial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField Numero1;
    private javax.swing.JTextField Numero2;
    private javax.swing.JTextField Resultado;

    public Vista() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void initComponents() {
        Numero1 = new javax.swing.JTextField();
        Numero2 = new javax.swing.JTextField();
        Resultado = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        btnRedondear = new javax.swing.JButton(); // Initialize the "Redondear" button
        btnBorrar = new javax.swing.JButton(); // Initialize the "Borrar" button
        btnHistorial = new javax.swing.JButton(); // Initialize the "Historial" button
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Numero1.setText("Numero 1");
        Numero1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Numero1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Numero1FocusLost(evt);
            }
        });

        Numero2.setText("Numero 2");
        Numero2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Numero2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Numero2FocusLost(evt);
            }
        });

        Resultado.setEditable(false);

        btnSumar.setText("+");

        btnRestar.setText("-");

        btnMultiplicar.setText("*");

        btnDividir.setText("/");

        btnRedondear.setText("Redondear"); // Set the text for the "Redondear" button
        btnBorrar.setText("Borrar"); // Set the text for the "Borrar" button
        btnHistorial.setText("Historial"); // Set the text for the "Historial" button

        jLabel1.setText("CALCULADORA");
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(110, 110, 110))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Numero2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                                        .addComponent(Numero1)
                                        .addComponent(Resultado)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnRedondear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                                                        .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(btnHistorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnRedondear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnDividir, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                        .addComponent(btnMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(24, 24, 24)
                                .addComponent(btnHistorial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    }

    private void Numero1FocusGained(java.awt.event.FocusEvent evt) {
        if (Numero1.getText().equals("Numero 1")) {
            Numero1.setText("");
        }
    }

    private void Numero1FocusLost(java.awt.event.FocusEvent evt) {
        if (Numero1.getText().isEmpty()) {
            Numero1.setText("Numero 1");
        }
    }

    private void Numero2FocusGained(java.awt.event.FocusEvent evt) {
        if (Numero2.getText().equals("Numero 2")) {
            Numero2.setText("");
        }
    }

    private void Numero2FocusLost(java.awt.event.FocusEvent evt) {
        if (Numero2.getText().isEmpty()) {
            Numero2.setText("Numero 2");
        }
    }

    public JButton getBtnSumar() {
        return btnSumar;
    }

    public JButton getBtnRestar() {
        return btnRestar;
    }

    public JButton getBtnMultiplicar() {
        return btnMultiplicar;
    }

    public JButton getBtnDividir() {
        return btnDividir;
    }

    public JButton getBtnRedondear() {
        return btnRedondear;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public JButton getBtnHistorial() {
        return btnHistorial;
    }

    public JTextField getNumero1() {
        return Numero1;
    }

    public void setNumero1(String numero1) {
        Numero1.setText(numero1);
    }

    public JTextField getNumero2() {
        return Numero2;
    }

    public void setNumero2(String numero2) {
        Numero2.setText(numero2);
    }

    public String getResultado() {
        return Resultado.getText();
    }

    public void setResultado(String resultado) {
        Resultado.setText(resultado);
    }
}
