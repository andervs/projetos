/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.util.Set;
import java.util.HashSet;

public class ProdutoLoja {

    public int idProdutoLoja;
    public int quantidade;
    public double preco;
    public String tipoProduto;
    public Set<Loja> loja;
    public ItemCompra itemCompra;

    public ProdutoLoja() {
        super();
    }

    public int consultarQuantidadeProdutoPrateleira() {

        return 0;
    }

    public ProdutoURE solicitarProdutoURE(ProdutoLoja produto) {

        return null;
    }

}
