/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocio;

import PkgEntidad.ClsReservaE;
import PkgEntidad.ClsUsuarioE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author smoke
 */
public class ClsReservaN {

    public boolean MtdRegistrarReserva(ClsReservaE objReE) {
        try{
            String SQL="INSERT INTO tb_reserva (Inmueble_id,Fecha_Inicio,Fecha_Final,Estado,Descripcion,Persona,NombreP,CelularP,UsuarioA) VALUES (?,?,?,?,?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objReE.getInmueble_id());
            st.setString(2, objReE.getFechaI());
            st.setString(3, objReE.getFechF());
            st.setString(4, objReE.getEstado());
            st.setString(5, objReE.getDescripcion());
            st.setInt(6, objReE.getPersona_id());
            st.setString(7, objReE.getNombre());
            st.setString(8, objReE.getCelular());
            st.setInt(9, objReE.getIdusu());
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

    public static ArrayList<ClsReservaE> MtdListarReservaUsu(ClsReservaE objResvE) {
        try {
            String SQL="Select * from tb_reserva WHERE Persona = ?";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objResvE.getPersona_id());
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsReservaE> lista=new ArrayList();
            ClsReservaE car;
            
            
            while(resultado.next()){
               car=new ClsReservaE();
               car.setReserva_id(resultado.getInt("Reserva_id"));
               car.setInmueble_id(resultado.getInt("Inmueble_id"));
               car.setFechaI(resultado.getString("Fecha_Inicio"));
               car.setFechF(resultado.getString("Fecha_Final"));
               car.setEstado(resultado.getString("Estado"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setPersona_id(resultado.getInt("Persona"));
               car.setNombre(resultado.getString("NombreP"));
               car.setCelular(resultado.getString("CelularP"));
               car.setIdusu(resultado.getInt("UsuarioA"));

               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public Iterable<ClsReservaE> MtdListarReservaArre(ClsReservaE objResvE) {
        try {
            String SQL="Select * from tb_reserva WHERE UsuarioA = ?";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objResvE.getPersona_id());
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsReservaE> lista=new ArrayList();
            ClsReservaE car;
            
            
            while(resultado.next()){
               car=new ClsReservaE();
               car.setReserva_id(resultado.getInt("Reserva_id"));
               car.setInmueble_id(resultado.getInt("Inmueble_id"));
               car.setFechaI(resultado.getString("Fecha_Inicio"));
               car.setFechF(resultado.getString("Fecha_Final"));
               car.setEstado(resultado.getString("Estado"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setPersona_id(resultado.getInt("Persona"));
               car.setNombre(resultado.getString("NombreP"));
               car.setCelular(resultado.getString("CelularP"));
               car.setIdusu(resultado.getInt("UsuarioA"));

               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public static boolean MtdAceptarInmueble(ClsReservaE objReE) {
        try{
            String SQL="CALL USP_U_AceptarReserva (?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objReE.getReserva_id());
            st.setString(2, objReE.getEstado());
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
