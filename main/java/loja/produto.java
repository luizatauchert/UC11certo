/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

/**
 *
 * @author LUIZATAUCHERTSCHOLL
 */
public class produto {
   private String nome;
   private int quantidade;
   
   public produto(String nome, int quantidade){
       this.nome= nome;
       this.quantidade=quantidade;
}

public String getNome(){
    return nome;
}


public int getQuantidade(){
    return quantidade;
}
       
public void adicionarQuantidade(int quantidade){
    this.quantidade += quantidade;
}

public void removerQuantidade(int quantidade){
    if(quantidade > this.quantidade){
        throw new IllegalArgumentException("Quantidade insuficiente para remoção. ");
    }
    this.quantidade += quantidade;
}}