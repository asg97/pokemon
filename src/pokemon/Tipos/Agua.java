/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon.Tipos;

import pokemon.Tipo;

public abstract class Agua extends Tipo {

    String saldulce;

    public Agua(String saldulce, String tipo, String nombre, Double nivelSalud, Double nivelAtaque, Double nivelDefensa) {
        super(tipo, nombre, nivelSalud, nivelAtaque, nivelDefensa);
        this.saldulce = saldulce;
    }

    public String getSaldulce() {
        return saldulce;
    }

    public void setSaldulce(String saldulce) {
        this.saldulce = saldulce;
    }

    @Override
    public boolean Capturable() {
        double random = Math.random() * 120 + 20;
        if ((random - this.getNivelSalud()) > this.getNivelDefensa()) {

            return true;
        } else {
            return false;

        }

    }

}
