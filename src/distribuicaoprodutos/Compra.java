/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.util.ArrayList;

/**
 *
 * @author Ismael
 */
public class Compra {
    
    private ArrayList<ProdutoCompra> produtos; 
    private String cliente;
    private Loja loja;

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
   
    public Compra(){
        produtos = new ArrayList<ProdutoCompra>();
    }

    public ArrayList<ProdutoCompra> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ProdutoCompra> produtos) {
        this.produtos = produtos;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
  
}
