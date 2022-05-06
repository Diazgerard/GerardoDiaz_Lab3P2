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
public class Cliente {
    private String nombre;
    private int edad;
    private String id;
    private String usuario;
    private String contrasenia;

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String id, String usuario, String contrasenia) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ",\n"
                + " edad=" + edad + ",\n"
                + " id=" + id + ",\n"
                + " usuario=" + usuario + ",\n"
                + " contrasenia=" + contrasenia + '}';
    }
    
    
    
    
    
}
