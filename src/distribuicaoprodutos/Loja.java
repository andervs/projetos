/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.util.ArrayList;

 /**
  * Permite listar e verificar as informacoes das lojas inseridas no sistema
  *
  * @param id codigo identificador
  * @param regiaoGeografica  Identifica a regiao geografica a qual pertence a loja
  * @param municipio Permite atrela a loja o municipio ao qual pertence
  * @param produtos ArrayList que lista os produtos desta loja
  * @author            Ismael
  * @author            Anderson
  * @author            Fabiano
  */
public class Loja {

    private int id;
    private String regiaoGeografica;
    private String municipio;
    private ArrayList<Produto> produtos;

    public Loja(int id, String regiaoGeografica, String municipio) {
        this.id = id;
        this.regiaoGeografica = regiaoGeografica;
        this.municipio = municipio;
        this.produtos = Produto.initProdutosLoja();
    }

    public void solicitarReposicao(ProdutoCompra temp_produto,  ArrayList<Ure> ures,  ArrayList<Fornecedor> fornecedores){
        Ure nextUre=null;
        int quantidade = (temp_produto.getQuantidade() - temp_produto.getProduto().getEstoque())+1000;
        System.out.println("[LOJA] Realizando a reposição de estoque da loja "+this.municipio);
        
        while (quantidade > 0){
            System.out.println("[LOJA] Quantidade necessária para reposição " + quantidade);
            System.out.println("[LOJA] Buscando a URE mais próxima da loja "+this.getMunicipio());
            nextUre = this.getUreMaisProxima(ures);
            System.out.println("[LOJA] URE mais próxima encontrada "+nextUre.getMunicipio());
            if ( nextUre.buscaProduto(temp_produto.getProduto().getNome()).getEstoque() <= quantidade ){
                System.out.print("[LOJA] URE "+ nextUre.getMunicipio()+" não tem estoque suficiente");
            }
                             
        }
        
     /*   
        System.out.println("[LOJA] Buscando a URE mais próxima de " + this.getMunicipio());
        
        for (Ure temp_ure:ures){
            if (temp_ure.getMunicipio().equals(this.municipio)){
                    System.out.println("[LOJA] URE mais próxima encontrada -> URE "+temp_ure.getMunicipio());
                    nextUre=temp_ure;
                    break;
            }
        }
        
        if (!nextUre.transferirEstoque(temp_produto.getProduto(), temp_produto.getQuantidade(), fornecedores) ){
            System.out.println("[LOJA] URE "+nextUre.getMunicipio()+ " não tem estoque para realizar reposição");
            //URE Regional Nao tem Estoque para finalizar essa venda - Iniciar rotina de buscar URE/Fornecedor
        }
        */
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
     /**
  * @return temp em initLojas Metodo estatico para gerar as lojas, ja que nao foi disponibilizado uma entrada em .txt 
  */
 
    public static ArrayList<Loja> initLojas(){
        ArrayList<Loja> temp = new ArrayList<Loja>();
        temp.add(new Loja(1, "Norte", "Manaus"));
        temp.add(new Loja(2, "Nordeste", "Recife"));
        temp.add(new Loja(3, "Centro-Oeste", "Goiania"));
        temp.add(new Loja(4, "Sudeste", "Belo Horizonte"));
        temp.add(new Loja(5, "Sul", "Curitiba"));
        
        
        
        return temp;
    }

 /**
  * @return temp_produto em buscaProduto para efetuar a pesquisa pelo produto 
  */
    
    public Produto buscaProduto(String nome){
        for (Produto temp_produto:this.produtos){
            if (temp_produto.getNome().equals(nome)){
                return temp_produto;
            }
        }
        return null;
    }

    public boolean realizarReposicao() {
        return false;
    }
    
    public Ure getUreMaisProxima(ArrayList<Ure> ures){
        Ure aux_ure = null;
        int temp_dist = -1;
        //Checa se a URE local esta disponivel 
        for (Ure temp_ure:ures){
            if (temp_ure.getMunicipio().equals(this.municipio))
            {
                if (temp_ure.getStatus()){
                    System.out.println("[LOJA] URE mais próxima encontrada -> URE "+temp_ure.getMunicipio());
                    return temp_ure;
                }
                else{
                    break;
                }      
            }
        }
        
        for (Ure temp_ure:ures){           
              if ( (! temp_ure.getMunicipio().equals(this.getMunicipio())) && temp_ure.getStatus() ){
                  if(aux_ure == null){
                      aux_ure = temp_ure;
                  }
                  else{
                      if (temp_dist < 0 ){
                          temp_dist = temp_ure.getDistanciaFromFile(this.getMunicipio());
                          aux_ure = temp_ure;
                      }
                      else if( temp_dist >= temp_ure.getDistanciaFromFile(this.getMunicipio()) ){
                          temp_dist = temp_ure.getDistanciaFromFile(this.getMunicipio());
                          aux_ure = temp_ure;
                      }
                }
              }
          }
        System.out.println("[LOJA] URE mais próxima encontrada 2-> URE "+aux_ure.getMunicipio());
        return aux_ure;
    }

}
