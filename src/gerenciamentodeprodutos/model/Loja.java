/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.util.Set;
import java.util.HashSet;

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

    public void realizarVenda() {

    }

}
