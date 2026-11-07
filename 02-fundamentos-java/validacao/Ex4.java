// Ex 4 — Combine validacao de tipo + intervalo: leia um inteiro de 0 a 10 sem deixar o programa travar com letras.

package validacao;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Este programa lê somente números inteiros de 0-10, caso contrário, o programa irá reiniciar.");

        while (true) {

            if (sc.hasNextInt()) {
            int numero = sc.nextInt();
            if (numero <= 10 && numero > 0) {
                System.out.println("Entrada válida!");
                break;
            } else {
                System.out.println("Este número não é valido.");
            }
            } else {
                System.out.println("Somente aceitamos números. Digite novamente.");
                sc.next();
            }
        }
    }
}