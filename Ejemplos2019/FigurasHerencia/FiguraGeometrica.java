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
public class FiguraGeometrica {
    private Integer x, y;
    private Color color;

    public FiguraGeometrica (Color color) {
        this.x = 0;
        this.y = 0;
        this.color = color;
    }
    
    public FiguraGeometrica (Integer x, Integer y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
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
