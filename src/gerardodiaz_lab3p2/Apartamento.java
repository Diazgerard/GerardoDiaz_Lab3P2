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
public class Apartamento extends DatosBR{
    
    private int numero;
    private String referencia;

    public Apartamento() {
    }

    public Apartamento(int numero, String referencia) {
        this.numero = numero;
        this.referencia = referencia;
    }

    public Apartamento(int numero, String referencia, String direccion, String dimensiones, String id) {
        super(direccion, dimensiones, id);
        this.numero = numero;
        this.referencia = referencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "numero=" + numero + ",\n"
                + " referencia=" + referencia + '}';
    }

    
    
    
    
    
}
