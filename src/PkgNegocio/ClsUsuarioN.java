/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocio;

import PgkPresentacion.FrmAgregarInmueble;
import PgkPresentacion.FrmGestionarUsuario;
import PgkPresentacion.FrmInmueblesPublicados;
import PgkPresentacion.FrmPrincipal;
import PgkPresentacion.FrmRealizarReserva;
import PgkPresentacion.FrmReservasInmuebles;
import PkgEntidad.ClsPersonaE;
import PkgEntidad.ClsUsuarioE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author smoke
 */
public class ClsUsuarioN {

    public static boolean MtdRegistrarUsuario(ClsUsuarioE objUsuE) {
         try{
            String SQL="CALL USP_I_AgregarUsuario (?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objUsuE.getPersonaid());
            st.setString(2, objUsuE.getNombreusuario());
            st.setString(3, objUsuE.getClave());
            st.setString(4, objUsuE.getNivel());
            st.setString(5, objUsuE.getEstado());
          
            if (st.executeUpdate()>0) {
                return true;
            }
            else{
                return false;
            }
        }catch (SQLException e){
            return false;
        }
    }

    public static ArrayList<ClsUsuarioE> MtdListarUsuario() {
        try {
            String SQL="Select * from tb_usuario";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsUsuarioE> lista=new ArrayList();
            ClsUsuarioE car;
            
            
            while(resultado.next()){
               car=new ClsUsuarioE();
               car.setUsuarioid(resultado.getInt("Usuario_id"));
               car.setPersonaid(resultado.getInt("Persona_id"));
               car.setNombreusuario(resultado.getString("NombreUsuario"));
               car.setNivel(resultado.getString("Nivel"));
               car.setEstado(resultado.getString("Estado"));
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public boolean MtdLoginUsuario(ClsUsuarioE ObjUsuE) {
       PreparedStatement ps=null;
        ResultSet rs=null;
        Connection con=ClsConexion.Conectar();
        String Sql="SELECT u.Usuario_id,u.Clave, p.Apellido,p.Nombre,u.NombreUsuario,u.Nivel,u.Estado,p.Celular "
                + "FROM tb_usuario as u INNER JOIN tb_persona as p ON u.Persona_id = p.Persona_id"
                + " WHERE u.NombreUsuario = ?;";
       try{
           ps=con.prepareStatement(Sql);
            ps.setString(1,ObjUsuE.getNombreusuario());
            rs=ps.executeQuery();
            if(rs.next())
            {
                if(ObjUsuE.getClave().equals(rs.getString(2)))
                {
                    ObjUsuE.setUsuarioid(rs.getInt(1));
                    FrmAgregarInmueble.idusuario = rs.getInt(1);
                    FrmRealizarReserva.IdPer = rs.getInt(1);
                    FrmRealizarReserva.Nomb = String.valueOf(rs.getString(4));
                    FrmInmueblesPublicados.id = rs.getInt(1);
                    FrmReservasInmuebles.id = rs.getInt(1);
                    FrmPrincipal.Nom = String.valueOf(rs.getString(4));
                    FrmPrincipal.Ape = String.valueOf(rs.getString(3));
                    FrmPrincipal.Est  = String.valueOf(rs.getString(7));
                    String nom = String.valueOf(rs.getString(4));
                    String ape = String.valueOf(rs.getString(3));
                    String Ac  = String.valueOf(rs.getString(7));
                    FrmRealizarReserva.celular = String.valueOf(rs.getString(8));
                    FrmReservasInmuebles.Tipousu = String.valueOf(rs.getString(6));
                    FrmPrincipal.tipoUsu = String.valueOf(rs.getString(6));
                    if (Ac.equals("Activo")) {
                        JOptionPane.showMessageDialog(null, "Bienvenio: "+ nom+","+ape);
                         return true;
                    }
                    else
                    {
                    JOptionPane.showMessageDialog(null, "Su Cuenta esta suspendida..."+ Ac);
                    return false;
                    }
   
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Los datos son Incorrectos...");
                    return false;
                }
                
            }
            else{
                return false;
            }
            
       
       }
       catch(SQLException e){
           return false;
       }
    }

    public boolean MtdActualizarUsuario(ClsUsuarioE objUsuE) {
        try{
            String SQL="CALL USP_U_ActualizarUsuario (?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objUsuE.getUsuarioid());
            st.setString(2, objUsuE.getNombreusuario());
            st.setString(3, objUsuE.getClave());
            st.setString(4, objUsuE.getNivel());
            st.setString(5, objUsuE.getEstado());
           
          
            if (st.executeUpdate()>0) {
                return true;
            }
            else{
                return false;
            }
        }catch (SQLException e){
            return false;
        }
    }

    public static boolean MtdRegistrarme(ClsUsuarioE objUsuE) {
        try{
            String SQL="CALL USP_I_Registrarme (?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
       
            st.setString(1, objUsuE.getNombreusuario());
            st.setString(2, objUsuE.getClave());
            st.setString(3, objUsuE.getNivel());
            st.setString(4, objUsuE.getEstado());
          
            if (st.executeUpdate()>0) {
                return true;
            }
            else{
                return false;
            }
        }catch (SQLException e){
            return false;
        }
    }

  
    
}
