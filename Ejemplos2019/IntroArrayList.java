/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author meschoyez
 */
public class IntroArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Las colecciones no aceptan datos primitivos
           Puedo utilizar objetos envolventes de datos
           primitivos para trabajar:
             - Integer
             - Double
             - Boolean
             - etc.
        */
        Integer valor, cant;
        ArrayList <Integer> numeros = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Cant. Nros? ");
        cant = new Integer(teclado.nextLine());
        for (int x = 0; x < cant; x++) {
            System.out.print("Nro? ");
            valor = new Integer(teclado.nextLine());
            numeros.add(valor);
        }
    
        System.out.println("Los numeros ingresados son:");
        for (Integer tmp : numeros) {
            System.out.println(tmp);
        }
        
        
    }
     
    public void PrimerEjemplo () {
        // Las colecciones me permiten almacenar
        // cualquier cantidad de datos 
        String nombre;
        ArrayList <String> usuarios = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Nombre? ");
        nombre = teclado.nextLine();
        while (!nombre.equals("fin")) {
            usuarios.add(nombre);
            System.out.println("Nombre? ");
            nombre = teclado.nextLine();
        }
        
        System.out.println("Cant. elementos " +
                  usuarios.size());
        
        // for-each
        for (String tmp : usuarios) {
            System.out.println("Hola " + tmp + "!!!");
        }
    }
    
}
