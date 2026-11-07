 // Leia o nome de um jogador e dois inteiros (pontos), exiba o total: [Nome] fez 15 pontos no total.

 import java.util.Scanner;
 public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa irá ler o nome de um jogador e depois irá ler a quantidade de pontos que ele fez e exibir.");
        System.out.println("Por favor, me diga o nome do jogador:");
        String nomeJogador = sc.nextLine();

        System.out.println("Agora me diga quantos pontos ele fez:");
        int qtdPontos = sc.nextInt();

        System.out.printf("O jogador %s fez %d pontos!!", nomeJogador, qtdPontos);

        sc.close();
        
    }
 }