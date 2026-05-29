// Ex 1 — Leia um inteiro e fique pedindo ate que seja entre 1 e 100.

package ValidacaoEntrada;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa lê apenas números entre 1 e 100. Caso digite outra coisa, ele irá reiniciar.");

        while (true) {
        
        if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            if (numero > 1 && numero < 100) {
                System.out.println("Entrada válida!");
                break;
            }
             else {
                System.out.println("Entrada inválida, o número está fora de 1-100. \n Digite novamente:\n");
            }
        
        } else {
            System.out.println("Isso não é um número. Digite novamente.\n");
            sc.next();
        }
         
        }
    
        sc.close();
    }
}