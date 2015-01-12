/**
 *
 * @author anderson, fabiano, ismael
 */
package gerenciamentodeprodutos.model;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Produto {

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("/home/anderson/Downloads/produtos.txt");
        try (Scanner entrada = new Scanner(is)) {
            while (entrada.hasNextLine()) {
                System.out.println(entrada.nextLine());
            }
        }
    }
}
