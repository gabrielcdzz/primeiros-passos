// Ex 4 — Gere dois numeros aleatorios (0-10), some e diga se a soma e par ou impar.
package aleatorios;
import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("Este programa irá gerar 2 números aleatórios de 0 a 10, somar e dizer se é par ou ímpar.");

        int numerorandom1 = rand.nextInt(11);
        int numerorandom2 = rand.nextInt(11);

        int soma = numerorandom1 + numerorandom2;

        if (soma % 2 == 0) {
            System.out.printf("O primeiro número gerado foi %d e o segundo número gerado foi %d. O resultado da soma deu %d, %d é par", numerorandom1, numerorandom2, soma, soma);
        } else {
            {
            System.out.printf("O primeiro número gerado foi %d e o segundo número gerado foi %d. O resultado da soma deu %d, %d é ímpar",numerorandom1, numerorandom2, soma, soma);
        }
        }


    }
}