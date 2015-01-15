/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.view;

import java.util.Scanner;

public class Menu {

    private final Scanner entrada = new Scanner(System.in);

    public void Menu() {
        System.out.println("*********** Menu Principal ***********");
        System.out.println(
                "Selecione uma opção: \n"
                + "  1) Carga Inicial de dados no Sistema\n"
                + "  2) Operações de Compra e Venda\n"
                + "  3) Relatórios\n"
                + "  4) Sair\n "
        );

        int opcao = entrada.nextInt();
        entrada.nextLine();

        switch (opcao) {
            case 1:
                this.CargaInicial();
                break;
            case 2:
                this.Operacoes();
                break;
            case 3:
                this.Relatorios();
                break;
            case 4:
                this.exit();
                break;
            default:
                System.out.println("Opção Inválida!!!");
                break;
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.Menu();
        }
    }

    public void SubMenu01() {

        display:
        while (true) {

            System.out.println("*********** SubMenu 01 ***********");
            System.out.println(
                    "Selecione uma opção: \n"
                    + "  1) Carregar Produtos\n"
                    + "  2) Carregar Estoque UREs\n"
                    + "  3) Carregar Estoques Lojas\n "
            );

            int opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao) {
                case 1:
                    this.CarregarProdutos();
                    break;
                case 2:
                    this.CarregarEstoqueUREs();
                    break;
                case 3:
                    this.CarregarEstoqueLojas();
                    break;
                case 4:
                    System.out.println("Retornando ao Menu Principal...");
                    break display;
                default:
                    System.out.println("Opção Inválida!!!");
                    break;
            }

        }

    }

    private void CargaInicial() {
    }

    private void Operacoes() {
    }

    private void Relatorios() {
    }

    private void CarregarProdutos() {
    }

    private void CarregarEstoqueUREs() {
    }

    private void CarregarEstoqueLojas() {
    }

    private void exit() {
        System.out.println("Saindo...");
        System.exit(1);
    }
}
