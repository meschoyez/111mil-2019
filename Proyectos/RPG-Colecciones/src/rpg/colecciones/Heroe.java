package rpg.colecciones;

/* Esta clase modela al personaje principal de un juego de rol
 */

public class Heroe {
    // La bolsa con los objetos recolectados
    private Bolsa bolsa;
//    private BolsaConDuplicados bolsa;
    // El nivel de vida actual y su valor maximo
    private Integer vida;
    private final Integer MAX_VIDA = 1000;
    // Objeto que tiene en las manos
    private Objetos objeto;

    /** Inicializa al heroe con el maximo nivel de vida.
    *   El objeto seleccionado inicial es la espada de acero.
    *   La espada de acero es la única arma que persiste durante
    *   todo el juego y no puede quitarse de la bolsa.
    */
    public Heroe () {
        bolsa = new Bolsa();
        objeto = bolsa.getEspada();
        setVida(MAX_VIDA);
    }

    /** Recolecta un objeto y lo agrega a la bolsa siempre y
     *  cuando haya lugar suficiente.
     *  @param obj El objeto para agregar en la bolsa
    */
    public void TomarObjetoDelSuelo(Objetos obj) {
        // Implementar
    }

    /**
     *  Guarda un objeto en la bolsa siempre y cuando haya lugar suficiente.
     *  En caso de error:
     *  - Si la bolsa está llena mostrar el mensaje "Bolsa llena"
     *  - Si el objeto es null, mostrar "No hay objeto para agregar a la bolsa"
     *  @param obj El objeto para agregar en la bolsa
    */
    public void GuardarObjeto(Objetos obj) {
        // Completar metodo
    }

    /**
     * Deja el objeto que tiene en las manos.
     * La "Espada de Acero" es el unico objeto que no se puede dejar.
     * Lanza la excepcion AccionNoPermitidaException en caso que no tenga un objeto
     * en sus manos o tenga la "Espada de Acero".
     * @throws AccionNoPermitidaException En caso de no poder dejar un objeto.
      */
    public void DejarObjeto () throws AccionNoPermitidaException {
        // Completar metodo
    }

    /**
     * Consume lo que tiene en sus manos reponiendo su nivel de vida segun
     * energia del alimento. El nuevo nivel de vida no puede superar el maximo,
     * descartando la energia sobrante.
     * Los contenedores, como ser botellas, quedan en las manos pero vacios. Si estan
     * vacios es como no tener alimento y debe lanzar excepcion.
     * @throws AccionNoPermitidaException En caso de no tener alimento en las manos.
      */
    public void ReponerEnergia () throws AccionNoPermitidaException {
        // Completar metodo
    }

    /**
     * Elige una botella de su bolsa y la devuelve.
     *
     * @param nombre Nombre de la botella
     * @return La botella elegida
     * @throws AccionNoPermitidaException En caso que no se encuentre la botella;
     */
    public Botella ElegirBotella (String nombre) throws AccionNoPermitidaException {
        // Completar metodo
        return null;
    }

    /**
     * Recarga la botella con el liquido indicado.
     * @param liq El liquido para recargar la botella.
     * @throws AccionNoPermitidaException En caso de no tener en las manos una botella.
     * @throws ContenedorLlenoException En caso que la botella este llena.
      */
    public void LlenarBotella (Liquido liq) throws AccionNoPermitidaException, ContenedorLlenoException {
        // Completar metodo
    }

    /**
     * Intenta vaciar la botella en su mano
     * @throws AccionNoPermitidaException En caso de no tener en las manos una botella.
      */
    public void VaciarBotella() throws AccionNoPermitidaException {
        // Completar metodo
    }


    /** Permite cambiar el arma que tiene el héroe en sus manos.
     *  Si el arma elegida no está en la bolsa, mantiene en sus
     *  manos el arma actual.
     *  @param nombre El nombre del arma a tomar de la bolsa.
     */
    public void ElegirArma(String nombre) {
        // Implementar
    }

    /** Hace que el héroe ataque a un enemigo. Solo es viable cuando
     *  tiene un arma lista para usar en sus manos.
     *  @throws NoEsArmaException Cuando no tiene un arma en sus manos.
     *  @throws ArmaDescargadaException Cuando el arma no tiene municiones.
      */
    public void Atacar() throws NoEsArmaException, ArmaDescargadaException {
        // Implementar
    }

    /** Permite cambiar la munición del arma que tiene el héroe en sus manos.
     *  Si es posible el cambio, la munición del arma se guarda en la bolsa y
     *  se establece la nueva munición. En caso contrario, se deja el arma
     *  como estaba.
     *  @param nombre La munición a buscar en la bolsa.
     */
    public void RecargarArma (String nombre) {
        // Implementar
    }

    public Objetos getObjeto() {
        return objeto;
    }

    public void setObjeto(Objetos objeto) {
        this.objeto = objeto;
    }

    public Bolsa getBolsa () {
        return bolsa;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
        if (this.vida >= MAX_VIDA) {
            this.vida = MAX_VIDA;
        }
    }
}
