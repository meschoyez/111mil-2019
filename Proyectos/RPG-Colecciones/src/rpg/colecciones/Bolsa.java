package rpg.colecciones;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map;

/** Modela la bolsa que lleva el héroe.
    La espada es el contenido mínimo y existe desde el primer momento.
    Todos los objetos forman parte de una lista y los objetos
    especiales se incluyen en un mapa.
 */

public class Bolsa {
    private Map<String, Objetos> porNombre;
    private Integer PESO_MAXIMO;
    private Integer pesoActual;

    /** La bolsa se inicializa conteniendo la espada como único
     *  elemento. Tiene dos entradas, con el nombre "espada" y
     *  con el nombre configurado.
     */
    public Bolsa () {
        porNombre = new TreeMap<>();
        PESO_MAXIMO = 20;
        pesoActual = 0;
        Objetos o = new Espada();
        o.setNombre("Espada de Acero");
        o.setPeso(2);
        try {
            addObjeto(o);
            porNombre.put("espada", o);
        }
        catch (Exception e) {
            throw new IllegalArgumentException(e.toString());
        }
    }

    /** Agrega un objeto a la bolsa, siempre y
     *  cuando haya lugar suficiente.
     *  @param obj El objeto para agregar en la bolsa.
     *  @throws BolsaLlenaException Si no hay lugar suficiente.
     */
    public void addObjeto (Objetos obj) throws BolsaLlenaException {
        // Implementar
    }

    /** Quita un objeto de la bolsa, si .
     *  @param obj El objeto a quitar de la bolsa.
     *  @throws NullPointerException Cuando el objeto no está en la bolsa.
     */
    public Objetos getObjeto (String nombre) {
        Objetos tmp;
        tmp = porNombre.remove(nombre);
        addPeso(-tmp.getPeso());
        return tmp;
    }

    /** Devuelve la lista de objetos almacenados en la bolsa.
     *  @return ArrayList<Objetos> Los objetos de la bolsa.
     */
    public ArrayList<Objetos> getObjetosEnLaBolsa() {
        return new ArrayList<Objetos>(porNombre.values());
    }


    /** Devuelve la espada principal.
     * 
     * @return Objetos La espada principal
     */
    public Objetos getEspada () {
        return porNombre.get("espada");
    }

    /** Devuelve el peso maximo que puede almacenarse para un
     *  momento dado. Cambia según se agregan o quitan objetos.
     *  @return El peso máximo a agregar.
     */
    public Integer getPesoLibre () {
        // Implementar
        return null;
    }

    /** Incrementa el peso total almacenado en la bolsa.
     *  Se utiliza para agregar como para quitar objetos.
     *  @param peso El peso a quitar/agregar.
      */
    public void addPeso (Integer peso) {
        // Implementar
    }

    public Integer getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(Integer pesoActual) {
        this.pesoActual = pesoActual;
    }

}
