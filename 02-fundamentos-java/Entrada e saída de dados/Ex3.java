//  Leia nome, idade e cidade, exiba tudo formatado com printf em uma linha

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa irá ler seu nome, sua idade e a sua cidade e irá exibir na tela");
        System.out.println("Por favor, me diga o seu nome:");
        String nome = sc.nextLine();

        System.out.println("Por favor, me diga a sua idade:");
        int idade = sc.nextInt();
        sc.nextLine();


        System.out.println("Por favor, me diga a sua cidade:");
        String cidade = sc.nextLine();

        System.out.println("O seu nome é " + nome + "\n Sua idade é " + idade + "\n Sua cidade é " + cidade);
    }
}