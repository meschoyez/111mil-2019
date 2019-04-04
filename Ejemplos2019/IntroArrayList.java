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
