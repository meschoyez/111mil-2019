package primerosobjetos;

import java.awt.*;
import java.awt.geom.*;

/**
 * Clase PelotasDemo - provee dos peque�as demostracions sobre el uso de la  
 * clase Canvas. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */

public class PelotasDemo   
{
    private Canvas miCanvas;

    /**
     * Crea un objeto PelotasDemo. Crea un nuevo canvas y lo hace visible.
     */
    public PelotasDemo()
    {
        miCanvas = new Canvas("Ball Demo", 600, 500);
        miCanvas.setVisible(true);
    }
 
    /**
     * Muestra algunas operaciones de dibujo que se pueden realizar sobre
     * un objeto Canvas.
     */
    public void demoDibujar()
    {
        miCanvas.setTipoDeLetra(new Font("helvetica", Font.BOLD, 14));
        miCanvas.setColorDeLapiz(Color.red);

        miCanvas.dibujarTexto("We can draw text, ...", 20, 30);
        miCanvas.espera(1000);

        miCanvas.setColorDeLapiz(Color.black);
        miCanvas.dibujarTexto("...draw lines...", 60, 60);
        miCanvas.espera(500);
        miCanvas.setColorDeLapiz(Color.gray);
        miCanvas.dibujarLinea(200, 20, 300, 50);
        miCanvas.espera(500);
        miCanvas.setColorDeLapiz(Color.blue);
        miCanvas.dibujarLinea(220, 100, 370, 40);
        miCanvas.espera(500);
        miCanvas.setColorDeLapiz(Color.green);
        miCanvas.dibujarLinea(290, 10, 320, 120);
        miCanvas.espera(1000);

        miCanvas.setColorDeLapiz(Color.gray);
        miCanvas.dibujarTexto("...and shapes!", 110, 90);

        miCanvas.setColorDeLapiz(Color.red);

        // la figura a dibujar y mover
        int xPos = 10;
        Rectangle rect = new Rectangle(xPos, 150, 30, 20);

        // mover el rectangulo dentro de la pantalla
        for(int i = 0; i < 200; i ++) {
            miCanvas.rellenar(rect);
            miCanvas.espera(10);
            miCanvas.borrar(rect);
            xPos++;
            rect.setLocation(xPos, 150);
        }
        // luego de moverlo, rellenarlo para que permanezca visible
        miCanvas.rellenar(rect);
    }

    /**
     * Simula dos pelotas rebotando
     */
    public void rebotar()
    {
        int piso = 400;   // posici�n de la linea del piso

        miCanvas.setVisible(true);

        // dibuja el piso
        miCanvas.dibujarLinea(50, piso, 550, piso);

        // crea y muestra dos pelotas
        ReboteDePelota pelota = new ReboteDePelota(50, 50, 16, Color.blue, piso, miCanvas);
        pelota.dibujar();
        ReboteDePelota pelota2 = new ReboteDePelota(70, 80, 20, Color.red, piso, miCanvas);
        pelota2.dibujar();

        // las hace rebotar
        boolean terminado =  false;
        while(!terminado) {
            miCanvas.espera(50);           // peque�a demora
            pelota.mover();
            pelota2.mover();
            // para una vez que la pelota ha recorrido una cierta distancia horizontal
            if(pelota.getXPosicion() >= 550 && pelota2.getXPosicion() >= 550) {
                terminado = true;
            }
        }
        pelota.borrar();
        pelota2.borrar();
    }
}
