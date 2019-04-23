/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobjetos;

/**
 *
 * @author meschoyez
 */
public class Rectangulo {
    private Double largo, ancho;
    private String color;
    
    public Rectangulo (Double l, Double a, String c) {
        largo = l;
        ancho = a;
        color = c;
    }
    
    public Double getLargo () {
        return largo;
    }

    public void setLargo (Double l) {
        largo = l;
    }
    
    public Double getAncho () {
        return ancho;
    }
    
    public void setAncho (Double a) {
        ancho = a;
    }
    
    public Double Perimetro () {
        return 2 * largo + 2 * ancho;
    }

    public Double Superficie () {
        return largo * ancho;
    }
}
