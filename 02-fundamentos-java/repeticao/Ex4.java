// Ex 4 — Use while para somar numeros ate o usuario digitar -1 (sentinela), exiba a soma total.
package repeticao;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa irá somar os números que você irá falar até digitar -1 para finalizar o programa.");

        float numero = 0;
        int soma = 0;

        while (true) {

        System.out.println("Digite seu número:");
        numero = sc.nextFloat();
        
                if (numero == -1) {
            break;
            }
               
         soma += numero;

    
        }

        System.out.printf("O sistema encerrou, o resultado da soma é %d", soma);

        sc.close();
    }
    
}