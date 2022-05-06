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
public class Residencial {
    
    String nombre;
    ArrayList<Edificio> edificio = new ArrayList();
    ArrayList<Casa> casa = new ArrayList();

    public Residencial() {
    }

    public Residencial(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Edificio> getEdificio() {
        return edificio;
    }

    public void setEdificio(ArrayList<Edificio> edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Casa> getCasa() {
        return casa;
    }

    public void setCasa(ArrayList<Casa> casa) {
        this.casa = casa;
    }

    @Override
    public String toString() {
        return "Residencial{" + "nombre = " + nombre + ",\n"
                + " edificio=" + edificio + ", \n "
                + "casa=" + casa + '}';
    }
    
    
    
}
