/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

public class ItemCompra {

    //public int idItemCompra;
    //public ProdutoLoja idProdutoLoja;
    public String descricao;
    public int quantidade;
    public double preco;
    //public Compra compra;
    //public ProdutoLoja produtoLoja;

    public ItemCompra(int idItemCompra, String descricao, int quantidade, double preco) {
        //super();
        //this.idItemCompra = idItemCompra;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
