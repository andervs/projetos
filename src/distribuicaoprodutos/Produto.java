/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ismael
 */
public class Produto {

    private int id;
    private int estoque;
    private String nome;
    private BigDecimal valor;

    public Produto(int id, int estoque, String nome) {
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

    public ArrayList<String> consumirArquivoProdutos() {
        InputStream is = null;
        ArrayList<String> arqProdutos = new ArrayList<>();
        try {
            is = new FileInputStream("/home/anderson/Downloads/produtos.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Scanner entrada = new Scanner(is)) {
            while (entrada.hasNextLine()) {
                arqProdutos.add(entrada.nextLine());
            }
            entrada.close();
        }
        return arqProdutos;
    }

    public BigDecimal getValueFromFile(String nomeProduto) {
        BigDecimal preco = BigDecimal.ZERO;

        ArrayList<String> produtos = this.consumirArquivoProdutos();

        for (String prod : produtos) {
            if (prod.toUpperCase().contains(nomeProduto.toUpperCase())) {
                String[] dadosProduto = prod.split(":");
                String textoPreco = dadosProduto[1].substring(3).replace(",", ".");
                preco = new BigDecimal(textoPreco);
            }
        }
        return preco;
    }

    public static ArrayList<Produto> initProdutosLoja() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(1, 1000, "Refrigerante"));
        temp.add(new Produto(2, 1000, "Suco"));
        temp.add(new Produto(3, 1000, "Arroz"));
        temp.add(new Produto(4, 1000, "Feijao"));
        temp.add(new Produto(5, 1000, "Fuba"));
        temp.add(new Produto(6, 1000, "Oleo"));
        temp.add(new Produto(7, 1000, "Sabao"));
        temp.add(new Produto(8, 1000, "Detergente"));
        temp.add(new Produto(9, 1000, "Sabonente"));
        temp.add(new Produto(10, 1000, "Creme Dental"));
        temp.add(new Produto(11, 1000, "Shampoo"));
        return temp;
    }

    public static ArrayList<Produto> initProdutosUre() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(1, 5000, "Refrigerante"));
        temp.add(new Produto(2, 5000, "Suco"));
        temp.add(new Produto(3, 5000, "Arroz"));
        temp.add(new Produto(4, 5000, "Feijao"));
        temp.add(new Produto(5, 5000, "Fuba"));
        temp.add(new Produto(6, 5000, "Oleo"));
        temp.add(new Produto(7, 5000, "Sabao"));
        temp.add(new Produto(8, 5000, "Detergente"));
        temp.add(new Produto(9, 5000, "Sabonente"));
        temp.add(new Produto(10, 5000, "Creme Dental"));
        temp.add(new Produto(11, 5000, "Shampoo"));
        return temp;
    }

    public static ArrayList<Produto> initProdutosFornecedorBebida() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(1, 0, "Refrigerante"));
        temp.add(new Produto(2, 0, "Suco"));
        return temp;
    }

    public static ArrayList<Produto> initProdutosFornecedorMercearia() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(3, 0, "Arroz"));
        temp.add(new Produto(4, 0, "Feijao"));
        temp.add(new Produto(5, 0, "Fuba"));
        temp.add(new Produto(6, 0, "Oleo"));
        return temp;
    }

    public static ArrayList<Produto> initProdutosFornecedorLimpeza() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(7, 0, "Sabao"));
        temp.add(new Produto(8, 0, "Detergente"));
        return temp;
    }

    public static ArrayList<Produto> initProdutosFornecedorHigiene() {
        ArrayList<Produto> temp = new ArrayList<>();
        temp.add(new Produto(9, 0, "Sabonente"));
        temp.add(new Produto(10, 0, "Creme Dental"));
        temp.add(new Produto(11, 0, "Shampoo"));
        return temp;
    }
}
