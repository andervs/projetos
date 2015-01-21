/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
  * Informacoes completas sobre os produtos
  * 
  * @param id codigo identificador do produto
  * @param estoque  Identifica a quantidade em estoque
  * @param nome Campo para inserir a descrição do produto
  * @param valor Campo para inserção do valor final em reais
  * @author            Ismael
  * @author            Anderson
  * @author            Fabiano
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
        String path = "/Users/Ismael/Desktop/produtos.txt";
        try{
            File f = new File(path);
            if(f.exists()){
                BufferedReader br = new BufferedReader(new FileReader(path));
                for(String line; (line = br.readLine()) != null; ) {
                    if (line.contains("R$")){
                        if(line.split(":")[0].equals(nome) ){
                            return new BigDecimal(line.split(":")[1].substring(3).replace(",", "."));
                        }
                    }
                }                
            }
        }
        catch (Exception e){
        }
        return new BigDecimal("0");
    }
   
         /**
  * Inicializa os produtos por Loja
  * 
  * @return temo em initProdutosLoja seta os produtos atrelados as Lojas na inicialização do programa.
  */
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
         temp.add(new Produto(9,1000,"Sabonete"));
         temp.add(new Produto(10,1000,"Creme Dental"));
         temp.add(new Produto(11,1000,"Shampoo"));
         return temp;
    }  
    
         /**
  * Inicializa os produtos por Loja
  * 
  * @return temp em initProdutosUre seta os produtos atrelados as URES na inicialização do programa.
  */

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
         temp.add(new Produto(9,5000,"Sabonete"));
         temp.add(new Produto(10,5000,"Creme Dental"));
         temp.add(new Produto(11,5000,"Shampoo"));
         return temp;
    } 

         /**
  * Inicializa os produtos por Loja
  * 
  * @return temp em initProdutosFornecedorBebida seta os produtos atrelados aos Fornecedores específicos de bebidas.
  */
      public static ArrayList<Produto> initProdutosFornecedorBebida() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(1, 0, "Refrigerante"));
        temp.add(new Produto(2, 0, "Suco"));
        return temp;
    }
       /**
  * Inicializa os produtos por Loja
  * 
  * @return temp em initProdutosFornecedorMercearia seta os produtos atrelados aos Fornecedores específicos de Mercearia.
  */
  
    public static ArrayList<Produto> initProdutosFornecedorMercearia() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(3, 0, "Arroz"));
        temp.add(new Produto(4, 0, "Feijao"));
        temp.add(new Produto(5, 0, "Fuba"));
        temp.add(new Produto(6, 0, "Oleo"));
        return temp;
    }

           /**
  * Inicializa os produtos por Loja
  * 
  * @return temp em initProdutosFornecedorLimpeza seta os produtos atrelados aos Fornecedores específicos de material de limpeza.
  */
  
    public static ArrayList<Produto> initProdutosFornecedorLimpeza() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(7, 0, "Sabao"));
        temp.add(new Produto(8, 0, "Detergente"));
        return temp;
    }

           /**
  * Inicializa os produtos por Loja
  * 
  * @return temp em initProdutosFornecedorHigiene seta os produtos atrelados aos Fornecedores específicos de materiais de higiene.
  */
   
    public static ArrayList<Produto> initProdutosFornecedorHigiene() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(9, 0, "Sabonente"));
        temp.add(new Produto(10, 0, "Creme Dental"));
        temp.add(new Produto(11, 0, "Shampoo"));
        return temp;
    }
}
