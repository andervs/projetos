/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.math.BigDecimal;

public class GerenciamentoDeProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //String cidadeOrigem = "Manaus";
        //String cidadeDestino = "Recife";
        //DistanciasRodoviarias gdp = new DistanciasRodoviarias();
        //int distancia;
        //distancia = gdp.distanciaEntreAsCidades(cidadeOrigem, cidadeDestino);
        //distancia = gdp.ureMaisProxima(cidadeOrigem);
        //System.out.println(distancia);
        Loja loja = new Loja();
        loja.realizarVenda();

        BigDecimal precoProduto = BigDecimal.ZERO;

        Produto produto = new Produto();
        precoProduto = produto.getValueFromFile("refrigerante");
        System.out.println(precoProduto);
    }

}
