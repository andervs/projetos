/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.math.BigDecimal;

/**
 *
 * @author Ismael
 */
public class ProdutoCompra {
    
    private Produto produto;
    private int quantidade;
    private BigDecimal preco;

    public ProdutoCompra(Produto produto, int quantidade, BigDecimal preco) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
    
}
