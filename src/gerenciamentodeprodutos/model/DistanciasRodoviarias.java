/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

public class DistanciasRodoviarias {

    private String distancias[];

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
                //System.out.println(dr.getDistancia());
                distancia = dr.getDistancia();
            }
        }
        return distancia;
    }

    public static void main(String[] args) {
        String cidadeOrigem = "Belo Horizonte";
        String cidadeDestino = "Recife";
        DistanciasRodoviarias gdp = new DistanciasRodoviarias();
        int distancia;
        distancia = gdp.distanciaEntreAsCidades(cidadeOrigem, cidadeDestino);
        System.out.println(distancia);
    }
}
