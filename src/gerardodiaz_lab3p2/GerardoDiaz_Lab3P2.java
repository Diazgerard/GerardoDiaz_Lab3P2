/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerardodiaz_lab3p2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class GerardoDiaz_Lab3P2 {
    static Scanner lea = new Scanner (System.in);
    static ArrayList<Residencial> residencial = new ArrayList();
    static ArrayList<Cliente> cliente = new ArrayList();
    public static void main(String[] args) {
        Residencial r =  new Residencial();
        Cliente c  = new Cliente();
        DatosBR br = new DatosBR();
        Casa C = new Casa();
        Edificio e =  new Edificio();
        Apartamento a = new Apartamento();
        int opci=0;
        while(opci!=6){
            System.out.println("-------------------------------");
            System.out.println("1) Agregar Residencial");
            System.out.println("2) Agregar Cliente");
            System.out.println("3) CRUD del Cliente");
            System.out.println("3) Vender al Cliente");
            
            System.out.println("4) Salir");
            System.out.print("Ingrese una opcion: ");
            opci = lea.nextInt();
            System.out.println("-------------------------------");
            switch(opci){
                case 1:{
                    
                    

                    int opc = 0;
                    while (opc != 6) {
                        
                        System.out.println("-------------------------------");
                        System.out.println("1) Agregar Casa");
                        System.out.println("2) Agregar Edificio");
                        System.out.println("3) Agregar Apartamento: ");
                        System.out.println("3) Salir");
                        System.out.print("Ingrese una opcion: ");
                        opc = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (opc) {
                            case 1: {
                                
                                
                                System.out.print("Ingrese nombre de la Residencia: ");
                                lea.nextLine();
                                String nombre = lea.nextLine();
                                System.out.println();

                                r.setNombre(nombre);

                                System.out.print("Ingrese direccion de la Residencia: ");
                                lea.nextLine();
                                String direccion = lea.nextLine();
                                System.out.println();
                                
                                C.setDireccion(direccion);
                               
                                System.out.print("Ingrese dimensiones del terreno: ");
                                lea.nextLine();
                                String dimensiones = lea.nextLine();
                                System.out.println();
                                
                                C.setDimensiones(dimensiones);

                                System.out.print("Ingrese ID del sistema: ");
                                lea.nextLine();
                                String id = lea.nextLine();
                                System.out.println();
                                
                                C.setId(id);
                                
                                
                                System.out.print("Ingrese numero de la casa: ");
                                int casa = lea.nextInt();
                                System.out.println();
                                
                                C.setNumero(casa);
                                
                                System.out.print("Ingrese referencia: ");
                                lea.nextLine();
                                String referencia = lea.nextLine();
                                System.out.println();
                                
                                C.setReferencia(referencia);
                                
                            }
                            break;
                            case 2: {
                                System.out.print("Ingrese nombre de la Residencia: ");
                                lea.nextLine();
                                String nombre = lea.nextLine();
                                System.out.println();

                                r.setNombre(nombre);

                                System.out.print("Ingrese direccion de la Residencia: ");
                                lea.nextLine();
                                String direccion = lea.nextLine();
                                System.out.println();
                                
                                e.setDireccion(direccion);

                                System.out.print("Ingrese dimensiones del terreno: ");
                                lea.nextLine();
                                String dimensiones = lea.nextLine();
                                System.out.println();
                                
                                e.setDimensiones(dimensiones);

                                System.out.print("Ingrese ID del sistema: ");
                                lea.nextLine();
                                String id = lea.nextLine();
                                System.out.println();
                                
                                e.setId(id);
                                
                                System.out.print("Cantidad de edificios: ");
                                int cantidad = lea.nextInt();
                                System.out.println();
                                
                                e.setCantidad(cantidad);
                                
                                System.out.print("Nombre del edificio: ");
                                lea.nextLine();
                                String name  = lea.nextLine();
                                
                                e.setNombre(name);
                            }
                            break; 
                            case 3: {
                                e.getApartamento().add(new Apartamento());
                                
                                
                                System.out.print("Ingrese nombre de la Residencia: ");
                                lea.nextLine();
                                String nombre = lea.nextLine();
                                System.out.println();

                                r.setNombre(nombre);
                                
                                for (int i = 0; i < e.getCantidad(); i++) {
                                   System.out.print("Ingrese direccion de la Residencia: ");
                                lea.nextLine();
                                String direccion = lea.nextLine();
                                System.out.println();
                                e.getApartamento().get(0).setDireccion(direccion);

                                System.out.print("Ingrese dimensiones del terreno: ");
                                lea.nextLine();
                                String dimensiones = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(0).setDimensiones(dimensiones);

                                System.out.print("Ingrese ID del sistema: ");
                                lea.nextLine();
                                String id = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(0).setId(id);

                                
                                System.out.print("Numero de apartamento: ");
                                int numero = lea.nextInt();
                                System.out.println();                                
                                e.getApartamento().get(0).setNumero(numero);
                                
                                System.out.print("Ingrese Referencia del apartamento: ");
                                lea.nextLine();
                                String referencia = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(0).setNumero(numero); 
                                           
                                }

                                
                            }
                                
                        }
                    }
                    
                    
                }
                break;
                case 2: {

                    System.out.print("Ingrese nombre del cliente: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    System.out.println();
                    c.setNombre(nombre);
                    
                    System.out.print("Ingrese edad de " + nombre  +": ");
                    int edad = lea.nextInt();
                    System.out.println();
                    c.setEdad(edad);
                    
                    
                    System.out.print("Ingrese id de " + nombre + ": ");
                    lea.nextLine();
                    String id = lea.nextLine();
                    System.out.println();
                    c.setId(id);
                    
                    System.out.print("Cree un usuario para la empresa: ");
                    String usuario = lea.next();
                    System.out.println();
                    c.setUsuario(usuario);
                    
                    System.out.print("Cree una contrasenia para la empresa:  ");
                    String contrenia = lea.next();
                    System.out.println();
                    c.setContrasenia(contrenia);
                    
                    
                    
                }
                break;
                case 3: {
                    System.out.println(c);
                    
                }
                break;
                    
            }
        }
    }
}
        
    
