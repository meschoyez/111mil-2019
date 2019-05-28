/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

import java.awt.Color;

/**
 *
 * @author meschoyez
 */
public class Triangulo extends FiguraGeometrica {
    private Double base, altura;

    public Triangulo (Double b, Double a, Color c) {
        super(c);
        base = b;
        altura = a;
    }
    
//    public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Triangulo (Double b, Double a, Color c, Integer x, Integer y) {
        super(x, y, c);
        base = b;
        altura = a;
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
    
}
