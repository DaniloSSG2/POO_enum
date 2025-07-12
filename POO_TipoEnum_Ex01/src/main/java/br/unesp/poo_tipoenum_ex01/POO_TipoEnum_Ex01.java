/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.unesp.poo_tipoenum_ex01;

/**
 *
 * @author poo
 */
import java.util.Scanner;

public class POO_TipoEnum_Ex01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
     
        
        try{
            System.out.println("Digite a cor\n");
            String cor = sc.nextLine().toUpperCase();
            for(COLOR color : COLOR.valueOf(cor)){
                System.out.println("Cor encontrada: "+color.getCor());   
            }
            System.out.println("Todas as cores:\n");
            for(COLOR color : COLOR.values()){
                System.out.println("Constante: "+color);
                System.out.println("Nome: "+color.getCor());
                System.out.println("Nome: "+color.getCodigo());
            }
            
        
        }catch(Exception e){
            System.out.println("Cor nao existe!!");
        }
        
      
    }
}
