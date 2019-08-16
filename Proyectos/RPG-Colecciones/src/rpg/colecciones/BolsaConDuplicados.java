package rpg.colecciones;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/** Modela la bolsa que lleva el héroe.
    La espada es el contenido mínimo y existe desde el primer momento.
    Todos los objetos forman parte de una lista y los objetos
    especiales se incluyen en un mapa.
 */

public class BolsaConDuplicados {
    private Map<String, Objetos> porNombre;
    private Integer PESO_MAXIMO;
    private Integer pesoActual;

    /** La bolsa se inicializa conteniendo la espada como único
     *  elemento. Tiene dos entradas, con el nombre "espada" y
     *  con el nombre configurado.
     */
    public BolsaConDuplicados () {
        porNombre = new TreeMap<>();
        PESO_MAXIMO = 100;
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

    /**
     *  Agrega un objeto a la bolsa, siempre y cuando haya lugar suficiente,
     *  y actualiza el peso de la bolsa.
     *  Si existe un objeto de igual nombre, debe agregar el nuevo objeto
     *  con un sufijo numerico "-n", con n > 1.
     *  Ej: Si hay tres botellas vacias, se identifican en el mapa como
     *      "Botella vacia", "Botella vacia-2", "Botella vacia-3", siendo
     *      su orden el mismo en el que se agregaron.
     *  @param obj El objeto para agregar en la bolsa.
     *  @throws ContenedorLlenoException Si no hay lugar suficiente.
     */
    public void addObjeto (Objetos obj) throws ContenedorLlenoException {
        // Completar metodo
    }

    /**
     *  Quita un objeto de la bolsa y actualiza el peso actual de la bolsa.
     *  Si hay mas de un objeto con el mismo nombre, renombra el de sufijo
     *  mayor (ultimo agregado) para que reemplace al objeto quitado.
     *  @param nombre El objeto a quitar de la bolsa.
     *  @throws NullPointerException Cuando el objeto no está en la bolsa.
     */
    public Objetos getObjeto (String nombre) {
        // Completar metodo
        return null;
    }

    /** Devuelve la lista de objetos almacenados en la bolsa.
     *  @return ArrayList<Objetos> Los objetos de la bolsa.
     */
    public ArrayList<Objetos> getObjetosEnLaBolsa() {
        return new ArrayList<Objetos>(porNombre.values());
    }

    /** Devuelve la lista de objetos almacenados en la bolsa
     *  cuyo nombre comienza con el prefijo indicado.
     *  @param pre El prefijo a buscar
     *  @return ArrayList<Objetos> Los objetos de la bolsa.
     */
    public ArrayList<Objetos> getListaObjetosConPrefijo(String pre) {
        // Completar metodo
        return null;
    }


    /** Devuelve la espada principal.
     * 
     * @return La espada principal
     */
    public Objetos getEspada () {
        return porNombre.get("espada");
    }

    /** Devuelve el peso maximo que puede almacenarse para un
     *  momento dado. Cambia según se agregan o quitan objetos.
     *  @return El peso máximo a agregar.
     */
    public Integer getPesoLibre () {
        return PESO_MAXIMO - pesoActual;
    }

    /** Incrementa el peso total almacenado en la bolsa.
     *  Se utiliza para agregar como para quitar objetos.
     *  @param peso El peso a quitar/agregar.
      */
    public void addPeso (Integer peso) {
        setPesoActual(getPesoActual() + peso);
    }

    public Integer getPesoActual() {
        return pesoActual;
    }

    public ArrayList<String> getKeySet() {
        return new ArrayList<>(porNombre.keySet());
    }

    public void setPesoActual(Integer pesoActual) {
        this.pesoActual = pesoActual;
    }

}
