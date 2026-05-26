// Ex 2 — Leia dois inteiros e exiba o seu resultado

import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa irá calcular a soma entre dois números inteiros que você irá dizer.");
        System.out.println("Por favor, digite o primeiro número inteiro:");
        int n1 = sc.nextInt();

        System.out.println("Por favor, digite o segundo número inteiro:");
        int n2 = sc.nextInt();
        
        int soma = n1 + n2;

        System.out.println("O resultado da soma entre os dois valores será:" + soma);
        sc.close();
    }
}