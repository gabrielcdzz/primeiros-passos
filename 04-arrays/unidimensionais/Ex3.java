// Ex 3 — Leia 4 numeros inteiros do usuario, armazene em um array e exiba a soma de todos.
package unidimensionais;

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [] numeros = new int[4];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Por favor, digite seu %dº número:", i + 1);
            numeros[i] = sc.nextInt();
        }

        System.out.println("Seu array ficou assim:");
        for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
        }
        sc.close();
    }
}
