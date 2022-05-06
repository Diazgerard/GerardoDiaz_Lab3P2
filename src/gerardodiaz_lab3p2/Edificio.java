/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_lab3p2;

import java.util.ArrayList;

/**
 *
 * @author gerar
 */
public class Edificio extends DatosBR{
    
     private int cantidad; 
     private String nombre;
     ArrayList<Apartamento> apartamento = new ArrayList();

    public Edificio() {
    }

    public Edificio(int cantidad, String nombre) {
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public Edificio(int cantidad, String nombre, String direccion, String dimensiones, String id) {
        super(direccion, dimensiones, id);
        this.cantidad = cantidad;
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Apartamento> getApartamento() {
        return apartamento;
    }

    public void setApartamento(ArrayList<Apartamento> apartamento) {
        this.apartamento = apartamento;
    }

    @Override
    public String toString() {
        return "Edificio{" + "cantidad=" + cantidad + ",\n"
                + " nombre=" + nombre + ",\n"
                + " apartamento=" + apartamento + '}';
    }
     
     
     
     
     
    
    
}
