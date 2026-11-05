// Ex 3 — Leia dois numeros e exiba qual e o maior, ou "Iguais" se forem iguais.
package EstruturasCondicionais;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá ler dois números que você digitar e dizer qual deles é maior ou se forem iguais.");
        System.out.println("Por favor, digite o primeiro número:");
        float n1 = sc.nextFloat();

        System.out.println("Por favor, digite o segundo número:");
        float n2 = sc.nextFloat();

        if (n1 > n2) {
            System.out.printf("O %.2f é maior que o %.2f", n1, n2);
        } else if (n2 > n1) {
            System.out.printf("O %.2f é maior que o %.2f", n2, n1);
        } else {
            System.out.printf("%.2f e %.2f são iguais.", n1, n2);
        }
        sc.close();

    }
}