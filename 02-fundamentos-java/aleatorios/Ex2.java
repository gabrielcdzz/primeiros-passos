// Ex 2 — Simule o lancamento de um dado (1 a 6) dez vezes e exiba os resultados

package aleatorios;
import java.util.Random;

public class Ex2 {
    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("Este programa irá simular o lancamento de um dado (1 a 6) dez vezes:");

        for (int i = 0; i < 10; i++) {
            System.out.println(rand.nextInt(6) + 1);
        }

    }
}