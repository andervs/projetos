/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.util.ArrayList;

 /**
  * Informacoes completas sobre as URE´s
  * 
  * @param id codigo identificador da URE
  * @param regiaoGeografica  Identifica a regiao Geografica a qual pertence a URE
  * @param municipio Identifica o municipio ao qual pertence a URE
  * @See produtos Inicializa o produto através do método initProdutosUre
  * @author            Ismael
  * @author            Anderson
  * @author            Fabiano
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
    
  /**
  * Inicializa as URE´s
  * 
  * @see initUre Inicializa as URE´s, bem como sua região geográfica, municipio e código.
  * @return temp, numa lista com as URE´s, seu código, região geográfica e município.
  */    
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
