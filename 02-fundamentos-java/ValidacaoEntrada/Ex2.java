// Ex 2 — Leia uma opcao de menu (1, 2 ou 3) e so aceite esses valores.
package ValidacaoEntrada;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa irá simular um menu de 3 opções. Caso você digitar algo fora disso, o sistema irá repetir.");
        System.out.println("Selecione sua opção no menu: \n 1-Opção \n 2-Opção \n 3-Opção");

        while (true) {
            
            if (sc.hasNextInt() ) {   
                int opcao = sc.nextInt();

                if (opcao <= 3 && opcao != 0) {
                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu a opção 1.");
                        break;

                        case 2:
                        System.out.println("Você escolheu a opção 2.");
                        break;

                        case 3:
                        System.out.println("Você escolheu a opção 3.");
                        break;
                }
                } else {
                    System.out.println("Só aceitamos números 1,2 e 3.");
                }
            
            } else {
                System.out.println("Isso não é um número, digite novamente.");
                sc.next();
            }
        }
        
    }
}