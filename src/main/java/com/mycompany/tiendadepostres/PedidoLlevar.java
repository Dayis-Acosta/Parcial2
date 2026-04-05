
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class PedidoLlevar {
    
   private Postre Pedido;
   private Cliente Cliente;
   private int Cantidad;
   
   //metodo
   public PedidoLlevar(){}
   public PedidoLlevar (Postre Pedido, Cliente Cliente, int Cantidad){
       this.Pedido = Pedido;
       this.Cliente= Cliente;
       this.Cantidad= Cantidad;
   }
   
   public int getCantidad (int Cantidad){
       return Cantidad;
   }
   public void setCantidad (int Cantidad){
       this.Cantidad= Cantidad;
   }
   
   public String toString(){
       return "";
   }
    //guarda en una lista de pedido, la informacion del cliente
}
