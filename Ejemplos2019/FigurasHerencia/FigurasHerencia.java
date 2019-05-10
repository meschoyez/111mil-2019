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
public class FigurasHerencia {
    private Canvas miCanvas;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FigurasHerencia pantalla = new FigurasHerencia();
        pantalla.GraficarFiguras();
        
    }
    
    private void GraficarFiguras() {
        miCanvas = new Canvas("Figuras Geometricas", 600, 500);
        miCanvas.setVisible(true);

        miCanvas.setColorDeLapiz(Color.red);
        miCanvas.rellenarRectangulo(300, 300, 100, 50);

        miCanvas.setColorDeLapiz(Color.blue);
        miCanvas.rellenarCirculo(100, 100, 100);

        miCanvas.setColorDeLapiz(Color.green);
        miCanvas.rellenarTriangulo(400, 0, 100, 200);

    }

    
    
}
