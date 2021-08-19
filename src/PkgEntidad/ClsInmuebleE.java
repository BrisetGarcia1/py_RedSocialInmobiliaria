/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PkgEntidad;

/**
 *
 * @author smoke
 */
public class ClsInmuebleE {
    int inmuebleid;

    
    int usuarioid;
    String direccioninmueble;
    String estado;
    int nrohabitaciones;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    String categoria;
    String ciudad;
    String descripcion;
    double precio;
    byte[] foto;
    public int getUsuarioid() {
        return usuarioid;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }
    public int getInmuebleid() {
        return inmuebleid;
    }

    public void setInmuebleid(int inmuebleid) {
        this.inmuebleid = inmuebleid;
    }

    public String getDireccioninmueble() {
        return direccioninmueble;
    }

    public void setDireccioninmueble(String direccioninmueble) {
        this.direccioninmueble = direccioninmueble;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNrohabitaciones() {
        return nrohabitaciones;
    }

    public void setNrohabitaciones(int nrohabitaciones) {
        this.nrohabitaciones = nrohabitaciones;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }
    

}
