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
            if (opc == '1'){
                //Comanda();
                System.out.println("Comanda");
            }    
            if (opc == '2'){
               //PedidoLevar();
               System.out.println("pedido llevar");
            }
        } while (opc != SALIR);
    }  
}
