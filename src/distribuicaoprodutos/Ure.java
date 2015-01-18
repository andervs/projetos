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
public class Ure {
    private int id;
    private String regiaoGeografica;
    private String municipio;
    private ArrayList<Produto> produtos;
    
     public Ure(int id, String regiaoGeografica, String municipio){
        this.id = id;
        this.regiaoGeografica = regiaoGeografica;
        this.municipio = municipio;
        this.produtos = Produto.initProdutosUre();
    }
    
    
    public static ArrayList<Ure> initUre(){
        ArrayList<Ure> temp = new ArrayList<Ure>();
        temp.add(new Ure(1,"Norte","Manaus"));
        temp.add(new Ure(2,"Sul","Curitiba"));
        temp.add(new Ure(3,"Sudeste","Belo Horizonte"));
        temp.add(new Ure(4,"Nordeste","Recife"));
        temp.add(new Ure(5,"Centro-Oeste","Goiania"));
        return temp;
    }
}
