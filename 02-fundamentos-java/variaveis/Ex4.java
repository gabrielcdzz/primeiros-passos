// Ex 4 — Declare pontos = 0 e some +10 três vezes com +=, exiba o resultado final.
package variaveis;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Este programa irá declarar pontos = 0, somar +10 três vezes com += e exibir o resultado final.");
    int pontos = 0;
    pontos += 10;
    pontos += 10;
    pontos += 10;
    
    System.out.printf("O resultado final é de %d", pontos);

}
}