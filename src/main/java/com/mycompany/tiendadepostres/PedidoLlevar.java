
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class PedidoLlevar {
    
   private String Pedido;
   private String Cliente;
   private int Cantidad;
   
  
   //metodo
   public PedidoLlevar(){}
   
   public int CantDeCadaPostres(int CantRequerida){
       // cantidad de postres que quiere el cliente en el pedido
       return CantRequerida;
   }
   public PedidoLlevar (String Pedido, String Cliente, int Cantidad){
       this.Pedido = Pedido;
       this.Cliente= Cliente;
       this.Cantidad= Cantidad;
   }
   public void Registrar (){
       ListaEnlazada lis = new ColaEnlazada();
       lis.add(1);
   }
    //guarda en una lista de pedido, la informacion del cliente
}
