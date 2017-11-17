/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.Tipos;

import pokemon.Tipo;

public class Planta extends Tipo {

    String habitat;

    public Planta(String habitat, String tipo, String nombre, Double nivelSalud, Double nivelAtaque, Double nivelDefensa) {
        super(tipo, nombre, nivelSalud, nivelAtaque, nivelDefensa);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public boolean Capturable() {
        double random = Math.random() * 50 + 0;
        if ((random + this.getNivelAtaque()) > this.getNivelSalud()) {

            return true;
        } else {
            return false;

        }
    }

}
