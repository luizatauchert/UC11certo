/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loja;

import java.util.ArrayList;

/**
 *
 * @author LUIZATAUCHERTSCHOLL
 */

public class estoque {

         ArrayList<produto> estoque =new ArrayList<>();
     
     
     public void adicionarProduto(String nome, int quantidade){
         for (produto prod : estoque){
             if(prod.getNome().equals(nome)){
                 System.out.println("O produto já existe. Adicionado" +quantidade+ "ao estoque");
                 prod.adicionarQuantidade(quantidade);
                 return;
             }
             estoque.add(new produto(nome,quantidade));
             System.out.println("Novo produto adicionado" +nome+ "com quantidade"+ quantidade);
         }
}
     
     public void removerProduto(String nome, int quantidade) {
        for (produto p : estoque) {
            if (p.getNome().equals(nome)) {
                p.removerQuantidade(quantidade);
                return;
            }
        }
        throw new IllegalArgumentException("Produto nao encontrado");
    }
    
     
     
    
    public int consultarQuantidade(String nome) {
        for (produto p : estoque) {
            if (p.getNome().equals(nome)) {
                return p.getQuantidade();
            }
        }
        return 0;
    }

     
    public String produtoMaisEstocado() {
        if (estoque.isEmpty()) {
            return null;
        }
        produto maisEstocado = estoque.get(0);
        for (produto p : estoque) {
            if (p.getQuantidade() > maisEstocado.getQuantidade()) {
                maisEstocado = p;
            }
        }
        return maisEstocado.getNome();  
    } 
    
    
     public void limparEstoque(){
         estoque.clear();
         
     }}

         
     