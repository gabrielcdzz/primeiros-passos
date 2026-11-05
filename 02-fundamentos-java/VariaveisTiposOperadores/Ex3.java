// Leia preço e quantidade, calcule o total e exiba com duas casas decimais.
package VariaveisTiposOperadores;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Este programa irá calcular o total que você tem em valor em estoque.");
        System.out.println("Por favor, me diga o preço de seu produto: (Use vírgula)");
        double preco = sc.nextFloat();

        System.out.println("Agora me diga a quantidade que você tem dele:");
        int qtd = sc.nextInt();

        double total = preco * qtd;

        System.out.printf("O total é de: %.2f", total);
    }
}