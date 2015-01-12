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
    private String distancias[];

    EnumDistanciasRodoviarias(int distancia) {
      this.distancia = distancia;
    }

    public int getDistancia() {
        //return this.distancia;
        return 0;
    }

    //public int distanciaEntreAsCidades(String cidade1, String cidade2) {
        public int distanciaEntreAsCidades() {
        //String c1 = cidade1;
        //String c2 = cidade2;
        
        String c1 = "Recife";
        String c2 = "BeloHorizonte";
            
        String juncao1 = c1 + c2;
        juncao1 = juncao1.toUpperCase();

        String juncao2 = c2 + c1;
        juncao2 = juncao2.toUpperCase();
        
        System.out.println(juncao1);
        System.out.println(juncao2);

        //return distancia;
        return 0;
    }

}
