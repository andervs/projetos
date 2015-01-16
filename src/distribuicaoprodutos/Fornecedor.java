/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.util.ArrayList;

/**
 *
 * @author anderson
 */
public class Fornecedor {

    private final int id;
    private final String tipoProduto;
    private final ArrayList<Produto> produtos;

    /* Metodo estatico para gerar os fornecedores, ja que nao foi disponibilizado 
     uma entrada em .txt */
    public static ArrayList<Fornecedor> initFornecedores() {
        ArrayList<Fornecedor> temp = new ArrayList<>();

        temp.add(new Fornecedor(1, "BEBIDA", Produto.initProdutosFornecedorBebida()));
        temp.add(new Fornecedor(2, "MERCEARIA", Produto.initProdutosFornecedorMercearia()));
        temp.add(new Fornecedor(3, "LIMPEZA", Produto.initProdutosFornecedorLimpeza()));
        temp.add(new Fornecedor(4, "HIGIENE", Produto.initProdutosFornecedorHigiene()));
        return temp;
    }

    private Fornecedor(int id, String tipoProduto, ArrayList<Produto> produtos) {
        this.id = id;
        this.tipoProduto = tipoProduto;
        this.produtos = produtos;
    }

}
