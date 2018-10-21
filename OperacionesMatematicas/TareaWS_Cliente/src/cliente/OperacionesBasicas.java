package cliente;

import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class OperacionesBasicas extends javax.swing.JInternalFrame {

  public OperacionesBasicas() {
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

    jTextFieldNum1 = new javax.swing.JTextField();
    jTextFieldNum2 = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
    jButtonRestar = new javax.swing.JButton();
    jButtonMulti = new javax.swing.JButton();
    jButtonDividir = new javax.swing.JButton();
    jButtonSumar = new javax.swing.JButton();

    jTextFieldNum1.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jTextFieldNum1KeyTyped(evt);
      }
    });

    jTextFieldNum2.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jTextFieldNum2KeyTyped(evt);
      }
    });

    jLabel1.setText("Número 1:");

    jLabel2.setText("Número 2:");

    jButtonRestar.setText("RESTAR");
    jButtonRestar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonRestarActionPerformed(evt);
      }
    });

    jButtonMulti.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
    jButtonMulti.setText("MULTIPLICAR");
    jButtonMulti.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonMultiActionPerformed(evt);
      }
    });

    jButtonDividir.setText("DIVIDIR");
    jButtonDividir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonDividirActionPerformed(evt);
      }
    });

    jButtonSumar.setText("SUMAR");
    jButtonSumar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonSumarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(jLabel1)
              .addComponent(jLabel2))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(layout.createSequentialGroup()
                .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
              .addComponent(jTextFieldNum2)))
          .addGroup(layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButtonMulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButtonSumar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jButtonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(29, 29, 29))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(24, 24, 24)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel1))
        .addGap(26, 26, 26)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jTextFieldNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel2))
        .addGap(28, 28, 28)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButtonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButtonMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jButtonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(24, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldNum1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNum1KeyTyped
    soloNumeros(evt);
  }//GEN-LAST:event_jTextFieldNum1KeyTyped

  private void jTextFieldNum2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNum2KeyTyped
    soloNumeros(evt);
  }//GEN-LAST:event_jTextFieldNum2KeyTyped

  private void jButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSumarActionPerformed
    if (hayNumeros()) {
      operacionesBasicas(0);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonSumarActionPerformed

  private void jButtonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestarActionPerformed
    if (hayNumeros()) {
      operacionesBasicas(1);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonRestarActionPerformed

  private void jButtonMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultiActionPerformed
    if (hayNumeros()) {
      operacionesBasicas(2);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonMultiActionPerformed

  private void jButtonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDividirActionPerformed
    if (hayNumeros()) {
      operacionesBasicas(3);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonDividirActionPerformed

  private void soloNumeros(java.awt.event.KeyEvent evt) {
    if (Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.') {
      super.processKeyEvent(evt);
      return;
    }

    evt.consume();
  }

  private double[] obtenerNumeros() {
    double[] numeros = new double[2];
    numeros[0] = Double.parseDouble(jTextFieldNum1.getText());
    numeros[1] = Double.parseDouble(jTextFieldNum2.getText());

    return numeros;
  }

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

  private void operacionesBasicas(int tipo) {
    double[] numeros = obtenerNumeros();
    double resultado = 0;
    
    switch (tipo) {
      case 0:
        resultado = sumar((int) numeros[0], (int) numeros[1]);
        break;
      case 1:
        resultado = restar((int) numeros[0], (int) numeros[1]);
        break;
      case 2:
        resultado = multiplicar((int) numeros[0], (int) numeros[1]);
        break;
      case 3:
        if (numeros[1] != 0) {
          resultado = dividir((int) numeros[0], (int) numeros[1]);
        } else {
          muestraMensaje("Division entre cero", "ERROR", 1);
          return;
        }
        break;

    }

    muestraMensaje("Resultado: " + resultado, "Resultado", 0);

  }

  private boolean tieneContenido(String txtField) {
    return txtField.compareTo("") != 0;
  }

  private boolean hayNumeros() {
    System.out.println("-> " + jTextFieldNum1.getText());
    return (tieneContenido(jTextFieldNum1.getText())
            && tieneContenido(jTextFieldNum2.getText()));
  }

  /* Referencia al WS */

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonDividir;
  private javax.swing.JButton jButtonMulti;
  private javax.swing.JButton jButtonRestar;
  private javax.swing.JButton jButtonSumar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JTextField jTextFieldNum1;
  private javax.swing.JTextField jTextFieldNum2;
  // End of variables declaration//GEN-END:variables

  private static int sumar(int x, int y) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.sumar(x, y);
  }

  private static int restar(int x, int y) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.restar(x, y);
  }

  private static int multiplicar(int x, int y) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.multiplicar(x, y);
  }

  private static double dividir(int x, int y) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.dividir(x, y);
  }
}
