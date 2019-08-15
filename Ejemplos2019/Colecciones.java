/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author meschoyez
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> lista;
        Map<Integer, String> mapa;
        Map<Integer, String> otroMapa;
        Set<String> conjunto;
        Set<String> otroConjunto;
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        String texto;
        
        lista = new ArrayList<>();
        conjunto = new HashSet<>();
        otroConjunto = new TreeSet<>();
        mapa = new HashMap<>();
        otroMapa = new TreeMap<>();
        
        Integer orden = 0;
        texto = teclado.nextLine();
        while (!texto.equals("q")) {
            lista.add(texto);
            conjunto.add(texto);
            otroConjunto.add(texto);
            mapa.put(orden, texto);
            otroMapa.put(orden, texto);
            orden = orden + 1;
//            System.out.println("--> " + texto);
            texto = teclado.nextLine();
        }
        System.out.println("ArrayList -> " + lista);
        System.out.println("HashSet ->" + conjunto);
        System.out.println("TreeSet ->" + otroConjunto);
        System.out.println("HashMap -> " + mapa);
        System.out.println("TreeMap -> " + otroMapa);
        System.out.println("TreeMap (keys) -> " + otroMapa.keySet());
        System.out.println("TreeMap (values)-> " + otroMapa.values());

//        ArrayList<String> palabrasDelConjunto = new ArrayList<>();
        ArrayList<String> palabrasDelConjunto = new ArrayList<>(conjunto);
//        palabrasDelConjunto.addAll(conjunto);
        
//        for (String s : conjunto) {
//            palabrasDelConjunto.add(s);
//        }

        System.out.println("ArrayList desde Conjunto -> " + palabrasDelConjunto);

    }
    
}
