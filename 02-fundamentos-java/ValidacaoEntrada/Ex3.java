// Ex 3 — Leia "s" ou "n" (case insensitive) e fique pedindo ate receber entrada valida.

package ValidacaoEntrada;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Este programa irá apenas ler as letras s e n, caso contrário, será reiniciado até a resposta certa.");

        while (true) {

           String escolha = sc.next();
           if (!escolha.equals("n") && !escolha.equals("s")) {
            System.out.println("Por favor, digite uma entrada válida");
            
           }
           else {
            System.out.println("Entrada válida!");
            break;
           }


            
        }

    }
}