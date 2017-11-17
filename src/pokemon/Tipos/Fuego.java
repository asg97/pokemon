/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.Tipos;

import pokemon.Tipo;

public class Fuego
        extends Tipo {

    public Fuego(String tipo, String nombre, Double nivelSalud, Double nivelAtaque, Double nivelDefensa) {
        super(tipo, nombre, nivelSalud, nivelAtaque, nivelDefensa);
    }

    @Override
    public boolean Capturable() {
        double random = Math.random() * 60 + 10;
        if ((random + this.getNivelSalud()) > (this.getNivelAtaque() + this.getNivelDefensa())) {

            return true;
        } else {
            return false;

        }

    }

}
