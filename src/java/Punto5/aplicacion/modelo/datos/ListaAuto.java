/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.aplicacion.modelo.datos;



import Punto5.aplicacion.modelo.dominio.Auto;
import java.util.ArrayList;


public class ListaAuto {
    private ArrayList <Auto> lista;

    public ListaAuto() {
        lista=new ArrayList();
    }

    public ListaAuto(ArrayList<Auto> lista) {
        this.lista = lista;
    }
    
    public void agregarAutos(Auto unAuto){
        getLista().add(unAuto);
    }
    public void modificarAutos(Auto unAuto){
        for(Auto a:lista){
            if (a.getPatente()==unAuto.getPatente()){
                getLista().set(lista.indexOf(a), unAuto);
                break;
               
            }
        }
    }
     public void eliminarAutos(Auto unAuto){
        for(Auto a:lista){
           // if (a.getPatente()==unAuto.getPatente())
           if (a.getPatente().equals(unAuto.getPatente())){
                getLista().remove(lista.indexOf(a));
                break;
               
            }
        }
    }

   
    
    
    /**
     * @return the lista
     */
    public ArrayList <Auto> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList <Auto> lista) {
        this.lista = lista;
    }
    
}
