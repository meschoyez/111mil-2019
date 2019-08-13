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
public abstract class Armas extends Objetos {
    private Integer alcance;
    private Integer danio;

    public Integer getAlcance() {
        return alcance;
    }

    public void setAlcance(Integer alcance) {
        this.alcance = alcance;
    }

    public Integer getDanio() {
        return danio;
    }

    public void setDanio(Integer danio) {
        this.danio = danio;
    }

    public abstract void Atacar ();
    
    public abstract void RecargarArma (Objetos obj);

}
