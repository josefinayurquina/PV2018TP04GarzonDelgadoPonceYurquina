/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.aplicacion.modelo.datos;

import Punto1.aplicacion.dominio.Temperatura;

/**
 *
 * @author Florencia
 */
public class ConversorTemperatura {
    private Temperatura tm;
    private double num;
    private String tipoTemp;

    public ConversorTemperatura() {
        tm=new Temperatura ();
    }
    public void añadirT(double n){
        getTm().setNumT(n);
    }
    public void añadirTT(String tipo){
        setTipoTemp(tipo);
        getTm().setTipoTemp(tipo);
    }
    
    
    public double CaF(double n){
       return ((9*n)/5+32);
    }
    public double CaK(double n){
       return (n+273.15);
    }
    public double FaC(double n){
       return (5*(n-32)/9);
    }
    public double FaK(double n){
       return ((5*(n-32)/9)+273.15);
    }
    public double KaC(double n){
       return (n-273.15);
    }
     public double KaF(double n){
       return ((9*(n-273.15)/5)+32);
    }

    /**
     * @return the tm
     */
    public Temperatura getTm() {
        return tm;
    }

    /**
     * @param tm the tm to set
     */
    public void setTm(Temperatura tm) {
        this.tm = tm;
    }

    /**
     * @return the num
     */
    public double getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(double num) {
        this.num = num;
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
