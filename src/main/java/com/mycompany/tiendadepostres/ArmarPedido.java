
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class ArmarPedido {
    private ListaEnlazada armarPedido;
    
    public ArmarPedido(){
    }
    public ArmarPedido(ListaEnlazada armarPedido){
        this.armarPedido = armarPedido;
    }
    
    public void AgregarPedido (Object pedido) {
        ListaEnlazada armarPedido = new ColaEnlazada();
        armarPedido.add(pedido);
    }
    public String mostrarPedido (){
        for (int i=0; i<=armarPedido.size(); i++){
            return armarPedido.get(i) + "\n__________________________________";
        } 
        return null;
    }
}
