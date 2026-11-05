// Ex 1 — Leia um numero inteiro e exiba "Par" ou "Impar".
package EstruturasCondicionais;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Este programa irá ler um número inteiro e dizer se ele é Par ou Ímpar.");
        System.out.println("Por favor, digite seu número:");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("%d é par!!", numero);
            }
            else {
                System.out.printf("%d é ímpar!!", numero);
            }
            sc.close();
        
    }
}