// Ex 1 — Declare duas variáveis inteiras e calcule/exiba soma, subtração, multiplicação, divisão e resto.
package variaveis;

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa irá ler duas variáveis inteiras calcular sua soma, subtração, multiplicação, divisão e o resto.");

        System.out.println("Por favor, digite o primeiro número:");
        int n1 = sc.nextInt();

        System.out.println("Por favor, digite o segundo número inteiro:");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;
        int resto = n1 % n2;

        System.out.printf("O resultado de seus cálculos são estes: \n Soma: %d%n Subtração: %d%n Multiplicação: %d%n Divisão: %d%n Resto: %d%n  ", soma, subtracao, multiplicacao, divisao, resto);

        sc.close();
    }
}