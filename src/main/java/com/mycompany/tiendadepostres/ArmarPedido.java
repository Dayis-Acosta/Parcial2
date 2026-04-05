
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class ArmarPedido {
    private ListaEnlazada armarPedido;
    
    public ArmarPedido(){
        armarPedido = new ColaEnlazada();
    }
    public ArmarPedido(ListaEnlazada armarPedido){
        this.armarPedido = armarPedido;
    }
    
    public void AgregarPedido (Object pedido) {
        armarPedido.add(pedido);
    }
    public String mostrarPedido (){
        String resultado = "";
        for (int i=0; i < armarPedido.size(); i++){
            resultado += armarPedido.get(i) + "\n__________________________________";
        } 
        return resultado;
    }
}
