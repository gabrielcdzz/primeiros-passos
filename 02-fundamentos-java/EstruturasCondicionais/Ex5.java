// Simule uma rodada do jogo: leia a escolha (par/impar), leia dois numeros, some e diga quem ganhou
package EstruturasCondicionais;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este é a simulação de uma rodada de um jogo Par ou impar para dois jogadores!");
        System.out.println("Primeiro jogador, escolha par (1) ou impar(2)!");
        int escolhaJogador1 = sc.nextInt();
        int escolhaJogador2 = 0;

        switch (escolhaJogador1) {
            case 1:
                System.out.println("Primeiro jogador escolheu par e o segundo jogador escolheu ímpar!");
                escolhaJogador2 = 2;
                break;

                case 2:
                System.out.println("Primeiro jogador escolheu ímpar e o segundo jogador escolheu par!");
                escolhaJogador2 = 1;
                break;
        
            default:
                System.out.println("Opção inválida.");
                break;
        }

        System.out.println("Primeiro jogador, qual seu número?");
        int n1 = sc.nextInt();
        System.out.println("Segundo jogador, qual seu número?");
        int n2 = sc.nextInt();

        int soma = n1 + n2;

        if ((soma % 2 == 0) && escolhaJogador2 == 1) {
            System.out.printf("%d é par! O segundo jogador venceu.", soma);
        } else if ((soma % 2 != 0) && escolhaJogador2 == 2) {
            System.out.printf("%d é ímpar! O segundo jogador venceu.", soma);

        } else if ((soma % 2 == 0) && escolhaJogador2 == 2) {
            System.out.printf("%d é par! O primeiro jogador venceu.", soma);
        } else if ((soma % 2 != 0) && escolhaJogador2 == 1) {
            System.out.printf("%d é ímpar! O primeiro jogador venceu.", soma);
        } 

        

        

    sc.close();
    }
}