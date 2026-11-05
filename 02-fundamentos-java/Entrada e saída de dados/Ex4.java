// Leia um preco decimal e exiba: O preco informado foi: R$ 29,90 (duas casas decimais).

import java.util.Scanner;
 public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa irá ler um número decimal e exibir ele decimal.");
        System.out.println("Por favor, digite seu número decimal:");
        float numerod = sc.nextFloat();

        System.out.println("Seu número é:" + numerod);
        sc.close();

    }
 }