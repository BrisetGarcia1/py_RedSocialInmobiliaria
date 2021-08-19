/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PgkPresentacion;

import PkgEntidad.ClsReservaE;
import PkgNegocio.ClsReservaN;
import java.awt.Image;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author smoke
 */
public class FrmRealizarReserva extends javax.swing.JFrame {

    /**
     * Creates new form FrmRealizarReserva
     */
    public static String InmuId;
    public static int IdPer;
    public static String IdUsu;
    public static String Nomb;
    public static String direccion;
    public static String nroHa;
    public static String ciudad;
    public static String descripcion;
    public static String categoria;
    public static String precio;
    public static JLabel Foto;
    public static String celular;
    public static String fecha2;
    public static String fecha1;
    public FrmRealizarReserva() {
        initComponents();
        InmuId = FrmPublico.inmcod;
        direccion = FrmPublico.Direccion;
        nroHa = FrmPublico.NroHa;
        ciudad = FrmPublico.Ciudad;
        categoria = FrmPublico.Categoria;
        descripcion = FrmPublico.Descripcion;
        precio = FrmPublico.Precio;
        Foto = FrmPublico.foto;
        IdUsu = FrmPublico.codper;
        
        lblCod.setText(InmuId);
        lblDireccion.setText(direccion);
        lblNroHabitaciones.setText(nroHa);
        lblCiudad.setText(ciudad);
        lblCategoria.setText(categoria);
        lblDescripcion.setText(descripcion);
        lblPrecio.setText(precio);
        
        
        ImageIcon iconImage = (ImageIcon) Foto.getIcon();
        
        Image imgJL = iconImage.getImage().getScaledInstance(Jimagen.getWidth(), Jimagen.getHeight(), Image.SCALE_SMOOTH);
        Jimagen.setIcon(new ImageIcon(imgJL));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDireccion = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        btnReservar = new LIB.FSButtonMD();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCod = new javax.swing.JLabel();
        FechSalida = new com.toedter.calendar.JDateChooser();
        FechInicio = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        lblCod1 = new javax.swing.JLabel();
        lblCod2 = new javax.swing.JLabel();
        lblCod3 = new javax.swing.JLabel();
        lblCod4 = new javax.swing.JLabel();
        lblNroHabitaciones = new javax.swing.JLabel();
        lblCod5 = new javax.swing.JLabel();
        lblCiudad = new javax.swing.JLabel();
        lblCod6 = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        Jimagen = new LIB.JEImagePanel();
        btnRegresar = new LIB.FSButtonMD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Agregar Reservas ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDireccion.setText("Casa privada en Miraflores");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 140, 20));

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrecio.setText("S/. 999 soles");
        jPanel2.add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 120, 30));

        lblDescripcion.setText("Cuenta con 2 baños privados, cocina ");
        jPanel2.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 200, 40));

        btnReservar.setBackground(new java.awt.Color(0, 0, 0));
        btnReservar.setBorder(new javax.swing.border.MatteBorder(null));
        btnReservar.setText("Reservar");
        btnReservar.setColorNormal(new java.awt.Color(0, 0, 0));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel2.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 170, -1));

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.setText("estoy interesado en alquilar \nla propiedad quisiera mas detalles\n");
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 320, 100));

        jLabel4.setText("Descripcion:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel2.setText("Fecha Llegada:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, -1));

        jLabel3.setText("Fecha Salida:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, -1, -1));

        lblCod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod.setText("12");
        jPanel2.add(lblCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));
        jPanel2.add(FechSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 130, -1));
        jPanel2.add(FechInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 130, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("S/");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 20, 30));

        lblCod1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod1.setText("Descripcion:");
        jPanel2.add(lblCod1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        lblCod2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod2.setText("Codigo:");
        jPanel2.add(lblCod2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lblCod3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod3.setText("Categoria:");
        jPanel2.add(lblCod3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        lblCod4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod4.setText("Direccion:");
        jPanel2.add(lblCod4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        lblNroHabitaciones.setText("0");
        jPanel2.add(lblNroHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        lblCod5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod5.setText("Habitaciones:");
        jPanel2.add(lblCod5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        lblCiudad.setText("Tacna");
        jPanel2.add(lblCiudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        lblCod6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCod6.setText("Ciudad:");
        jPanel2.add(lblCod6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        lblCategoria.setText("Categoria");
        jPanel2.add(lblCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, -1));

        javax.swing.GroupLayout JimagenLayout = new javax.swing.GroupLayout(Jimagen);
        Jimagen.setLayout(JimagenLayout);
        JimagenLayout.setHorizontalGroup(
            JimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        JimagenLayout.setVerticalGroup(
            JimagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        jPanel2.add(Jimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 220, 180));

        btnRegresar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegresar.setBorder(new javax.swing.border.MatteBorder(null));
        btnRegresar.setText("Regresar");
        btnRegresar.setColorNormal(new java.awt.Color(0, 0, 0));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 170, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 770, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        // TODO add your handling code here:
        Date  fechaIni=FechInicio.getDate();
        DateFormat f=new SimpleDateFormat("dd-MM-yyyy");
        fecha2=f.format(fechaIni);
        
        Date  fechaFin=FechSalida.getDate();
        DateFormat ff=new SimpleDateFormat("dd-MM-yyyy");
        fecha1=ff.format(fechaFin);
        ClsReservaE objReE=new  ClsReservaE();
        ClsReservaN objReN=new ClsReservaN();
        objReE.setInmueble_id(Integer.parseInt(lblCod.getText()));
        objReE.setFechaI(fecha2);
        objReE.setFechF(fecha1);
        objReE.setEstado("Espera");
        objReE.setDescripcion(txtDescripcion.getText());
        objReE.setPersona_id(IdPer);
        objReE.setNombre(Nomb);
        objReE.setCelular(celular);
        objReE.setIdusu(Integer.parseInt(IdUsu));
        if (objReN.MtdRegistrarReserva(objReE)== true) {
            JOptionPane.showMessageDialog(null, "Reserva Guardada...");
            MtdLimpiar();
        }else{
            JOptionPane.showMessageDialog(null, "Error de Datos...");
        }
    }//GEN-LAST:event_btnReservarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        FrmPrincipal frm=new FrmPrincipal();
                frm.show();
                this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRealizarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRealizarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRealizarReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechInicio;
    private com.toedter.calendar.JDateChooser FechSalida;
    private LIB.JEImagePanel Jimagen;
    private LIB.FSButtonMD btnRegresar;
    private LIB.FSButtonMD btnReservar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblCiudad;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCod1;
    private javax.swing.JLabel lblCod2;
    private javax.swing.JLabel lblCod3;
    private javax.swing.JLabel lblCod4;
    private javax.swing.JLabel lblCod5;
    private javax.swing.JLabel lblCod6;
    private javax.swing.JLabel lblDescripcion;
    public javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNroHabitaciones;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextArea txtDescripcion;
    // End of variables declaration//GEN-END:variables

    private void MtdLimpiar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}