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
 *
 * @author Ismael
 */
public class Application {
  

    public static void main(String[] args) {
        
          ArrayList<Loja> lojas = Loja.initLojas();
          ArrayList<Ure> ures = Ure.initUre();
          ArrayList<Compra> compras = new ArrayList<Compra>();
          getComprasFromFile(lojas,compras);

    }
    
    
      public static boolean getComprasFromFile(ArrayList<Loja> lojas, ArrayList<Compra> compras){
          
        Compra temp_compra = null;
        Loja temp_loja = null;
        String path = "/Users/Ismael/Desktop/compras.txt";
        try{
            File f = new File(path);
            if(f.exists()){
                BufferedReader br = new BufferedReader(new FileReader(path));
                for(String line; (line = br.readLine()) != null; ) {
                    
                    if (line.isEmpty() || line.contains("Relação"));                    
                    
                    else if (line.contains("Loja")){
                        int temp_id = Integer.parseInt(line.substring(5));
                        for(Loja temp_loja2:lojas){
                            if (temp_loja2.getId()==temp_id){
                                temp_loja = temp_loja2;
                            }
                        }
                    }
                    
                    else if( line.contains("Cliente")){
                        if (temp_compra!=null){
                            compras.add(temp_compra);
                        }
                            temp_compra = new Compra();
                            temp_compra.setLoja(temp_loja);
                            temp_compra.setCliente( line.substring(8));
                    }
                    
                    else{
                        String temp_name_produto = line;
                        int temp_qnt_produto = Integer.parseInt(br.readLine().substring(12));
                        BigDecimal temp_valor_produto = new BigDecimal(br.readLine().substring(16).replace(",", "."));
                        temp_compra.getProdutos().add(
                                new ProdutoCompra(temp_compra.getLoja().buscaProduto(temp_name_produto), 
                                temp_qnt_produto, 
                                temp_valor_produto));
                    }  
                }
                if(temp_compra!=null){
                    compras.add(temp_compra);
                }
                return true;
            }
            else{
                return false;
            }
        }
        catch(Exception e){
            return false;
        }
    }  
}
