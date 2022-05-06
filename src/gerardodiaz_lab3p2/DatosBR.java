/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_lab3p2;

/**
 *
 * @author gerar
 */
public class DatosBR {
    
    private String direccion;
    private String dimensiones;
    private String id;

    public DatosBR() {
    }
    
    

    public DatosBR(String direccion, String dimensiones, String id) {
        this.direccion = direccion;
        this.dimensiones = dimensiones;
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "DatosBR{" + "direccion=" + direccion + ",\n"
                + " dimensiones=" + dimensiones + ",\n"
                + " id=" + id + '}';
    }
    
    
    
}
