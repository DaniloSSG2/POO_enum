/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unesp.poo_tipoenum_ex02;

/**
 *
 * @author poo
 */
import java.util.*;

public class Order {
    private int pedido;
    List<Dish> dish = new ArrayList<Dish>();
 
    
    public String addDish(String name){
        try{
        dish.add(Dish.valueOf(name.toUpperCase()));
        return "Prato adcionado";
    }catch(Exception e){
        return "Prato nao existe";
        }
    }
    public double total(){
        double soma = 0;
        for(Dish x: dish){
            soma += x.getPreco();
        }
        return soma;
    }
    public String getPratos(){
        String pratos = "";
        for(Dish x: dish){
            pratos += x +" ";
        }
        return pratos;  
    }
    
}
