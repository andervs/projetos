/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.util.Set;

public class Fornecedor {

    public int idFornecedor;
    public String tipoProduto;
    public double preco;
    public Set<ProdutoURE> produtoURE;

    public Fornecedor() {
        super();
    }

}
