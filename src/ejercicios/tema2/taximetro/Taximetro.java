/**
 * Proyecto taximetro
 * @author Juan Manuel Lozano Panadero
 * ****************************
 * 
 * Aplicación que toma unas coordenadas de GPS y un destino para proporcionar
 * la ruta deseada además del tiempo, importe del trayecto y otros datos de
 * utilidad para el oficio de traslado de pasajeros.
 */

package ejercicios.tema2.taximetro;

import es.javiergarbedo.coordinateslib.CoordinatesConverter;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;
import org.apache.commons.validator.CreditCardValidator;

public class Taximetro extends javax.swing.JFrame {
    
    /** Cuantia que se aplica al importe al iniciar el recorrido */
    final float TARIFA_INICIO = 1.50f;
    /** Cuantia que se aplica al importe por cada minuto de recorrido */
    final float TARIFA_MINUTO = 0.76f;
    /** Porcentaje de IVA que se aplica a la cuantía */
    final int PORCENTAJE_IVA = 21;
    /** Contador para el número de ticket expedido. */
    int numTicket = 0;
    Calendar calendarInicio;

    public Taximetro() {

        //Inicialización de la aplicación.
        initComponents();
        ticket.setText("Introduzca un destino.");
        botonFin.setEnabled(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoLongitud = new javax.swing.JTextField();
        campoLatitud = new javax.swing.JTextField();
        campoConvertidoLatitud = new javax.swing.JLabel();
        campoConvertidoLongitud = new javax.swing.JLabel();
        imagenLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoDestino = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ticket = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        campoTarjetaCredito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();
        botonFin = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        mapa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Posición GPS Inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel2.setText("Latitud:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setText("Longitud:");

        campoLongitud.setText("-5.444740");
        campoLongitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLongitudActionPerformed(evt);
            }
        });

        campoLatitud.setText("36.679619");
        campoLatitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLatitudActionPerformed(evt);
            }
        });

        campoConvertidoLatitud.setText("36º40'46\"");

        campoConvertidoLongitud.setText("-5º26'41\"");

        imagenLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/imagen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoConvertidoLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(campoLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoConvertidoLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(campoLatitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConvertidoLatitud))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(campoLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConvertidoLongitud))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(imagenLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del trayecto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel7.setText("Destino:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDestino)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        ticket.setEditable(false);
        ticket.setColumns(20);
        ticket.setRows(5);
        jScrollPane1.setViewportView(ticket);

        jLabel8.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel8.setText("Tarjeta de crédito:");

        jButton1.setText("Comprobar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/flag.png"))); // NOI18N
        botonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioActionPerformed(evt);
            }
        });

        botonFin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cruz.png"))); // NOI18N
        botonFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Mapa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        mapa.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mapa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(botonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoTarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTarjetaCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonFin, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
      /**
       * Boton de inicio de recorridio.
       */
    private void botonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioActionPerformed

        /**
         * Comprobamos si el campo de texto está vacio, en caso afirmativo
         * avisamos de ello con una ventana emegente, de lo contrario se
         * ejecutaría el código
         */
        if (campoDestino.getText().equals("")) {
            System.out.println("Debe introducir un destino.");
            JOptionPane.showMessageDialog(this, "Debe introducir un destino.",
                                          "titulo", JOptionPane.ERROR_MESSAGE);
        } else {
            botonInicio.setEnabled(false);
            botonFin.setEnabled(true);
            ticket.setText("");
            numTicket++;
            calendarInicio = Calendar.getInstance();

            String origen = campoLatitud.getText() + "," + campoLongitud.getText();
            String destino = campoDestino.getText();
            destino = destino.replaceAll(" ", "%20");
            javax.swing.JLabel jLabelMapa = mapa;
            int tamHorizontal = 200;
            int tamVertical = 200;

            campoConvertidoLatitud.setText(CoordinatesConverter.decimalToDMS
                                          (Double.valueOf(campoLatitud.getText())));
            campoConvertidoLongitud.setText(CoordinatesConverter.decimalToDMS
                                           (Double.valueOf(campoLongitud.getText())));

            try {
                String txtDireccionImagenMapa = "http://maps.google.com/maps/api/staticmap?path="
                        + origen + "|" + destino + "&size=" + tamHorizontal + "x" + tamVertical
                        + "&language=ES&sensor=false";
                System.out.println(txtDireccionImagenMapa);
                java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();
                java.awt.Image imagenMapa = toolkit.getImage(new java.net.URL(txtDireccionImagenMapa));
                jLabelMapa.setIcon(new javax.swing.ImageIcon(imagenMapa));
            } catch (java.net.MalformedURLException e) {
                javax.swing.JOptionPane.showMessageDialog(this, "La dirección de imagen indicada no es correcta");
            }
        }

    }//GEN-LAST:event_botonInicioActionPerformed

    /**
     * Boton de parada de recorrido
     */
    private void botonFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinActionPerformed

        /**
         * El botón de parada se encargará de imprimir el número de ticket, la
         * fecha, duración de trayecto e importes.
         */
        
        // Desactivamos el boton de inicio y activamos el de parada. 
        botonInicio.setEnabled(true);
        botonFin.setEnabled(false);

        ticket.append("TICKET \n");
        ticket.append("============== \n");

        // Mostrar numero del ticket.
        NumberFormat formato = NumberFormat.getNumberInstance();
        formato.setMinimumIntegerDigits(5);
        formato.setGroupingUsed(false);
        ticket.append("Nº ticket: " + formato.format(numTicket) + "\n");

        /**
         * Obtenemos la fecha, calculamos la duración y añadimos al campo del
         * ticket todos los datos.
         */
        Calendar calendarFin = Calendar.getInstance();
        DateFormat formatoFecha = DateFormat.getDateInstance(DateFormat.MEDIUM);
        ticket.append("Fecha: " + formatoFecha.format(calendarInicio.getTime()) + "\n"
        + "Hora bajada bandera: " + DateFormatUtils.format(calendarInicio, "HH:mm:ss") + "\n"
        + "Hora fin trayecto: " + DateFormatUtils.format(calendarFin, "HH:mm:ss") + "\n"
        + "Duración trayecto: " + DurationFormatUtils.formatPeriod(calendarInicio.getTimeInMillis(),
                calendarFin.getTimeInMillis(), "HH:mm:ss") + "\n"
        + "Tarifa por minuto: " + TARIFA_MINUTO + "\n \n");

        // Calculamos el importe y lo añadimos al campo del ticket.
        float importe = Float.valueOf(DurationFormatUtils.formatPeriod
                                     (calendarInicio.getTimeInMillis(),
                                      calendarFin.getTimeInMillis(),"mm"))
                                      * TARIFA_MINUTO + TARIFA_INICIO;
        ticket.append("Importe: " + importe + "\n");

        float iva = importe * PORCENTAJE_IVA / 100;
        formato.setMinimumIntegerDigits(1);
        formato.setMaximumFractionDigits(2);

        ticket.append("IVA: " + formato.format(iva) + "\n");
        ticket.append("Importe total: " + formato.format(importe + iva));
    }//GEN-LAST:event_botonFinActionPerformed

    private void campoLatitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLatitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLatitudActionPerformed

    private void campoLongitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLongitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoLongitudActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CreditCardValidator validadorTarjeta = new CreditCardValidator();

        if (campoTarjetaCredito.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe introducir un valor en el campo.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            if (validadorTarjeta.isValid(campoTarjetaCredito.getText())) {
                JOptionPane.showMessageDialog(this, "Tarjeta de crédito aceptada.",
                        "Aceptada", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(this, "Tarjeta de crédito rechazada.",
                        "Rechazada", JOptionPane.OK_OPTION);
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Taximetro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Taximetro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFin;
    private javax.swing.JButton botonInicio;
    private javax.swing.JLabel campoConvertidoLatitud;
    private javax.swing.JLabel campoConvertidoLongitud;
    private javax.swing.JTextField campoDestino;
    private javax.swing.JTextField campoLatitud;
    private javax.swing.JTextField campoLongitud;
    private javax.swing.JTextField campoTarjetaCredito;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mapa;
    private javax.swing.JTextArea ticket;
    // End of variables declaration//GEN-END:variables
}
