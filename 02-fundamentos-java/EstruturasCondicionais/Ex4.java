// Ex 4 — Leia um numero e verifique se esta entre 0 e 10 (inclusive). Exiba "Valido" ou "Invalido".
package EstruturasCondicionais;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá ler o seu número e dizer se ele está entre 0 e 10. Caso estiver, irá exibir (Válido). Caso não estiver, (Inválido)");
        System.out.println("Por favor, digite o seu número:");
        float numero = sc.nextFloat();

        if (numero >= 0 && numero <= 10) {
            System.out.printf("%.1f é válido!", numero);
        } else {
                System.out.printf("%.1f é inválido!!", numero);
            }

            sc.close();
    }
}