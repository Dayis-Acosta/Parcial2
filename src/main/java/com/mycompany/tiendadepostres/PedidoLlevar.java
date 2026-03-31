
package com.mycompany.tiendadepostres;

import com.murcia.utils.*;

public class PedidoLlevar {
    
   private String Pedido;
   private Cliente Cliente;
   private int Cantidad;
   
  
   //metodo
   public PedidoLlevar(){}
   
   public int CantDeCadaPostres(int CantRequerida){
       // cantidad de postres que quiere el cliente en el pedido
       return CantRequerida;
   }
   public PedidoLlevar (String Pedido, Cliente Cliente, int Cantidad){
       this.Pedido = Pedido;
       this.Cliente= Cliente;
       this.Cantidad= Cantidad;
   }
   public String Registrar (String Pedido, String Cliente, int Cantidad ){
       ListaEnlazada lis = new ColaEnlazada();
       lis.add(Pedido + ", " + Cliente + ", " +Cantidad);
       //System.out.println(lis);
       return lis + ", ";
   }
   
   public String toString(){
       return "";
   }
    //guarda en una lista de pedido, la informacion del cliente
}
