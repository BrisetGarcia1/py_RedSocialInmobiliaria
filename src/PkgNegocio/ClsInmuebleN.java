/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocio;


import PkgEntidad.ClsInmuebleE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author smoke
 */
public class ClsInmuebleN {

    public static boolean MtdRegistrarInmueble(ClsInmuebleE objInmE) {
        try{
            String SQL="CALL USP_I_AgregarInmueble (?,?,?,?,?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objInmE.getUsuarioid());
            st.setString(2, objInmE.getDireccioninmueble());
            st.setInt(3, objInmE.getNrohabitaciones());
            st.setString(4, objInmE.getCiudad());
            st.setString(5, objInmE.getDescripcion());
            st.setString(6, objInmE.getCategoria());
            st.setDouble(7, objInmE.getPrecio());
            st.setBytes(8,objInmE.getFoto());
            st.setString(9, objInmE.getEstado());
            
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

    public static ArrayList<ClsInmuebleE> MtdListarInmueble() {
         try {
            String SQL="Select * from tb_inmueble";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsInmuebleE> lista=new ArrayList();
            ClsInmuebleE car;
            
            
            while(resultado.next()){
               car=new ClsInmuebleE();
               car.setInmuebleid(resultado.getInt("Inmueble_id"));
               car.setUsuarioid(resultado.getInt("Usuario_id"));
               car.setDireccioninmueble(resultado.getString("DireccionInmueble"));
               car.setEstado(resultado.getString("Estado"));
               car.setNrohabitaciones(resultado.getInt("NumHabitaciones"));
               car.setCiudad(resultado.getString("Ciudad"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setCategoria(resultado.getString("Categoria"));
               car.setPrecio(resultado.getDouble("Precio"));
               car.setFoto(resultado.getBytes("Foto"));


               
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public static ArrayList<ClsInmuebleE> MtdListarInmuebleNoPublicado() {
        try {
            String SQL="Select * from tb_inmueble WHERE Estado='Nopublicado'";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsInmuebleE> lista=new ArrayList();
            ClsInmuebleE car;
            
            
            while(resultado.next()){
               car=new ClsInmuebleE();
               car.setInmuebleid(resultado.getInt("Inmueble_id"));
               car.setUsuarioid(resultado.getInt("Usuario_id"));
               car.setDireccioninmueble(resultado.getString("DireccionInmueble"));
               car.setEstado(resultado.getString("Estado"));
               car.setNrohabitaciones(resultado.getInt("NumHabitaciones"));
               car.setCiudad(resultado.getString("Ciudad"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setCategoria(resultado.getString("Categoria"));
               car.setPrecio(resultado.getDouble("Precio"));
               car.setFoto(resultado.getBytes("Foto"));


               
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

   
    public static ArrayList<ClsInmuebleE> MtdListarInmueblePublicadoUsu(ClsInmuebleE objInmuebleE) {
        try {
            String SQL="Select * from tb_inmueble WHERE Estado='Publicado' AND Usuario_id = ?";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objInmuebleE.getUsuarioid());
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsInmuebleE> lista=new ArrayList();
            ClsInmuebleE car;
            
            
            while(resultado.next()){
               car=new ClsInmuebleE();
               car.setInmuebleid(resultado.getInt("Inmueble_id"));
               car.setUsuarioid(resultado.getInt("Usuario_id"));
               car.setDireccioninmueble(resultado.getString("DireccionInmueble"));
               car.setEstado(resultado.getString("Estado"));
               car.setNrohabitaciones(resultado.getInt("NumHabitaciones"));
               car.setCiudad(resultado.getString("Ciudad"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setCategoria(resultado.getString("Categoria"));
               car.setPrecio(resultado.getDouble("Precio"));
               car.setFoto(resultado.getBytes("Foto"));


               
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public static ArrayList<ClsInmuebleE> MtdListarInmueblePublicado() {
        try {
            String SQL="Select * from tb_inmueble WHERE Estado='Publicado'";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
         
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsInmuebleE> lista=new ArrayList();
            ClsInmuebleE car;
            while(resultado.next()){
               car=new ClsInmuebleE();
               car.setInmuebleid(resultado.getInt("Inmueble_id"));
               car.setUsuarioid(resultado.getInt("Usuario_id"));
               car.setDireccioninmueble(resultado.getString("DireccionInmueble"));
               car.setEstado(resultado.getString("Estado"));
               car.setNrohabitaciones(resultado.getInt("NumHabitaciones"));
               car.setCiudad(resultado.getString("Ciudad"));
               car.setDescripcion(resultado.getString("Descripcion"));
               car.setCategoria(resultado.getString("Categoria"));
               car.setPrecio(resultado.getDouble("Precio"));
               car.setFoto(resultado.getBytes("Foto"));
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }

    public static boolean MtdActulizarInmueble(ClsInmuebleE objInmE) {
        try{
            String SQL="CALL USP_U_ActualizarInmueble (?,?,?,?,?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objInmE.getInmuebleid());
            st.setString(2, objInmE.getDireccioninmueble());
            st.setInt(3, objInmE.getNrohabitaciones());
            st.setString(4, objInmE.getCiudad());
            st.setString(5, objInmE.getDescripcion());
            st.setString(6, objInmE.getCategoria());
            st.setDouble(7, objInmE.getPrecio());
            st.setBytes(8,objInmE.getFoto());
            st.setString(9, objInmE.getEstado());
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

    public static boolean MtdAcPublicarInmueble(ClsInmuebleE objInmE) {
        try{
            String SQL="CALL USP_U_PublicarInmueble (?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setInt(1, objInmE.getInmuebleid());
            st.setString(2, objInmE.getEstado());
           
           
          
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
