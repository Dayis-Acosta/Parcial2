
package com.mycompany.tiendadepostres;


public class Comanda {
    private int nmesa;
    private int cantMesa;
    
    public Comanda(){}
    public Comanda(int nmesa, int cantmesa) {
        this.nmesa = nmesa;
        this.cantMesa = cantmesa;
    }
    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public int getCantmesa() {
        return cantMesa;
    }

    public void setCantmesa(int cantmesa) {
        this.cantMesa = cantmesa;
    }
   
    public void mostrarComanda(){
        System.out.println("Número de mesa: " + nmesa);
        System.out.println("Cantidad en mesa: " + cantMesa);
    }
}
