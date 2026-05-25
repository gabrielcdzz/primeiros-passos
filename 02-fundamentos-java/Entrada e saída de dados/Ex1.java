// Ex 1 — Leia o nome do usuario e exiba: Bem-vindo, [nome]!

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, este programa irá ler seu nome e exibi-lo.");
        System.out.println("Por favor, digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Bem vindo," + nome + "!!");

        sc.close();
}
}