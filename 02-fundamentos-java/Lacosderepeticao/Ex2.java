// Ex 2 — Use "for" para calcular e exibir a tabuada de um numero lido pelo usuario.
package Lacosderepeticao;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá ler seu número e exibir a tabuada dele.");
        System.out.println("Por favor, me diga seu número de 1-10:");
        int numero = sc.nextInt();
        int numeroi = numero;

        System.out.printf("A tabuada de %d é: \n", numeroi);

        for (; numero <= numeroi * 10; numero += numeroi){
            
        System.out.println(numero);
        }

        sc.close();
    }
}