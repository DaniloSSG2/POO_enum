/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unesp.poo_tipoenum_ex02;

/**
 *
 * @author poo
 */
import java.util.*;

public class POO_TipoEnum_Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();
        String opt ="";
        
        while(!"0".equals(opt)){
            System.out.println("Digite o pedido\n0-para sair");
            opt = sc.nextLine();
            if(!"0".equals(opt)){
                System.out.println(order.addDish(opt));
            }
        }
        System.out.println("Resumo do pedido: "+order.total()+" "+order.getPratos());
        
    }
}
