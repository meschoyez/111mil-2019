/**
 * Modela los objetos que el héroe lleva en su bolsa
 */

public abstract class Objetos {
    private Integer peso;
    private String nombre;

    public Objetos () {
        peso = -1;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }

    

}