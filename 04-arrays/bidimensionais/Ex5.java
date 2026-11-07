// Ex 5 — Leia linha e coluna do usuario (1-7), converta para indice (0-6) e exiba a posicao acessada no array.

package bidimensionais;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int linha;
        int coluna;

        System.out.println("Digite a linha (1-7) que você quer acessar:");
    do {
        while (!sc.hasNextInt()) {
        System.out.println("Digite um número inteiro dentro de 1-7");
        sc.next();
        }

        linha = sc.nextInt();
        if (linha < 1 || linha > 7) {
        System.out.println("Digite um número inteiro dentro de 1-7");
        }
        } while (linha < 1 || linha > 7);

        System.out.println("Digite a coluna (1-7) que você quer acessar:");
    do {
        while (!sc.hasNextInt()) {
        System.out.println("Digite um número inteiro dentro de 1-7");
        sc.next();
        }

        coluna = sc.nextInt();

        if (coluna < 1 || coluna > 7) {
        System.out.println("Digite um número inteiro dentro de 1-7");
        }
        } while (coluna < 1 || coluna > 7);

        System.out.printf("Você acessou a posição (%d),(%d) do array.", linha, coluna);


        
    }
}
