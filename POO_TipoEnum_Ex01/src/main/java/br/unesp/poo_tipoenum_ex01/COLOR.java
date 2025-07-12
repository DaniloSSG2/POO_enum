/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.unesp.poo_tipoenum_ex01;

/**
 *
 * @author poo
 */
public enum COLOR {
    VERMELHO("Red","F0280803"),
    BRANCO("White","F34873248"),
    PRETO("Black", "F4584758");
    
    private final String Cor;
    private final String Codigo;

    private COLOR(String Cor, String Codigo) {
        this.Cor = Cor;
        this.Codigo = Codigo;
    }

    public String getCor() {
        return Cor;
    }

    public String getCodigo() {
        return Codigo;
    } 
}
