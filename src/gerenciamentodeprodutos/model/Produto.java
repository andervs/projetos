/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Produto {

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

        /*
         for (String produtos : arqProdutos) {
         System.out.println(produtos);
         }
         */
        return arqProdutos;
    }

    public BigDecimal getValueFromFile(String nomeProduto) {

        Locale brasil = new Locale("pt", "BR");
        BigDecimal preco = BigDecimal.ZERO;
        String[] dadosProduto = null;

        ArrayList<String> produtos = new ArrayList<>();
        Produto produto = new Produto();

        produtos = produto.consumirArquivoProdutos();

        for (String prod : produtos) {
            if (prod.contains(nomeProduto)) {
                dadosProduto = prod.split(":");
                //System.out.println(dadosProduto[1].substring(3));
                String SeparadorDecimalAmericano = dadosProduto[1].substring(3).replace(",", ".");
                preco = new BigDecimal(SeparadorDecimalAmericano);
            }
        }
        //produtos.
        return preco;
    }
}
