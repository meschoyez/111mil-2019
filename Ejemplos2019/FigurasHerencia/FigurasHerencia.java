/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasherencia;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author meschoyez
 */
public class FigurasHerencia {
    private Canvas miCanvas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FigurasHerencia pantalla = new FigurasHerencia();
//        pantalla.GraficarFiguras();
        pantalla.ColeccionFiguras();
        
    }
    
    private void GraficarFiguras() {
        miCanvas = new Canvas("Figuras Geometricas", 600, 500);
        miCanvas.setVisible(true);
        
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300);

        miCanvas.setColorDeLapiz(r.getColor());
        miCanvas.rellenarRectangulo(r.getX(), r.getY(),
                         r.getAncho().intValue(), r.getLargo().intValue());

        miCanvas.setColorDeLapiz(Color.blue);
        miCanvas.rellenarCirculo(100, 100, 100);

        Triangulo t = new Triangulo( 100., 200., Color.green, 400, 0);
        
        miCanvas.setColorDeLapiz(t.getColor());
        miCanvas.rellenarTriangulo(t.getX(), t.getY(),
                t.getBase().intValue(), t.getAltura().intValue());
        
        
    }
    

    private void ColeccionFiguras () {
        miCanvas = new Canvas("Figuras Geometricas", 600, 500);
        miCanvas.setVisible(true);
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300);
        lista.add(r);
        Triangulo t = new Triangulo( 100., 200., Color.green, 400, 0);
        lista.add(t);
        r = new Rectangulo(150., 150., Color.yellow, 200, 200);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 100, 100);
        lista.add(r);
        
        for (FiguraGeometrica f : lista) {
            try {
                Rectangulo r2 = (Rectangulo) f;
                miCanvas.setColorDeLapiz(r2.getColor());
                miCanvas.rellenarRectangulo(r2.getX(), r2.getY(),
                         r2.getAncho().intValue(), r2.getLargo().intValue());
                System.out.println("Lado1 = " + r2.getAncho() + " lado2 = " + r2.getLargo());
            }
            catch (ClassCastException e) {
            }
        }
//        Triangulo t2 = (Triangulo)f;
        
//        System.out.println("Base = " + t2.getBase() + " altura = " + t2.getAltura());
    }
    
}
