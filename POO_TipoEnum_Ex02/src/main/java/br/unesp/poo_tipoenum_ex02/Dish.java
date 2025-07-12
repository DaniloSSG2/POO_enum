/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unesp.poo_tipoenum_ex02;

/**
 *
 * @author poo
 */
public enum Dish {
    OVOFRITO("Ovo Frito", 5.00, MealType.BREAKFAST),
    FEIJOADA("Feijoada", 20.5, MealType.DINNER),
    BOLO("Bolo", 30.50, MealType.DESSERT),
    SUSHI("Sushi", 19.90, MealType.LAUNCH);
    
    private final String nome;
    private final double preco;
    private final MealType tipo;

    private Dish(String nome, double preco, MealType tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    
    
}
