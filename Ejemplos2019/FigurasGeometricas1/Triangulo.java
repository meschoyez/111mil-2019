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
public class Triangulo {
    private Double base, altura;
    private String color;
    
    public Triangulo (Double base, Double altura, String color) {
        this.base = base;
        this.altura = altura;
        this.color = color;
    }

    /**
     * @return the base
     */
    public Double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(Double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public Double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(Double altura) {
        this.altura = altura;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    
}
