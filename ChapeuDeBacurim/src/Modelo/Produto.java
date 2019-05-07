/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Koala
 */
public class Produto {
   private double preco;
   private String nome;
   private int idDoproduto; 

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdDoproduto() {
        return idDoproduto;
    }

    public void setIdDoproduto(int idDoproduto) {
        this.idDoproduto = idDoproduto;
    }
   
}
