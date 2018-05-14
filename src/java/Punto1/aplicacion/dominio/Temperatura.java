/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.aplicacion.dominio;

import java.io.Serializable;

/**
 *
 * @author Florencia
 */
public class Temperatura implements Serializable {
    private Double numT;
    private String tipoTemp;

    public Temperatura() {
    }

    public Temperatura(Double numT, String tipoTemp) {
        this.numT = numT;
        this.tipoTemp = tipoTemp;
    }

    /**
     * @return the numT
     */
    public Double getNumT() {
        return numT;
    }

    /**
     * @param numT the numT to set
     */
    public void setNumT(Double numT) {
        this.numT = numT;
    }

    /**
     * @return the tipoTemp
     */
    public String getTipoTemp() {
        return tipoTemp;
    }

    /**
     * @param tipoTemp the tipoTemp to set
     */
    public void setTipoTemp(String tipoTemp) {
        this.tipoTemp = tipoTemp;
    }
    
}
