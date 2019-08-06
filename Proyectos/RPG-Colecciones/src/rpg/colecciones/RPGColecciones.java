/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg.colecciones;

/**
 *
 * @author meschoyez
 */
public class RPGColecciones {

public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        // ProbarBallesta();
         ProbarBolsa();
        // ProbarHeroe();
    }

/*    public static void ProbarHeroe () {
        Heroe heroe = new Heroe();
        Objetos ball;
        Ballesta ballesta = new Ballesta();
        ball = ballesta;
        ballesta.setNombre("Ballesta");
        Flechas f = new Flechas();
        ballesta.setFlechas(f);
        
        // Verifica si puede agregar objeto
        heroe.TomarObjetoDelSuelo(ball);
        System.out.println(heroe.getBolsa().getObjetosEnLaBolsa());

        ball.setPeso(30);
        // Verifica si puede agregar objeto pesado
        heroe.TomarObjetoDelSuelo(ball);
        System.out.println(heroe.getBolsa().getObjetosEnLaBolsa());


        // Verifica si puede agregar objeto null
        heroe.TomarObjetoDelSuelo(null);
        System.out.println(heroe.getBolsa().getObjetosEnLaBolsa());

        // Verificar Atacar
        try {
            heroe.Atacar();
            System.out.println("OK");
        }
        catch (NoEsArmaException e) {
            System.out.println("ERROR");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("ERROR");
        }

        // Verificar Atacar sin municion
        f.setCantidad(0);
        try {
            heroe.Atacar();
            System.out.println("ERROR");
        }
        catch (NoEsArmaException e) {
            System.out.println("ERROR");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("OK");
        }

        // Verificar Atacar sin arma
        Objetos elixir = new Elixir();
        elixir.setNombre("Elixir");
        heroe.setObjeto(elixir);
        try {
            heroe.Atacar();
            System.out.println("ERROR");
        }
        catch (NoEsArmaException e) {
            System.out.println("OK");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("ERROR");
        }
    }
*/

    public static void ProbarBolsa () {
        Bolsa bolsa = new Bolsa();
        Espada esp = new Espada();
        esp.setPeso(5);
        esp.setDanio(4);
        esp.setNombre("Espada de Oro");

        // Verifica inicializacion correcta
        System.out.println(bolsa.getPesoActual());
        System.out.println(bolsa.getPesoLibre());

        // Verifica agregado de nuevo objeto
        try {
            System.out.println(bolsa.getObjetosEnLaBolsa());
            bolsa.addObjeto(esp);
            System.out.println(bolsa.getObjetosEnLaBolsa());
        }
        catch (BolsaLlenaException e) {
            System.out.println("ERROR");
        }

        // Verifica peso actual con agregado de nuevo objeto
        try {
            System.out.println(bolsa.getPesoActual());
            bolsa.addObjeto(esp);
            System.out.println(bolsa.getPesoActual());
        }
        catch (BolsaLlenaException e) {
            System.out.println("ERROR");
        }

        // Verifica peso Libre con agregado de nuevo objeto
        try {
            System.out.println(bolsa.getPesoLibre());
            bolsa.addObjeto(esp);
            System.out.println(bolsa.getPesoLibre());
        }
        catch (BolsaLlenaException e) {
            System.out.println("ERROR");
        }

        // Verifica no se puede agregar nuevo objeto por falta espacio
        try {
            esp.setPeso(30);
            bolsa.addObjeto(esp);
            System.out.println("ERROR");
        }
        catch (BolsaLlenaException e) {
            System.out.println("OK");
        }

        // Verifica incremento de peso
        System.out.println(bolsa.getPesoActual());
        System.out.println(bolsa.getPesoLibre());
        bolsa.addPeso(5);
        System.out.println(bolsa.getPesoActual());
        System.out.println(bolsa.getPesoLibre());
    }

/*    public static void ProbarBallesta () {
        Ballesta ballesta = new Ballesta();
        ballesta.setNombre("Ballesta simple");
        Flechas flecha = new Flechas();
        flecha.setDanio(2);
        flecha.setNombre("Flecha de Madera");

        // Intenta disparar sin flechas asignadas
        try {
            ballesta.Atacar();
            System.out.println("ERROR");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("OK");
        }

        // Verifica que se configure el daño según tipo de flecha
        System.out.println(ballesta.getDanio());
        ballesta.setFlechas(flecha);
        System.out.println(ballesta.getDanio());
        flecha.setDanio(4);
        ballesta.setFlechas(flecha);
        System.out.println(ballesta.getDanio());

        // Ataca cuando está todo OK
        try {
            Flechas f = ballesta.getFlechas();
            System.out.println(f.getCantidad());
            ballesta.Atacar();
            System.out.println(f.getCantidad());
            System.out.println("OK");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("ERROR");
        }

        // Intenta atacar cuando se acabaron las flechas
        try {
            Flechas f = ballesta.getFlechas();
            f.setCantidad(0);
            System.out.println(f.getCantidad());
            ballesta.Atacar();
            System.out.println(f.getCantidad());
            System.out.println("ERROR");
        }
        catch (ArmaDescargadaException e) {
            System.out.println("OK");
        }

        // Intenta recargar arma
        Objetos devueltas;
        Objetos obj = new Ballesta();
        try {
            devueltas = ballesta.RecargarArma(obj);
            System.out.println("ERROR");
        }
        catch (CombinacionNoPermitidaException e) {
            System.out.println("OK");
        }
        catch (ArmaNoRecargableException e) {
            System.out.println("ERROR");
        }


        // Intenta recargar arma
        Flechas otras = new Flechas();
        Flechas tmp = ballesta.getFlechas();
        // Objetos devueltas;
        otras.setDanio(8);
        otras.setNombre("Flechas de Hierro");
        // Objetos obj = otras;
        obj = otras;
        try {
            devueltas = ballesta.RecargarArma(obj);
            System.out.println(ballesta.getDanio());
            System.out.println(devueltas.equals(tmp));            
            System.out.println("OK");
        }
        catch (CombinacionNoPermitidaException e) {
            System.out.println("ERROR");
        }
        catch (ArmaNoRecargableException e) {
            System.out.println("ERROR");
        }

    }
*/
    
}