package primerosobjetos;

import java.awt.*;
import java.awt.geom.*;

/**
 * Class ReboteDePelota -representa una pelota que tiene en cuenta el efecto de la 
 * gravedad. La pelota puede moverse. Los detalles del movimiento estan determinados
 * por la misma pelota. Cae hacia abajo acel�randose por el efecto gravitatorio,
 * y rebota hacia arriba cuando golpea el piso.
 *
 * Este movimiento puede ser iniciado repetidamente llamando al m�todo "mover"
 * 
 * @author Bruce Quig
 * @author Michael Kolling (mik)
 * @author David J. Barnes
 *
 * @version 2008.03.30
 */

public class ReboteDePelota
{
    private static final int GRAVEDAD = 5;  // efecto gravitatorio

    private int desaceleracionDePelota = 2;
    private Ellipse2D.Double circulo;
    private Color color;
    private int diametro;
    private int xPosicion;
    private int yPosicion;
    private final int posicionDelPiso;      // posici�n del piso
    private Canvas canvas;
    private int velocidadY = 1;                // velocidad vertical inicial

    /**
     * Constructor para objectos de la clase ReboteDePelota
     *
     * @param xPos  coordenada horizontal de la pelota
     * @param yPos  coordenada vertical de la pelota
     * @param diametroDePelota  el diametro (en pixels) de la pelota
     * @param colorDePelota  el color de la pelota
     * @param posPiso  la posici�n del piso (donde la pelota rebotar�)
     * @param cuadroCanvas  el canvas donde se dibujar� la pelota
     */
    public ReboteDePelota(int xPos, int yPos, int diametroDePelota, Color colorDePelota,
                        int posPiso, Canvas cuadroCanvas)
    {
        xPosicion = xPos;
        yPosicion = yPos;
        color = colorDePelota;
        diametro = diametroDePelota;
        posicionDelPiso = posPiso;
        canvas = cuadroCanvas;
    }

    /**
     * Dibuja la pelota en su posici�n sobre el canvas.
     **/
    public void dibujar()
    {
        canvas.setColorDeLapiz(color);
        canvas.rellenarCirculo(xPosicion, yPosicion, diametro);
    }

    /**
     * Borra la pelota del canvas
     **/
    public void borrar()
    {
        canvas.borrarCirculo(xPosicion, yPosicion, diametro);
    }    

    /**
     * Mueve esta pelota de acuerdo a su posici�n y velocida y la re-dibuja
     **/
    public void mover()
    {
        // borra la pelota de su posici�n actual dentro del canvas
        borrar();
            
        // calcula una nueva posici�n
        velocidadY += GRAVEDAD;
        yPosicion += velocidadY;
        xPosicion +=2;

        // verifica si golpe� el suelo
        if(yPosicion >= (posicionDelPiso - diametro) && velocidadY > 0) {
            yPosicion = (int)(posicionDelPiso - diametro);
            velocidadY = -velocidadY + desaceleracionDePelota; 
        }

        // dibuja nuevamente la pelota en la nueva posici�n
        dibujar();
    }    

    /**
     * retorna la posici�n horizontal de la pelota
     */
    public int getXPosicion()
    {
        return xPosicion;
    }

    /**
     * retorna la posici�n vertical de la pelota
     */
    public int getYPosicion()
    {
        return yPosicion;
    }
}
