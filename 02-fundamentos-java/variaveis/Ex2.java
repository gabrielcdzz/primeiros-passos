//  Leia um número inteiro e exiba o resultado de numero % 2
package variaveis;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá ler seu número, dividir por 2 e guardar e exibir o resto da sua divisão");
        System.out.println("Diga seu número (Inteiro):");
        int n = sc.nextInt();

        int resto = n % 2;

        System.out.printf("O resto da sua operação será de: %d", resto);

        sc.close();
}
}