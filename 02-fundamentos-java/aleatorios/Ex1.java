// Ex 1 — Gere e exiba 5 numeros aleatorios entre 0 e 10.

package aleatorios;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Random rand = new Random();

        
        int i;

        for (i = 0; i < 5; i++) {
             System.err.println(rand.nextInt(11));
        }
        
       
    }
}