/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usodemetodos;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author meschoyez
 */
public class UsoDeMetodos {

    /**
     * @param args the command line arguments
     * 
     * Se desea generar una lista de numeros aleatorios
     * Luego, verificar si todos son pares
     * Finalmente, dar la sumatoria
     */
    public static void main(String[] args) {
        UsoDeMetodos u = new UsoDeMetodos();
        ArrayList<Integer> numeros = new ArrayList<>();
        Boolean todosPares;
        Integer suma;
        
        u.GenerarNrosAleatorios(numeros, 20);
        todosPares = u.VerificarParidad(numeros);
        suma = u.Sumatoria(numeros);
        
        if (todosPares) {
            System.out.println("Todos los nros son pares");
        }
        else {
            System.out.println("Existen nros impares");            
        }
        System.out.println("La sumatoria es " + suma);
    }

    public void GenerarNrosAleatorios(ArrayList<Integer> nros, Integer c) {
        Random r = new Random();
        for (int i = 0; i < c; i++) {
            nros.add(r.nextInt(100));
        }
    }
    
    public Boolean VerificarParidad(ArrayList<Integer> nros) {
        Boolean pares = true;
        for (Integer n : nros) {
            if (n % 2 != 0) {
                pares = false;
            }
        }
        return pares;
    }
        
    
    public Integer Sumatoria(ArrayList<Integer> nros) {
        Integer suma = 0;
        for (Integer n : nros) {
            suma += n;
        }
        return suma;
    }


}
