/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobjetos;

import java.awt.Color;

/**
 *
 * @author meschoyez
 */
public class Rectangulo {
    private Double largo, ancho;
    private Integer x, y;
    //private String color;
    private Color color;
    
//    public Rectangulo (Double l, Double a, String c) {
    public Rectangulo (Double l, Double a, Color c) {
        largo = l;
        ancho = a;
        color = c;
    }
    
//    public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Rectangulo (Double l, Double a, Color c, Integer x, Integer y) {
        largo = l;
        ancho = a;
        color = c;
        this.x = x;
        this.y = y;
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

    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
}
