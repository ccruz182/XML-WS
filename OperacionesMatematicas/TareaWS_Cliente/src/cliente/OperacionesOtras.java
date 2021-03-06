package cliente;

import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class OperacionesOtras extends javax.swing.JInternalFrame {

  public OperacionesOtras() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jTextFieldNumero = new javax.swing.JTextField();
    jButtonFactorial = new javax.swing.JButton();
    jButtonFibonacci = new javax.swing.JButton();

    jLabel1.setText("Número:");

    jTextFieldNumero.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jTextFieldNumeroKeyTyped(evt);
      }
    });

    jButtonFactorial.setText("Factorial");
    jButtonFactorial.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonFactorialActionPerformed(evt);
      }
    });

    jButtonFibonacci.setText("Fibonacci");
    jButtonFibonacci.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonFibonacciActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jTextFieldNumero)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(0, 0, Short.MAX_VALUE))
          .addComponent(jButtonFactorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonFibonacci, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(jTextFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButtonFactorial)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jButtonFibonacci)
        .addContainerGap(20, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNumeroKeyTyped
    if (Character.isDigit(evt.getKeyChar())) {
      super.processKeyEvent(evt);
      return;
    }

    evt.consume();
  }//GEN-LAST:event_jTextFieldNumeroKeyTyped

  private void jButtonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFactorialActionPerformed
    if (jTextFieldNumero.getText().compareTo("") != 0) {
      int numero = Integer.parseInt(jTextFieldNumero.getText());
      if (numero > 0) {
        int resultado = factorial(numero);
        muestraMensaje("Resultado: " + resultado, "Resultado", 0);
      } else {
        muestraMensaje("El número debe de ser mayor que 0", "ERROR", 1);
      }
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonFactorialActionPerformed

  private void jButtonFibonacciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFibonacciActionPerformed
    if (jTextFieldNumero.getText().compareTo("") != 0) {
      int numero = Integer.parseInt(jTextFieldNumero.getText());
      int resultado = fibonacci(numero);
      muestraMensaje("Resultado: " + resultado, "Resultado", 0);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonFibonacciActionPerformed

  private void muestraMensaje(String contenido, String titulo, int tipo) {
    int msgTipo = 0;
    switch (tipo) {
      case 0:
        msgTipo = JOptionPane.INFORMATION_MESSAGE;
        break;
      case 1:
        msgTipo = JOptionPane.ERROR_MESSAGE;
        break;
    }

    JOptionPane.showMessageDialog(null, contenido, titulo, msgTipo);
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonFactorial;
  private javax.swing.JButton jButtonFibonacci;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JTextField jTextFieldNumero;
  // End of variables declaration//GEN-END:variables

  private static int factorial(int numero) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.factorial(numero);
  }

  private static int fibonacci(int numero) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.fibonacci(numero);
  }
}
