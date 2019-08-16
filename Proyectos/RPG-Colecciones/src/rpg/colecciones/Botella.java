package rpg.colecciones;

public class Botella extends Objetos {
    private static final Integer PESO_PROPIO = 2;
    private Liquido contenido;

    public Botella() {
        setPeso(PESO_PROPIO);
        GenerarNombre();
    }    

    /**
     * Llena la botella con el liquido indicado agregando el peso del
     * nuevo liquido.  Solo puede rellenarse cuando esta vacia.
     * Genera el nuevo nombre de la botella.
     * @param l El liquido para rellenar la botella
     * @throws ContenedorLlenoException Cuando la botella ya tiene contenido
     * 
     */
    public void LlenarBotella (Liquido l) throws ContenedorLlenoException {
        // Completar metodo
    }

    /**
     * Vacia el contenido de la botella y actualiza peso.
     * La botella queda lista para recargar.
     * Genera el nuevo nombre de la botella.
     */
    public void VaciarBotella () {
        // Completar metodo
    }

    /**
     * Establece la descripcion de la botella con su contenido
     * correspondiente, por ej. "Botella con Agua".
     * En caso de que no tenga contenido, utiliza el texto
     * "Botella vacia"
     */
    public void GenerarNombre () {
        // Completar metodo
    }

    /**
     * Devuelve verdadero o falso segun tenga o no contenido.
     * @return true en caso de estar vacia
      */
    public Boolean isVacia () { 
        // Completar metodo
        throw new IllegalStateException ();
    }

    /**
     * Devuelve verdadero en caso de contener algun tipo de elixir
     * y falso si esta vacia o contiene otro tipo de liquido.
     * @return true en caso de contener algun tipo de elixir
      */
      public Boolean hasElixir () {
        // Completar metodo
        throw new IllegalStateException ();
    }

    /**
     * Devuelve verdadero en caso de contener agua
     * y falso si esta vacia o contiene otro tipo de liquido.
     * @return true en caso de contener agua
      */
      public Boolean hasAgua () {
        // Completar metodo
        throw new IllegalStateException ();
    }
  
    /**
     * Devuelve verdadero en caso de contener vino
     * y falso si esta vacia o contiene otro tipo de liquido.
     * @return true en caso de contener vino
      */
      public Boolean hasVino () {
        // Completar metodo
        throw new IllegalStateException ();
    }
  
    public Liquido getContenido() {
        return contenido;
    }

    public void setContenido(Liquido contenido) {
        this.contenido = contenido;
    }

}
