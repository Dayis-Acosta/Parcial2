//Integrantes: Katherin Samantha Tabares Castillo (6014474) y Dayanna Acosta Ledesma (6014503)

package com.mycompany.tiendadepostres;

import com.murcia.utils.*;
public class TiendaDePostres {

    public static void main(String[] args) {
        
        final char SALIR = '3';
        String []opt = {"1. Comanda", "2. Para llevar", "3. Terminar"};
        Menu mnu = new Menu(opt, 'V', " ", "Tienda de Postes EeveeBuron");
        char opc;

        do {
            Consola.clrscr(); // Borra pantalla
            Consola.gotoxy(0, 0);
            opc = mnu.select("Su opción [1-3]: ");
            Input.nextLine("");
            if (opc == '1'){ //Comanda
                Comanda();
                
            }    
            if (opc == '2'){//pedido llevar
               PedidoLlevar();
               
            }
        } while (opc != SALIR);
        
    }  
    
    public static void Comanda() {
        ArmarPedido Comanda = new ArmarPedido();
        String n, ps;
        int pr, m;
        n=Input.nextLine("Nombre cliente: ");
        Cliente c = new Cliente(n, "No necesita", "No necesita");
        
        ps = Input.nextLine("Nombre del postre: ");
        pr = Input.nextInt("Porcion: ");

        Postre p = new Postre(ps, pr);
        m = Input.nextInt("Numero de mesa: ");
        
        Comanda co = new Comanda(m, pr, p, c);
        Comanda.AgregarPedido(co);
    }
    public static void PedidoLlevar() {
        ArmarPedido PedidoLlevar = new ArmarPedido();
        String n, t, d, ps;
        int pr;
        n=Input.nextLine("Nombre cliente: ");
        t=Input.nextLine("Telefono: ");
        d=Input.nextLine("Direccion: ");
        Cliente c = new Cliente(n, t, d);
        
        ps = Input.nextLine("Nombre del postre: ");
        pr = Input.nextInt("Precio: ");

        Postre p = new Postre(ps, pr);
    }
    
}
