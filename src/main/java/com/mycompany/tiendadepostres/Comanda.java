
package com.mycompany.tiendadepostres;


public class Comanda {
    private int nmesa;
    private int cantPostre;
    private Postre postre;
    private Cliente cliente;
    
    
    public Comanda(){}
    public Comanda(int nmesa, int cantPostre, Postre postre, Cliente cliente) {
        this.nmesa = nmesa;
        this.cantPostre = cantPostre;
        this.postre = postre;
        this.cliente = cliente;
    }
    
    public int getNmesa() {
        return nmesa;
    }

    public void setNmesa(int nmesa) {
        this.nmesa = nmesa;
    }

    public int getCantPostre() {
        return cantPostre;
    }

    public void setCantPostre(int cantPostre) {
        this.cantPostre = cantPostre;
    }
   
    public String mostrarComanda(){
        return "Cliente: " + cliente.InfoComanda() + 
                "\nNúmro de mesa: " + nmesa +
                "\nCandidad de postres: " + cantPostre ;
    }
}
