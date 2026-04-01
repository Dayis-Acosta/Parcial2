
package com.mycompany.tiendadepostres;


public class Postre {
  //Atributos 
    private String  nombrep;
    private int porciones;
    
  
    //Metodos
    public Postre (){}
    public Postre(String nombrep, int porciones) {
        this.nombrep = nombrep;
        this.porciones = porciones;
    }
    public String getNombrep() {
        return nombrep;
    }

    public int getPorciones() {
        return porciones;
    }
    
    public String ListaPostres (String nPostres){
        //se genera la lista de postres
        return nPostres;
    }
    
    
}
