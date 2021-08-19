/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PgkPresentacion;
import PkgNegocio.ClsConexion;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author CarlosM
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public static String tipoUsu = "Invitado";
    public static String Nom;
    public static String Ape;
    public static String Est;
    public static int idusu;
    public FrmPrincipal() {
        initComponents();
        lblNombre.setText(Nom);
        lblApellido.setText(Ape);
        lblEstado.setText(Est);
        lblNivel.setText(tipoUsu);
        if (tipoUsu.equals("Administrador")) {
            //Botones Usuario
             btnAgregarInmueble.setVisible(false);
             btnSitiosPublicados.setVisible(false);
             btnEditarInmuebles.setVisible(false);
             btnReservaSInmuebles.setVisible(false);
             btnCerrarUsu.setVisible(false);
            //Botones invitado
             btnVerReservas.setVisible(false);
             btnPreguntasFre.setVisible(false);
             btnCerrarInvi.setVisible(false);
             btnRegistrar.setVisible(false);
        }
        else if (tipoUsu.equals("Arrendador")) {
            //botones Admin
             btnPublicarIn.setVisible(false);
             btnRegistrarUsu.setVisible(false);
             btnGestionarUsu.setVisible(false);
             btnCerrarAdmin.setVisible(false);
             //Botones invitado
             btnVerReservas.setVisible(false);
             btnPreguntasFre.setVisible(false);
             btnCerrarInvi.setVisible(false);
             btnRegistrar.setVisible(false);
        }
        else if (tipoUsu.equals("Arrendatario")) {
        //Botones Usuario
             btnAgregarInmueble.setVisible(false);
             btnSitiosPublicados.setVisible(false);
             btnEditarInmuebles.setVisible(false);
             btnReservaSInmuebles.setVisible(false);
             btnCerrarUsu.setVisible(false);
             //botones Admin
             btnPublicarIn.setVisible(false);
             btnRegistrarUsu.setVisible(false);
             btnGestionarUsu.setVisible(false);
             btnCerrarAdmin.setVisible(false);
             btnRregistro.setVisible(false);
             btnRInmuebles.setVisible(false);
             btnRreservas.setVisible(false);
             btnRUsuario.setVisible(false);
             ////Botones invitado
             btnRegistrar.setVisible(false);
             
             
             
        }
        else{
            //Botones Usuario
             btnAgregarInmueble.setVisible(false);
             btnSitiosPublicados.setVisible(false);
             btnEditarInmuebles.setVisible(false);
             btnReservaSInmuebles.setVisible(false);
             btnCerrarUsu.setVisible(false);
             //botones Admin
             btnPublicarIn.setVisible(false);
             btnRegistrarUsu.setVisible(false);
             btnGestionarUsu.setVisible(false);
             btnCerrarAdmin.setVisible(false);
             btnRregistro.setVisible(false);
             btnRInmuebles.setVisible(false);
             btnRreservas.setVisible(false);
             btnRUsuario.setVisible(false);
             //Arrendatario
             btnVerReservas.setVisible(false);
             
             
        }
        FrmPublico objPu=new FrmPublico();
        Principal.add(objPu);
        objPu.show();
       

            
        
        
        
       
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
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fSTexFieldMD1 = new LIB.FSTexFieldMD();
        fSTexFieldMD2 = new LIB.FSTexFieldMD();
        fSTexFieldMD3 = new LIB.FSTexFieldMD();
        fSTexFieldMD4 = new LIB.FSTexFieldMD();
        btnBuscar = new LIB.FSButtonMD();
        btnCerrarAdmin = new LIB.FSButtonMD();
        btnRegistrarUsu = new LIB.FSButtonMD();
        btnPublicarIn = new LIB.FSButtonMD();
        jEImagePanel2 = new LIB.JEImagePanel();
        jEImagePanel1 = new LIB.JEImagePanel();
        jEImagePanel9 = new LIB.JEImagePanel();
        btnAgregarInmueble = new LIB.FSButtonMD();
        btnCerrarUsu = new LIB.FSButtonMD();
        btnPreguntasFre = new LIB.FSButtonMD();
        btnVerReservas = new LIB.FSButtonMD();
        btnEditarInmuebles = new LIB.FSButtonMD();
        btnSitiosPublicados = new LIB.FSButtonMD();
        btnGestionarUsu = new LIB.FSButtonMD();
        lblEstado = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblNivel = new javax.swing.JLabel();
        Principal = new javax.swing.JDesktopPane();
        btnRegistrar = new LIB.FSButtonMD();
        btnReservaSInmuebles = new LIB.FSButtonMD();
        btnIniciarSesion = new LIB.FSButtonMD();
        btnCerrarInvi = new LIB.FSButtonMD();
        btnRreservas = new javax.swing.JButton();
        btnRregistro = new javax.swing.JButton();
        btnRInmuebles = new javax.swing.JButton();
        btnRUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Categoria");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, -1, -1));

        jLabel2.setText("Ubicacion");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel3.setText("Habitaciones");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel4.setText("Precio");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, 20));

        fSTexFieldMD1.setForeground(new java.awt.Color(0, 0, 0));
        fSTexFieldMD1.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        fSTexFieldMD1.setPlaceholder("Departamento");
        jPanel3.add(fSTexFieldMD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 40, 120, 40));

        fSTexFieldMD2.setForeground(new java.awt.Color(0, 0, 0));
        fSTexFieldMD2.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        fSTexFieldMD2.setPlaceholder("Tacna");
        jPanel3.add(fSTexFieldMD2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, 40));

        fSTexFieldMD3.setForeground(new java.awt.Color(0, 0, 0));
        fSTexFieldMD3.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        fSTexFieldMD3.setPlaceholder("2");
        jPanel3.add(fSTexFieldMD3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 120, 40));

        fSTexFieldMD4.setForeground(new java.awt.Color(0, 0, 0));
        fSTexFieldMD4.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        fSTexFieldMD4.setPlaceholder("S/. 999");
        jPanel3.add(fSTexFieldMD4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 120, 40));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setBorder(new javax.swing.border.MatteBorder(null));
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PkgImagenes/search.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 110, 60));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 720, 90));

        btnCerrarAdmin.setBackground(new java.awt.Color(102, 153, 255));
        btnCerrarAdmin.setText("Cerrar Sesion");
        btnCerrarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarAdminActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        btnRegistrarUsu.setBackground(new java.awt.Color(102, 153, 255));
        btnRegistrarUsu.setText("Registrar Usuario");
        btnRegistrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));

        btnPublicarIn.setBackground(new java.awt.Color(102, 153, 255));
        btnPublicarIn.setText("Publicar Inmueble");
        btnPublicarIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarInActionPerformed(evt);
            }
        });
        jPanel1.add(btnPublicarIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        jEImagePanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PkgImagenes/064-user-2.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel2Layout = new javax.swing.GroupLayout(jEImagePanel2);
        jEImagePanel2.setLayout(jEImagePanel2Layout);
        jEImagePanel2Layout.setHorizontalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );
        jEImagePanel2Layout.setVerticalGroup(
            jEImagePanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 40, 110, 100));

        jEImagePanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PkgImagenes/111-minus.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel1Layout = new javax.swing.GroupLayout(jEImagePanel1);
        jEImagePanel1.setLayout(jEImagePanel1Layout);
        jEImagePanel1Layout.setHorizontalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jEImagePanel1Layout.setVerticalGroup(
            jEImagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 270, 290, 30));

        jEImagePanel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PkgImagenes/Logo1_1.png"))); // NOI18N

        javax.swing.GroupLayout jEImagePanel9Layout = new javax.swing.GroupLayout(jEImagePanel9);
        jEImagePanel9.setLayout(jEImagePanel9Layout);
        jEImagePanel9Layout.setHorizontalGroup(
            jEImagePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jEImagePanel9Layout.setVerticalGroup(
            jEImagePanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        jPanel1.add(jEImagePanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, 110));

        btnAgregarInmueble.setText("Agregar Inmueble");
        btnAgregarInmueble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarInmuebleActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarInmueble, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, 40));

        btnCerrarUsu.setText("Cerrar Sesion");
        btnCerrarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, -1, -1));

        btnPreguntasFre.setBackground(new java.awt.Color(255, 51, 51));
        btnPreguntasFre.setText("Preguntas Frecuentes");
        btnPreguntasFre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreguntasFreActionPerformed(evt);
            }
        });
        jPanel1.add(btnPreguntasFre, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));

        btnVerReservas.setBackground(new java.awt.Color(255, 51, 51));
        btnVerReservas.setText("Ver Reservas");
        btnVerReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerReservasActionPerformed(evt);
            }
        });
        jPanel1.add(btnVerReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        btnEditarInmuebles.setText("Editar Inmueble");
        btnEditarInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInmueblesActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        btnSitiosPublicados.setText("Sitios Publicados");
        btnSitiosPublicados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSitiosPublicadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnSitiosPublicados, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 370, -1, -1));

        btnGestionarUsu.setBackground(new java.awt.Color(102, 153, 255));
        btnGestionarUsu.setText("Gestioanar Usuario");
        btnGestionarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarUsuActionPerformed(evt);
            }
        });
        jPanel1.add(btnGestionarUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        lblEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblEstado.setText("-------------------------------");
        jPanel1.add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Apellido:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 200, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Nivel:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Estado:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 250, -1, -1));

        lblNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNombre.setText("-------------------------------");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 170, -1, -1));

        lblApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblApellido.setText("-------------------------------");
        jPanel1.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 200, -1, -1));

        lblNivel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNivel.setText("-------------------------------");
        jPanel1.add(lblNivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 230, -1, -1));

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 810, 540));

        btnRegistrar.setBackground(new java.awt.Color(255, 51, 51));
        btnRegistrar.setText("Registrarme");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 430, -1, -1));

        btnReservaSInmuebles.setText("Reservas de Inmuebles");
        btnReservaSInmuebles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaSInmueblesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservaSInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        btnIniciarSesion.setBackground(new java.awt.Color(255, 51, 51));
        btnIniciarSesion.setText("Iniciar Sesion");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 310, -1, -1));

        btnCerrarInvi.setBackground(new java.awt.Color(255, 51, 51));
        btnCerrarInvi.setText("Cerrar Sesion");
        btnCerrarInvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarInviActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrarInvi, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 490, -1, -1));

        btnRreservas.setText("Reporte Reservas");
        jPanel1.add(btnRreservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 660, 120, 30));

        btnRregistro.setText("Reporte Regitros");
        btnRregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRregistroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRregistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 620, 120, 30));

        btnRInmuebles.setText("Reporte Inmuebles");
        jPanel1.add(btnRInmuebles, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 620, 130, 30));

        btnRUsuario.setText("Reporte Usuario");
        jPanel1.add(btnRUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 660, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1165, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerReservasActionPerformed
        // TODO add your handling code here:
       FrmReservasInmuebles objAI=new FrmReservasInmuebles();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnVerReservasActionPerformed

    private void btnCerrarInviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarInviActionPerformed
        // TODO add your handling code here:
        FrmLogin frm=new FrmLogin();
                    frm.show();
                    dispose(); 
    }//GEN-LAST:event_btnCerrarInviActionPerformed

    private void btnPreguntasFreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreguntasFreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPreguntasFreActionPerformed

    private void btnCerrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarUsuActionPerformed
        // TODO add your handling code here:
        FrmLogin frm=new FrmLogin();
                    frm.show();
                    dispose(); 
    }//GEN-LAST:event_btnCerrarUsuActionPerformed

    private void btnCerrarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarAdminActionPerformed
        // TODO add your handling code here:
        FrmLogin frm=new FrmLogin();
                    frm.show();
                    dispose(); 
    }//GEN-LAST:event_btnCerrarAdminActionPerformed

    private void btnAgregarInmuebleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarInmuebleActionPerformed
        // TODO add your handling code here:
        FrmAgregarInmueble objAI=new FrmAgregarInmueble();
        Principal.add(objAI);
        objAI.show();
          
    }//GEN-LAST:event_btnAgregarInmuebleActionPerformed

    private void btnEditarInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInmueblesActionPerformed
        // TODO add your handling code here:
        FrmEditarInmueble objAI=new FrmEditarInmueble();
        Principal.add(objAI);
        objAI.show();
          
    }//GEN-LAST:event_btnEditarInmueblesActionPerformed

    private void btnSitiosPublicadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSitiosPublicadosActionPerformed
        // TODO add your handling code here:
        FrmInmueblesPublicados objAI=new FrmInmueblesPublicados();
        Principal.add(objAI);
        objAI.show();
        
    }//GEN-LAST:event_btnSitiosPublicadosActionPerformed

    private void btnReservaSInmueblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaSInmueblesActionPerformed
        // TODO add your handling code here:
        FrmReservasInmuebles objAI=new FrmReservasInmuebles();
        Principal.add(objAI);
        objAI.show();
        
    }//GEN-LAST:event_btnReservaSInmueblesActionPerformed

    private void btnRegistrarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuActionPerformed
        // TODO add your handling code here:
        FrmRegistrarUsuario objAI=new FrmRegistrarUsuario();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnRegistrarUsuActionPerformed

    private void btnPublicarInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarInActionPerformed
        // TODO add your handling code here:
        FrmPublicarInmueble objAI=new FrmPublicarInmueble();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnPublicarInActionPerformed

    private void btnGestionarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarUsuActionPerformed
        // TODO add your handling code here:
        FrmGestionarUsuario objAI=new FrmGestionarUsuario();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnGestionarUsuActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        FrmRegistrarUsuario objAI=new FrmRegistrarUsuario();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        FrmLogin frm=new FrmLogin();
                    frm.show();
                    dispose(); 
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        FrmPublico objAI=new FrmPublico();
        Principal.add(objAI);
        objAI.show();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRregistroActionPerformed
        // TODO add your handling code here:
       String JXML = "src/PkgReporte/HistorialRegistro.jrxml";
    JasperPrint jasperPrint = null;
    InputStream inputStream = null;
    Map<String, Object> parametros;

    parametros = new HashMap<String, Object>();
   

    try {
      inputStream = new FileInputStream(JXML);
      JasperDesign jasperDesing = JRXmlLoader.load(inputStream);
      JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesing);

     
      jasperPrint = JasperFillManager.fillReport(jasperReport, parametros, ClsConexion.Conectar());

      
    } catch (JRException | FileNotFoundException e) {
      JOptionPane.showMessageDialog(
          null, "Error al leer el fichero de carga jasper report " + e.getMessage());
    }

    // MOSTRAR REPORTE
    JasperViewer view = new JasperViewer(jasperPrint, false);
    view.setTitle("Historial de Registro");
    view.setVisible(true);
    }//GEN-LAST:event_btnRregistroActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane Principal;
    private LIB.FSButtonMD btnAgregarInmueble;
    private LIB.FSButtonMD btnBuscar;
    private LIB.FSButtonMD btnCerrarAdmin;
    private LIB.FSButtonMD btnCerrarInvi;
    private LIB.FSButtonMD btnCerrarUsu;
    private LIB.FSButtonMD btnEditarInmuebles;
    private LIB.FSButtonMD btnGestionarUsu;
    private LIB.FSButtonMD btnIniciarSesion;
    private LIB.FSButtonMD btnPreguntasFre;
    private LIB.FSButtonMD btnPublicarIn;
    private javax.swing.JButton btnRInmuebles;
    private javax.swing.JButton btnRUsuario;
    private LIB.FSButtonMD btnRegistrar;
    private LIB.FSButtonMD btnRegistrarUsu;
    private LIB.FSButtonMD btnReservaSInmuebles;
    private javax.swing.JButton btnRregistro;
    private javax.swing.JButton btnRreservas;
    private LIB.FSButtonMD btnSitiosPublicados;
    private LIB.FSButtonMD btnVerReservas;
    private LIB.FSTexFieldMD fSTexFieldMD1;
    private LIB.FSTexFieldMD fSTexFieldMD2;
    private LIB.FSTexFieldMD fSTexFieldMD3;
    private LIB.FSTexFieldMD fSTexFieldMD4;
    private LIB.JEImagePanel jEImagePanel1;
    private LIB.JEImagePanel jEImagePanel2;
    private LIB.JEImagePanel jEImagePanel9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNivel;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
