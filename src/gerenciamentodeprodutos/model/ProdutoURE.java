/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.util.Set;
import java.util.HashSet;

public class ProdutoURE {

    public int idProdutoURE;
    public int estoque;
    public String tipoProduto;
    public Fornecedor fornecedor;
    public Set<Ure> Ure;

    public ProdutoURE() {
        super();
    }

    public void solicitarProdutoURE(ProdutoURE produto) {

    }

    public void solicitarProdutoFornecedor(Fornecedor produto) {

    }

}
