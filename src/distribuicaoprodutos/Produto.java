/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class Produto {

    private int id;
    private int estoque;
    private String nome;
    private BigDecimal valor;
    
    public Produto(int id, int estoque, String nome){
        this.id = id;
        this.estoque = estoque;
        this.nome = nome;
        this.valor = getValueFromFile(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public static BigDecimal getValueFromFile(String nome){
        //TODO ACESSAR O ARQUIVO E PROCURAR PELO NOME E RETORNAR
        //BIGDECIMAL CONTENDO O VALOR
        return new BigDecimal("1");
    }
    
    public static ArrayList<Produto> initProdutosLoja(){
         ArrayList<Produto> temp = new ArrayList<Produto>();        
         temp.add(new Produto(1,1000,"Refrigerante"));
         temp.add(new Produto(2,1000,"Suco"));
         temp.add(new Produto(3,1000,"Arroz"));
         temp.add(new Produto(4,1000,"Feijao"));
         temp.add(new Produto(5,1000,"Fuba"));
         temp.add(new Produto(6,1000,"Oleo"));
         temp.add(new Produto(7,1000,"Sabao"));
         temp.add(new Produto(8,1000,"Detergente"));
         temp.add(new Produto(9,1000,"Sabonente"));
         temp.add(new Produto(10,1000,"Creme Dental"));
         temp.add(new Produto(11,1000,"Shampoo"));
         return temp;
    }  
    
    public static ArrayList<Produto> initProdutosUre(){
         ArrayList<Produto> temp = new ArrayList<Produto>();        
         temp.add(new Produto(1,5000,"Refrigerante"));
         temp.add(new Produto(2,5000,"Suco"));
         temp.add(new Produto(3,5000,"Arroz"));
         temp.add(new Produto(4,5000,"Feijao"));
         temp.add(new Produto(5,5000,"Fuba"));
         temp.add(new Produto(6,5000,"Oleo"));
         temp.add(new Produto(7,5000,"Sabao"));
         temp.add(new Produto(8,5000,"Detergente"));
         temp.add(new Produto(9,5000,"Sabonente"));
         temp.add(new Produto(10,5000,"Creme Dental"));
         temp.add(new Produto(11,5000,"Shampoo"));
         return temp;
    } 
}
