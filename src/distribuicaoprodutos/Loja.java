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
public class Loja {
    private int id;
    private String regiaoGeografica;
    private String municipio;
    private ArrayList<Produto> produtos;
    
    public Loja(int id, String regiaoGeografica, String municipio){
        this.id = id;
        this.regiaoGeografica = regiaoGeografica;
        this.municipio = municipio;
        this.produtos = Produto.initProdutosLoja();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegiaoGeografica() {
        return regiaoGeografica;
    }

    public void setRegiaoGeografica(String regiaoGeografica) {
        this.regiaoGeografica = regiaoGeografica;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
    /* Metodo estatico para gerar as lojas, ja que nao foi disponibilizado 
    uma entrada em .txt */
    public static ArrayList<Loja> initLojas(){
        ArrayList<Loja> temp = new ArrayList<>();
        temp.add(new Loja(1,"Norte","Manaus"));
        temp.add(new Loja(2,"Sul","Curitiba"));
        temp.add(new Loja(3,"Sudeste","Belo Horizonte"));
        temp.add(new Loja(4,"Nordeste","Recife"));
        temp.add(new Loja(5,"Centro-Oeste","Goiania"));
        return temp;
    }
}
