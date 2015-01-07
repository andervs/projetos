/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

public enum EnumDistanciasRodoviarias {

    MANAUSRECIFE(2833),
    MANAUSGOIANIA(3291),
    MANAUSBELOHORIZONTE(3951),
    MANAUSCURITIBA(4036),
    RECIFEGOIANIA(2924),
    RECIFEBELOHORIZONTE(2061),
    RECIFECURITIBA(3078),
    GOIANIABELOHORIZONTE(906),
    GOIANIACURITIBA(1186),
    BELOHORIZONTECURITIBA(820);

    private final int distancia;

    EnumDistanciasRodoviarias(int distancia) {
        this.distancia = distancia;
    }

    public int getDistancia() {
        return this.distancia;
    }
}
