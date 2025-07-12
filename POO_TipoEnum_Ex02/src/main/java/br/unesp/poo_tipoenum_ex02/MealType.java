/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unesp.poo_tipoenum_ex02;

/**
 *
 * @author poo
 */
public enum MealType {
    
    BREAKFAST("Cafe da manha","07:00-10:00"),
    LAUNCH("Almoco", "10:00-13:00"),
    DINNER("Jantar","20:00-21:00"), 
    DESSERT("sobremesa","21:00-22:00");
    
    private final String refeicao;
    private final String horario;

    private MealType(String refeicao, String horario) {
        this.refeicao = refeicao;
        this.horario = horario;
    }

    public String getRefeicao() {
        return refeicao;
    }

    public String getHorario() {
        return horario;
    }
    
    
}
