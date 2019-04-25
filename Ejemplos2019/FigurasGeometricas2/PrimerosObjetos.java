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
public class PrimerosObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(10.0, 15.0, "Negro");
        Rectangulo r2 = new Rectangulo(3.5, 4.5, "Rojo");
        
        System.out.println("R1 tiene largo = " + r1.getLargo()
                        + " y ancho = " + r1.getAncho());
        System.out.println("R2 tiene largo = " + r2.getLargo()
                        + " y ancho = " + r2.getAncho());
    
        r1.setLargo(8.0);
        System.out.println("R1 tiene largo = " + r1.getLargo()
                        + " y ancho = " + r1.getAncho());
    
        Double perimetro  = r1.Perimetro();
        Double superficie = r1.Superficie();
        System.out.println("R1 tiene sup. = " + superficie
                + " y per. = " + perimetro);
        
        perimetro  = r2.Perimetro();
        superficie = r2.Superficie();
        System.out.println("R2 tiene sup. = " + superficie
                + " y per. = " + perimetro);
        
        PelotasDemo p;
        p = new PelotasDemo();
//        p.rebotar();
        p.demoDibujar();
        
    }
    
}
