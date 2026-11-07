// x 5 — Simule 10 rodadas automaticas: gere dois numeros por rodada, some e conte pares vs impares.

package aleatorios;
import java.util.Random;

public class Ex5 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Este programa irá simular 10 rodadas automáticas de par ou ímpar geradas pelo sistema.");

        int placarImpar = 0;
        int placarPar = 0;

        for (int i = 1; i <= 10; i++) {

            int numerorandom1 = rand.nextInt(9) + 1;
            int numerorandom2 = rand.nextInt(9) + 1;
            int soma = numerorandom1 + numerorandom2;

            if (soma % 2 == 0) {
                placarImpar++;

            } else {
                placarPar++;
            }

            if (soma % 2 == 0) {
                System.out.printf("\nRodada %d finalizada! \n Primeiro número escolhido: %d\n Segundo número escolhido: %d\n Resultado: %d é par.\n", i, numerorandom1, numerorandom2, soma);
            } else {
                System.out.printf("\nRodada %d finalizada! \n Primeiro número escolhido: %d\n Segundo número escolhido: %d\n Resultado: %d é ímpar.\n", i, numerorandom1, numerorandom2, soma);
            }
        }


        System.out.printf("\nJogo finalizado, 10 rodadas jogadas. \n --- Placar --- \n Ímpar: %d \n Par: %d", placarImpar, placarPar );


    }
}