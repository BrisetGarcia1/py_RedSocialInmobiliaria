/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgNegocio;

import PkgEntidad.ClsPersonaE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author smoke
 */
public class ClsPersonaN {

    public static boolean MtdRegistrarPersona(ClsPersonaE objPerE) {
        try{
            String SQL="CALL USP_I_AgregarPersona (?,?,?,?,?,?);";
            Connection con = ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            st.setString(1, objPerE.getDni());
            st.setString(2, objPerE.getNombre());
            st.setString(3, objPerE.getApellido());
            st.setString(4, objPerE.getEmail());
            st.setString(5, objPerE.getCelular());
            st.setString(6, objPerE.getDireccion());
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

    public static ArrayList<ClsPersonaE> MtdListarPersona() {
        try {
            String SQL="Select * from tb_persona";  
            Connection con=ClsConexion.Conectar();
            PreparedStatement st=con.prepareStatement(SQL);
            ResultSet resultado=st.executeQuery();
            ArrayList<ClsPersonaE> lista=new ArrayList();
            ClsPersonaE car;
            
            
            while(resultado.next()){
               car=new ClsPersonaE();
               car.setPersonaid(resultado.getInt("Persona_id"));
               car.setDni(resultado.getString("Dni"));
               car.setNombre(resultado.getString("Nombre"));
               car.setApellido(resultado.getString("Apellido"));
               car.setEmail(resultado.getString("Email"));
               car.setCelular(resultado.getString("Celular"));
               car.setDireccion(resultado.getString("Direccion"));
               lista.add(car);
               
            }
            return lista;
        }catch (SQLException e){
            return null;
        }
    }
    
}
