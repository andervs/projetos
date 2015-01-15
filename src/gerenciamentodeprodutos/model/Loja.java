/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Set;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loja {

    public int idLoja;
    public String regiaoGeografica;
    public String municipio;
    public Set<ProdutoLoja> produtoLoja;
    public Set<Ure> Ure;

    public Loja() {
        super();
    }

    public double consultarValorTotalProdutos() {

        return 0.0;
    }

    public double informarArrecadacao() {

        return 0.0;
    }

    public ArrayList<String> consumirArquivoCompras() {
        InputStream is = null;
        ArrayList<String> arqCompras = new ArrayList<>();
        try {
            is = new FileInputStream("/home/anderson/Downloads/compras.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Loja.class.getName()).log(Level.SEVERE, null, ex);
        }
        try (Scanner entrada = new Scanner(is)) {
            while (entrada.hasNextLine()) {
                arqCompras.add(entrada.nextLine());
                //System.out.println(arqCompras.toString());                
            }
            entrada.close();
        }

        /*
        for (String compras : arqCompras) {
            System.out.println(compras);
        }
        */
        return arqCompras;
    }

    public void realizarVenda() {
        
        Loja loja = new Loja();
        ArrayList<String> compras = new ArrayList<>();
        
        compras = loja.consumirArquivoCompras();
        
        
        //ArrayList<ItemCompra> itensCompra = new ArrayList<>();
        /*
         for (ItemCompra itemCompra : itensCompra) {
         System.out.println(itensCompra);
         }
         */
    }
}
