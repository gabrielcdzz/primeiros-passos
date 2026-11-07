// Leia dois números e exiba o resultado de a > b como true/false (sem if ainda).
package variaveis;

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá ler dois números e exibir o resultado de a > b como true/false");
        System.out.println("Por favor, digite seu primeiro número:");
        int a = sc.nextInt();

        System.out.println("Por favor, digite seu segundo número:");
        int b = sc.nextInt();

        System.out.printf("a > b é: %b", a > b);
        sc.close();

    }
}