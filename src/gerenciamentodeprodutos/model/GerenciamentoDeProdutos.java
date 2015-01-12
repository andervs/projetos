/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

public class GerenciamentoDeProdutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cidadeOrigem = "Manaus";
        String cidadeDestino = "Recife";
        DistanciasRodoviarias gdp = new DistanciasRodoviarias();
        int distancia;
        //distancia = gdp.distanciaEntreAsCidades(cidadeOrigem, cidadeDestino);
        distancia = gdp.ureMaisProxima(cidadeOrigem);
        System.out.println(distancia);

    }

}
