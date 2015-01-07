/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.util.Set;
import java.util.HashSet;

public class Ure {

    public int idURE;
    public String regiaoGeografica;
    public String municipio;
    public Set<ProdutoURE> produtoURE;
    public Set<Ure> Ure;
    //public Ure Ure;
    public Set<Loja> loja;

    public Ure() {
        super();
    }

    public int informarEstoque() {

        return 0;
    }

}
