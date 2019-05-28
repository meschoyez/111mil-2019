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
public class Rectangulo extends FiguraGeometrica {
    private Double largo;
    private Double ancho;

    public Rectangulo (Double l, Double a, Color c) {
        super(c);
        largo = l;
        ancho = a;
    }
    
//    public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Rectangulo (Double l, Double a, Color c, Integer x, Integer y) {
        super(x, y, c);
        largo = l;
        ancho = a;
    }
    
    public Double Perimetro () {
        return 2 * getLargo() + 2 * getAncho();
    }

    public Double Superficie () {
        return getLargo() * getAncho();
    }

    /**
     * @return the largo
     */
    public Double getLargo() {
        return largo;
    }

    /**
     * @param largo the largo to set
     */
    public void setLargo(Double largo) {
        this.largo = largo;
    }

    /**
     * @return the ancho
     */
    public Double getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }


    public void mover (Canvas c, Integer destX, Integer destY) {
        Integer dx = 0, dy = 0;
        if (destX > getX()) {
            dx = 1;
        }
        if (destX < getX()) {
            dx = -1;
        }
        if (destY > getY()) {
            dy = 1;
        }
        if (destY < getY()) {
            dy = -1;
        }
        
        c.setColorDeLapiz(getColor());
        for (Integer i = 0; i < 50; i = i+1) {
            c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
            c.espera(50);
            c.borrarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());            
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
        
    }
    
}
