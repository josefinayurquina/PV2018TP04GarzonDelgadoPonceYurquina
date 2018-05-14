/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.aplicacion.controlador;

import Punto1.aplicacion.dominio.Temperatura;
import Punto1.aplicacion.modelo.datos.ConversorTemperatura;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Florencia
 */
@ManagedBean
@ViewScoped
public class TemperaturaFormBean implements Serializable{
   private double numt,r=0;
   private char TT,TC =' ';
   private ConversorTemperatura cT ;
   private Temperatura unaTemperatura;
    
    public TemperaturaFormBean() {
        cT=new ConversorTemperatura();
       unaTemperatura=new Temperatura();
    }

    public void guardarT(){
           unaTemperatura.setNumT(numt);
         
           cT.añadirT(numt);
          
    }
    public void convertir(){
        double res=0;
       if (TT== 'C'||TT== 'c'){
           if ((getTC()== 'F') ||( getTC()== 'f')){
               res=cT.CaF(numt);
           }
           else
            if (getTC()=='K' || getTC()=='k'){
                res=cT.CaK(numt);
            }
           if (getTC() =='C' || getTC() =='c'){
                res=numt;
            }
           
              
       }
       if (TT== 'F' || TT== 'f'){
           if (getTC() == 'C' || getTC() == 'c'){
               res=cT.FaC(numt);
           }
           else
            if (getTC() =='K' ||getTC() =='k'){
                res=cT.FaK(numt);
            }
            if (getTC() =='F'|| getTC() =='f'){
                res=numt;
            }
        
                
       }
       if (TT== 'K'||TT== 'k'){
           if (getTC() == 'F'||getTC() =='f'){
              res= cT.KaF(numt);
           }
           else
            if (getTC() =='C' ||getTC() =='c'){
              res=  cT.KaC(numt);
            }
        if (getTC() =='K'|| getTC() =='k'){
                res=numt;
            }
       }
       
        setR(res);
           
    }
    
    
    public double getNumt() {
        return numt;
    }

    /**
     * @param numt the numt to set
     */
    public void setNumt(double numt) {
        this.numt = numt;
    }

    /**
     * @return the tiptem
     */


    /**
     * @return the cT
     */
    public ConversorTemperatura getcT() {
        return cT;
    }

    /**
     * @param cT the cT to set
     */
    public void setcT(ConversorTemperatura cT) {
        this.cT = cT;
    }

    /**
     * @return the unaTemperatura
     */
    public Temperatura getUnaTemperatura() {
        return unaTemperatura;
    }

    /**
     * @param unaTemperatura the unaTemperatura to set
     */
    public void setUnaTemperatura(Temperatura unaTemperatura) {
        this.unaTemperatura = unaTemperatura;
    }
   
    
   

   
    public char getTT() {
        return TT;
    }

    /**
     * @param TT the TT to set
     */
    public void setTT(char TT) {
        this.TT = TT;
    }

    /**
     * @return the TC
     */
    public char getTC() {
        return TC;
    }

    /**
     * @param TC the TC to set
     */
    public void setTC(char TC) {
        this.TC = TC;
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }

    
}
