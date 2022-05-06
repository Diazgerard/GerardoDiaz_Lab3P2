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
        while(opci!=8){
            System.out.println("-------------------------------");
            System.out.println("1) Agregar Residencial");
            System.out.println("2) Agregar Cliente");
            System.out.println("3) RUD del Cliente");
            System.out.println("4) Vender al Cliente");
            System.out.println("5) RUD Casa");
            System.out.println("6) RUD Edificio");
            System.out.println("7) RUD Apartamento");
            System.out.println("8) Salir");
            System.out.print("Ingrese una opcion: ");
            opci = lea.nextInt();
            System.out.println("-------------------------------");
            switch(opci){
                case 1:{
                    
                    

                    int opc = 0;
                    while (opc != 3) {
                        
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
                                e.getApartamento().get(i).setDireccion(direccion);

                                System.out.print("Ingrese dimensiones del terreno: ");
                                lea.nextLine();
                                String dimensiones = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(i).setDimensiones(dimensiones);

                                System.out.print("Ingrese ID del sistema: ");
                                lea.nextLine();
                                String id = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(i).setId(id);

                                
                                System.out.print("Numero de apartamento: ");
                                int numero = lea.nextInt();
                                System.out.println();                                
                                e.getApartamento().get(i).setNumero(numero);
                                
                                System.out.print("Ingrese Referencia del apartamento: ");
                                lea.nextLine();
                                String referencia = lea.nextLine();
                                System.out.println();
                                
                                e.getApartamento().get(i).setNumero(numero); 
                                           
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
                    String contrasenia = lea.next();
                    System.out.println();
                    c.setContrasenia(contrasenia);
                    
                    Cliente cli = new Cliente(nombre,edad, id, usuario, contrasenia);
                    cliente.add(cli);
                    
                    
                    
                }
                break;
                case 3: {
                    int op = 0;
                    while (op != 4) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Read");
                        System.out.println("2) Update");
                        System.out.println("3) Delete"); 
                        System.out.println("4) Salir");
                        System.out.print("Ingrese una opcion: ");
                        op = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (op) {
                            case 1: {
                                System.out.println(c);
                            }
                            break;
                            case 2:{
                                int o = 0;
                                while (o != 6) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Nombre");
                                    System.out.println("2) Edad");
                                    System.out.println("3) ID");
                                    System.out.println("4) Usuario");
                                    System.out.println("5) Contrasenia");
                                    System.out.println("6) Salir");
                                    System.out.print("Ingrese una opcion: ");
                                    o = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (o) {
                                        case 1: {
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.print("Ingrese nuevo nombre: ");
                                            lea.nextLine();
                                            String nombre = lea.nextLine();
                                            
                                            cliente.get(p);
                                            c.setNombre(nombre);
                                            
                                        }
                                        break;
                                        case 2:{
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.print("Ingrese nueva edad: ");
                                            int edad = lea.nextInt();
                                            c.setEdad(edad);
                                        }
                                        break;
                                        case 3 : {
                                            System.out.print("Ingrese nuevo ID: ");
                                            String id = lea.next();
                                            c.setId(id);
                                        }
                                        break;
                                        case 4 : {
                                            System.out.print("Ingrese nuevo usuario: ");
                                            String usuario = lea.next();
                                            c.setUsuario(usuario);
                                        }
                                        break;
                                        case 5:{
                                            System.out.println("Ingrese nueva contrasenia: ");
                                            String contrasenia = lea.next();
                                            c.setContrasenia(contrasenia);
                                        }
                                        break;
                                            
                                    }
                                }
                                
                            }
                            break;
                            case 3: {
                            
                            }
                                
                        }
                    }
                
                    
                    
                    
                    
                }
                break;
                case 4:{// vender 
                    System.out.println("Iniciar Sesion");
                    System.out.println("Ingrese Usuario: ");
                    String usuario = lea.next();
                    System.out.print("Ingrese Contrasenia: ");
                    String contrasenia = lea.next();
                    
                    if(usuario.equals(c.getUsuario())|| contrasenia.equals(c.getContrasenia())){
                        System.out.println(C);
                        System.out.println();
                        System.out.println(e);
                        System.out.println();
                        System.out.println(a);
                        System.out.println();
                        
                        System.out.println("Que quiere comparar??");
                        
                        
                        
                    }else{
                        System.out.println("Mal usuario y contrsenia");
                    }
                    
                }
                break;
                case 5: { // casa
                    int op = 0;
                    while (op != 4) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Read");
                        System.out.println("2) Update");
                        System.out.println("3) Delete"); 
                        System.out.println("4) Salir");
                        System.out.print("Ingrese una opcion: ");
                        op = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (op) {
                            case 1: {
                                System.out.println(C);
                            }
                            break;
                            case 2: {
                                int o = 0;
                                while (o != 4) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Residencia");
                                    System.out.println("2) Direccion");
                                    System.out.println("3) Dimensiones");
                                    System.out.println("4) ID");
                                    System.out.println("5) Numero");
                                    System.out.println("6) Referencia");
                                    System.out.print("Ingrese una opcion: ");
                                    o = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (o) {
                                        case 1: {
                                            System.out.print("Ingrese nueva residencia:");
                                            lea.nextLine();
                                            String residencia  = lea.nextLine();
                                            
                                            r.setNombre(residencia);
                                        
                                        }
                                        break;
                                        case 2: {
                                            System.out.print("Ingrese nueva direccion: ");
                                            lea.nextLine();
                                            String direccion = lea.nextLine();
                                            
                                            C.setDireccion(direccion);
                                        }
                                        break;
                                        case 3: {
                                            System.out.println("Ingrese nueva dimension: ");
                                            lea.nextLine();
                                            String dimensiones =  lea.nextLine();
                                            
                                            C.setDimensiones(dimensiones);
                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Ingrese nueva ID: ");
                                            lea.nextLine();
                                            String id = lea.nextLine();
                                            
                                            C.setId(id);
                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Ingrese nuevo numero: ");
                                            int casa = lea.nextInt();
                                            C.setNumero(o);
                                        }
                                        break;
                                        case 6:{
                                            System.out.println("Ingerse nueva referencia: ");
                                            lea.nextLine();
                                            String referencia = lea.nextLine();
                                            C.setReferencia(referencia);
                                        }
                                                
                                    }
                                }
                                
                            }
                        }
                    }
                    
                }
                break;
                case 6: {
                    
                    int op = 0;
                    while (op != 4) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Read");
                        System.out.println("2) Update");
                        System.out.println("3) Delete"); 
                        System.out.println("4) Salir");
                        System.out.print("Ingrese una opcion: ");
                        op = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (op) {
                            case 1: {
                                System.out.println(e);
                            }
                            break;
                            case 2: {
                                int o = 0;
                                while (o != 4) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Residencia");
                                    System.out.println("2) Direccion");
                                    System.out.println("3) Dimensiones");
                                    System.out.println("4) ID");
                                    System.out.println("5) Cantidad");
                                    System.out.println("6) Nombre");
                                    System.out.print("Ingrese una opcion: ");
                                    o = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (o) {
                                        case 1: {
                                            System.out.print("Ingrese nueva residencia:");
                                            lea.nextLine();
                                            String residencia  = lea.nextLine();
                                            
                                            r.setNombre(residencia);
                                        
                                        }
                                        break;
                                        case 2: {
                                            System.out.print("Ingrese nueva direccion: ");
                                            lea.nextLine();
                                            String direccion = lea.nextLine();
                                            
                                            e.setDireccion(direccion);
                                        }
                                        break;
                                        case 3: {
                                            System.out.println("Ingrese nueva dimension: ");
                                            lea.nextLine();
                                            String dimensiones =  lea.nextLine();
                                            
                                            e.setDimensiones(dimensiones);
                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Ingrese nueva ID: ");
                                            lea.nextLine();
                                            String id = lea.nextLine();
                                            
                                            e.setId(id);
                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Ingrese nueva cantidad: ");
                                            int casa = lea.nextInt();
                                            e.setCantidad(casa);
                                        }
                                        break;
                                        case 6:{
                                            System.out.println("Ingerse nuevo nombre: ");
                                            lea.nextLine();
                                            String referencia = lea.nextLine();
                                            e.setNombre(referencia);
                                        }
                                                
                                    }
                                }
                                
                            }
                        }
                    }
                    
                }
                break;
                case 7:{// apartamento
                    int op = 0;
                    while (op != 4) {
                        System.out.println("-------------------------------");
                        System.out.println("1) Read");
                        System.out.println("2) Update");
                        System.out.println("3) Delete"); 
                        System.out.println("4) Salir");
                        System.out.print("Ingrese una opcion: ");
                        op = lea.nextInt();
                        System.out.println("-------------------------------");
                        switch (op) {
                            case 1: {
                                System.out.println(a);
                            }
                            break;
                            case 2: {
                                int o = 0;
                                while (o != 4) {
                                    System.out.println("-------------------------------");
                                    System.out.println("1) Residencia");
                                    System.out.println("2) Direccion");
                                    System.out.println("3) Dimensiones");
                                    System.out.println("4) ID");
                                    System.out.println("5) Numero");
                                    System.out.println("6) Referencia");
                                    System.out.print("Ingrese una opcion: ");
                                    o = lea.nextInt();
                                    System.out.println("-------------------------------");
                                    switch (o) {
                                        case 1: {
                                            System.out.print("Ingrese nueva residencia:");
                                            lea.nextLine();
                                            String residencia  = lea.nextLine();
                                            
                                            r.setNombre(residencia);
                                        
                                        }
                                        break;
                                        case 2: {
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.print("Ingrese nueva direccion: ");
                                            lea.nextLine();
                                            String direccion = lea.nextLine();
                                            
                                           e.getApartamento().get(p).setDireccion(direccion);
                                        }
                                        break;
                                        case 3: {
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.println("Ingrese nueva dimension: ");
                                            lea.nextLine();
                                            String dimensiones =  lea.nextLine();
                                            
                                            e.getApartamento().get(p).setDimensiones(dimensiones);
                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.println("Ingrese nueva ID: ");
                                            lea.nextLine();
                                            String id = lea.nextLine();
                                            
                                            e.getApartamento().get(p).setId(id);
                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.println("Ingrese nuevo numero: ");
                                            int casa = lea.nextInt();
                                            e.getApartamento().get(p).setNumero(casa);
                                        }
                                        break;
                                        case 6:{
                                            System.out.println("Ingrese posicion: ");
                                            int p = lea.nextInt();
                                            
                                            System.out.println("Ingerse nueva referencia: ");
                                            lea.nextLine();
                                            String referencia = lea.nextLine();
                                            e.getApartamento().get(p).setReferencia(referencia);
                                        }
                                                
                                    }
                                }
                                
                            }
                        }
                    }

                    
                }
                break;
                    
            }
        }
    }
}
        
    
