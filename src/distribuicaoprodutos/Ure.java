/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distribuicaoprodutos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
    private boolean status;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
     public Ure(int id, String regiaoGeografica, String municipio){
        this.id = id;
        this.regiaoGeografica = regiaoGeografica;
        this.municipio = municipio;
        this.produtos = Produto.initProdutosUre();
        if (municipio.equals("Manaus"))
            this.status = false;
        else
            this.status = true;
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

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public boolean transferirEstoque(Produto produto, int quantidade, ArrayList<Fornecedor> fornecedores){
        for (Produto ure_produto:produtos){
            if(ure_produto.getNome().equals(produto.getNome())){
                if (ure_produto.getEstoque() >= 1000+quantidade ){
                    ure_produto.baixarEstoque(1000+quantidade);
                    produto.entradaEstoque(1000+quantidade);
                    
                    if(ure_produto.getEstoque()==0){
                        //URE teve seu estoque zerado apos repor loja
                        //executar rotina de reposicao URE - QUANTIDADE P
                        
                        //ureRequisitaProdutoUreMaisProxima(produto, quantidade);
                    }
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return false;
    }
    
    /**
     *
     * @param produto
     * @param quantidade
     * @return
     */
    public boolean ureRequisitaProdutoUreMaisProxima(Produto produto, int quantidade){
        
        return false;
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
    public Produto buscaProduto(String nome){
        for (Produto temp_produto:this.produtos){
            if (temp_produto.getNome().equals(nome)){
                return temp_produto;
            }
        }
        return null;
    }
    
    public int getDistanciaFromFile(String temp_ure_name){
          String path = "/home/anderson/Dropbox/pos.graduacao.java/atividades/trabalho.Edmar.e.Jairo/parte.do.Jairo/distancias.txt";
          try {
            File f = new File(path);
            if (f.exists()) {
                BufferedReader br = new BufferedReader(new FileReader(path));
                for (String line; (line = br.readLine()) != null;){
                    System.out.println(line);
                    if(line.contains(temp_ure_name) && line.contains(this.getMunicipio())){
                        System.out.println(line.split(":")[1]);
                        return Integer.parseInt(line.split(":")[1]);
                    }
                }
                }
            }
            catch(Exception e){
                    return 0;
            }
          return 0;
    }
}
