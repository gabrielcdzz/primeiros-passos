// Ex 5 — Leia 5 numeros e conte quantos sao pares e quantos sao impares, exiba ao final..

package repeticao;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa irá ler 5 números seus e contar quantos são pares e quantos são ímpares.");

        int numero;
        int par = 0;
        int impar = 0;
        int i;

        for (i = 0; i < 5; i++)
        {
            System.out.println("Digite o número:");
            numero = sc.nextInt();

           if (numero % 2 == 0) {
            par++;
           } else {
            impar++;
           }
        } 

            System.out.printf("Você tem %d números pares e %d números ímpares.", par, impar);
        

    }
}