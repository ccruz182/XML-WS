package cliente;

import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public class OperacionesProbabilidad extends javax.swing.JInternalFrame {

  DefaultListModel model;  

  public OperacionesProbabilidad() {
    initComponents();
    model = new DefaultListModel();
    jListValores.setModel(model);
    setModoBotones(false);
  }


  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jScrollPane1 = new javax.swing.JScrollPane();
    jListValores = new javax.swing.JList<>();
    jLabel1 = new javax.swing.JLabel();
    jTextFieldValor = new javax.swing.JTextField();
    jButtonAgregar = new javax.swing.JButton();
    jButtonQuitar = new javax.swing.JButton();
    jButtonPromedio = new javax.swing.JButton();
    jButtonDM = new javax.swing.JButton();
    jButtonDE = new javax.swing.JButton();

    jScrollPane1.setViewportView(jListValores);

    jLabel1.setText("Valor:");

    jTextFieldValor.addKeyListener(new java.awt.event.KeyAdapter() {
      public void keyTyped(java.awt.event.KeyEvent evt) {
        jTextFieldValorKeyTyped(evt);
      }
    });

    jButtonAgregar.setText("Agregar");
    jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonAgregarActionPerformed(evt);
      }
    });

    jButtonQuitar.setText("Quitar");
    jButtonQuitar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonQuitarActionPerformed(evt);
      }
    });

    jButtonPromedio.setText("Promedio");
    jButtonPromedio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonPromedioActionPerformed(evt);
      }
    });

    jButtonDM.setText("Desviacion Media");
    jButtonDM.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonDMActionPerformed(evt);
      }
    });

    jButtonDE.setText("Desviacion Estandar");
    jButtonDE.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButtonDEActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTextFieldValor))
          .addGroup(layout.createSequentialGroup()
            .addComponent(jButtonAgregar)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButtonQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          .addComponent(jButtonPromedio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonDM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jButtonDE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
            .addGap(22, 22, 22)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel1)
              .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jButtonAgregar)
              .addComponent(jButtonQuitar))
            .addGap(18, 18, 18)
            .addComponent(jButtonPromedio)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButtonDM)
            .addGap(18, 18, 18)
            .addComponent(jButtonDE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jTextFieldValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldValorKeyTyped
    if (Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '.') {
      super.processKeyEvent(evt);
      return;
    }

    evt.consume();
  }//GEN-LAST:event_jTextFieldValorKeyTyped

  private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
    if (jTextFieldValor.getText().compareTo("") != 0) {
      double valor = Double.parseDouble(jTextFieldValor.getText());
      model.add(model.size(), valor);
      setModoBotones(true);
    } else {
      muestraMensaje("No se ingreso un numero", "ERROR", 1);
    }
  }//GEN-LAST:event_jButtonAgregarActionPerformed

  private void jButtonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQuitarActionPerformed
    int index = jListValores.getSelectedIndex();
    if (index != -1) {
      model.remove(index);
    } else {
      muestraMensaje("No se selecciono item", "ERROR", 1);
    }
    
    if (model.getSize() == 0) {
      setModoBotones(false);
    }
  }//GEN-LAST:event_jButtonQuitarActionPerformed

  private void jButtonPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPromedioActionPerformed
    hacerOperacion(0);   
  }//GEN-LAST:event_jButtonPromedioActionPerformed

  private void jButtonDMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDMActionPerformed
    hacerOperacion(1);
  }//GEN-LAST:event_jButtonDMActionPerformed

  private void jButtonDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDEActionPerformed
    hacerOperacion(2);
  }//GEN-LAST:event_jButtonDEActionPerformed

  private ArrayList<Double> convertirEnArrayList() {
    ArrayList<Double> valores = new ArrayList<>();
    
    for (int i = 0; i < model.getSize(); i++) {
      valores.add((Double) model.getElementAt(i));
    }
    
    return valores;
  }
  
  private void hacerOperacion(int tipo) {
    ArrayList<Double> valores = convertirEnArrayList();
    double resultado = 0;
    
    switch (tipo) {
      case 0:
        resultado = promedio(valores);
        break;
      case 1:
        resultado = desvMedia(valores);
        break;
      case 2:
        resultado = desvEstandar(valores);
        break;      
    }
    muestraMensaje("Resultado: " + resultado, "Resultado", 0);
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
  
  private void setModoBotones(boolean modo) {
    jButtonPromedio.setEnabled(modo);
    jButtonDE.setEnabled(modo);
    jButtonDM.setEnabled(modo);
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButtonAgregar;
  private javax.swing.JButton jButtonDE;
  private javax.swing.JButton jButtonDM;
  private javax.swing.JButton jButtonPromedio;
  private javax.swing.JButton jButtonQuitar;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JList<String> jListValores;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextField jTextFieldValor;
  // End of variables declaration//GEN-END:variables

  private static double promedio(java.util.List<java.lang.Double> datos) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.promedio(datos);
  }

  private static double desvMedia(java.util.List<java.lang.Double> datos) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.desvMedia(datos);
  }

  private static double desvEstandar(java.util.List<java.lang.Double> datos) {
    webService.WSOperaciones_Service service = new webService.WSOperaciones_Service();
    webService.WSOperaciones port = service.getWSOperacionesPort();
    return port.desvEstandar(datos);
  }


}