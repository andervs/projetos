/**
 *
 * @author anderson, fabiano, ismael
 */
package distribuicaoprodutos;

public class DistanciasRodoviarias {

    enum EnumDistanciasRodoviarias {

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

    public int distanciaEntreAsCidades(String cidade1, String cidade2) {

        String c1 = cidade1;
        String c2 = cidade2;
        int distancia = 0;

        String juncao1 = c1 + c2;
        juncao1 = juncao1.toUpperCase().replaceAll("\\s+", "");

        String juncao2 = c2 + c1;
        juncao2 = juncao2.toUpperCase().replaceAll("\\s+", "");

        for (EnumDistanciasRodoviarias dr : EnumDistanciasRodoviarias.values()) {
            if ((dr.name().equals(juncao1)) || (dr.name().equals(juncao2))) {
                distancia = dr.getDistancia();
            }
        }
        return distancia;
    }

    public int ureMaisProxima(String cidadeOrigem) {

        String c = cidadeOrigem;
        int menorDistancia = 0;

        c = c.toUpperCase().replaceAll("\\s+", "");

        for (EnumDistanciasRodoviarias dr : EnumDistanciasRodoviarias.values()) {
            if (menorDistancia == 0) {
                menorDistancia = dr.getDistancia();
            }
            if (dr.name().contains(c)) {
                if (dr.getDistancia() < menorDistancia) {
                    menorDistancia = dr.getDistancia();
                }
            }
        }
        return menorDistancia;
    }
}
