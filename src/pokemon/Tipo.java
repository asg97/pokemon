/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Objects;

public abstract class Tipo implements Capturar {

    String tipo;
    String nombre;
    Double nivelSalud;
    Double nivelAtaque;
    Double nivelDefensa;

    public Tipo(String tipo, String nombre, Double nivelSalud, Double nivelAtaque, Double nivelDefensa) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.nivelSalud = nivelSalud;
        this.nivelAtaque = nivelAtaque;
        this.nivelDefensa = nivelDefensa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(Double nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public Double getNivelAtaque() {
        return nivelAtaque;
    }

    public void setNivelAtaque(Double nivelAtaque) {
        this.nivelAtaque = nivelAtaque;
    }

    public Double getNivelDefensa() {
        return nivelDefensa;
    }

    public void setNivelDefensa(Double nivelDefensa) {
        this.nivelDefensa = nivelDefensa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.tipo);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.nivelSalud);
        hash = 83 * hash + Objects.hashCode(this.nivelAtaque);
        hash = 83 * hash + Objects.hashCode(this.nivelDefensa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tipo other = (Tipo) obj;
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.nivelSalud, other.nivelSalud)) {
            return false;
        }
        if (!Objects.equals(this.nivelAtaque, other.nivelAtaque)) {
            return false;
        }
        if (!Objects.equals(this.nivelDefensa, other.nivelDefensa)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Tipo{" + "tipo=" + tipo + ", nombre=" + nombre + ", nivelSalud=" + nivelSalud + ", nivelAtaque=" + nivelAtaque + ", nivelDefensa=" + nivelDefensa + '}';
    }

    @Override
    public boolean Capturable() {
       
        
        return false;
        
    }

}
