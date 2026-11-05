import java.util.Random;
import java.util.Scanner;

public class JogoDaMemoria {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        char[][] tabuleiro = new char[7][7];
        boolean[][] revelado = new boolean[7][7];

        char[] cartas = new char[49];
        for (int i = 0; i < 24; i++) {
            cartas[i * 2]     = (char) ('A' + i);
            cartas[i * 2 + 1] = (char) ('A' + i);
        }
        cartas[48] = '*';

        for (int i = 48; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }

        int idx = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                tabuleiro[i][j] = cartas[idx++];
                revelado[i][j] = false;
            }
        }

        System.out.println("=== JOGO DA MEMORIA MULTIPLAYER ===");
        System.out.println("\n*** COLA - POSICAO DE TODAS AS CARTAS ***");
        System.out.print("    ");
        for (int j = 1; j <= 7; j++) {
            System.out.printf(" %d  ", j);
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.printf(" %d  ", i + 1);
            for (int j = 0; j < 7; j++) {
                System.out.printf("[%c] ", tabuleiro[i][j]);
            }
            System.out.println();
        }
        System.out.println("*****************************************\n");

        int[] placar = new int[2];
        placar[0] = 0;
        placar[1] = 0;

        int jogadorAtual = 0;
        int paresEncontrados = 0;

        while (paresEncontrados < 24) {

            System.out.println("\n--- Placar ---");
            System.out.println("Jogador 1: " + placar[0] + " ponto(s)");
            System.out.println("Jogador 2: " + placar[1] + " ponto(s)");
            System.out.println("--------------");

            System.out.println("\nTabuleiro atual:");
            System.out.print("    ");
            for (int j = 1; j <= 7; j++) {
                System.out.printf(" %d  ", j);
            }
            System.out.println();
            for (int i = 0; i < 7; i++) {
                System.out.printf(" %d  ", i + 1);
                for (int j = 0; j < 7; j++) {
                    if (revelado[i][j]) {
                        System.out.printf("[%c] ", tabuleiro[i][j]);
                    } else {
                        System.out.print("[#] ");
                    }
                }
                System.out.println();
            }

            System.out.println("\nVez do Jogador " + (jogadorAtual + 1));

            System.out.print("Digite a linha da 1a carta (1-7): ");
            int linha1 = scanner.nextInt() - 1;
            System.out.print("Digite a coluna da 1a carta (1-7): ");
            int coluna1 = scanner.nextInt() - 1;

            if (linha1 < 0 || linha1 > 6 || coluna1 < 0 || coluna1 > 6) {
                System.out.println("Coordenadas invalidas! Tente novamente.");
                continue;
            }

            if (revelado[linha1][coluna1]) {
                System.out.println("Essa carta ja foi revelada! Tente novamente.");
                continue;
            }

            revelado[linha1][coluna1] = true;
            char carta1 = tabuleiro[linha1][coluna1];

            System.out.println("\nTabuleiro apos 1a escolha:");
            System.out.print("    ");
            for (int j = 1; j <= 7; j++) {
                System.out.printf(" %d  ", j);
            }
            System.out.println();
            for (int i = 0; i < 7; i++) {
                System.out.printf(" %d  ", i + 1);
                for (int j = 0; j < 7; j++) {
                    if (revelado[i][j]) {
                        System.out.printf("[%c] ", tabuleiro[i][j]);
                    } else {
                        System.out.print("[#] ");
                    }
                }
                System.out.println();
            }

            if (carta1 == '*') {
                System.out.println("Voce encontrou a carta coringa (*)! Seu turno termina.");
                jogadorAtual = 1 - jogadorAtual;
                continue;
            }

            System.out.print("Digite a linha da 2a carta (1-7): ");
            int linha2 = scanner.nextInt() - 1;
            System.out.print("Digite a coluna da 2a carta (1-7): ");
            int coluna2 = scanner.nextInt() - 1;

            if (linha2 < 0 || linha2 > 6 || coluna2 < 0 || coluna2 > 6) {
                System.out.println("Coordenadas invalidas! Turno perdido.");
                revelado[linha1][coluna1] = false;
                jogadorAtual = 1 - jogadorAtual;
                continue;
            }

            if (revelado[linha2][coluna2]) {
                System.out.println("Essa carta ja foi revelada! Turno perdido.");
                revelado[linha1][coluna1] = false;
                jogadorAtual = 1 - jogadorAtual;
                continue;
            }

            if (linha1 == linha2 && coluna1 == coluna2) {
                System.out.println("Voce escolheu a mesma carta duas vezes! Turno perdido.");
                revelado[linha1][coluna1] = false;
                jogadorAtual = 1 - jogadorAtual;
                continue;
            }

            revelado[linha2][coluna2] = true;
            char carta2 = tabuleiro[linha2][coluna2];

            System.out.println("\nTabuleiro apos 2a escolha:");
            System.out.print("    ");
            for (int j = 1; j <= 7; j++) {
                System.out.printf(" %d  ", j);
            }
            System.out.println();
            for (int i = 0; i < 7; i++) {
                System.out.printf(" %d  ", i + 1);
                for (int j = 0; j < 7; j++) {
                    if (revelado[i][j]) {
                        System.out.printf("[%c] ", tabuleiro[i][j]);
                    } else {
                        System.out.print("[#] ");
                    }
                }
                System.out.println();
            }

            if (carta2 == '*') {
                System.out.println("Voce encontrou a carta coringa (*)! Seu turno termina.");
                revelado[linha1][coluna1] = false;
                jogadorAtual = 1 - jogadorAtual;
                continue;
            }

            if (carta1 == carta2) {
                System.out.println("Par encontrado! Jogador " + (jogadorAtual + 1) + " pontua e joga novamente!");
                placar[jogadorAtual]++;
                paresEncontrados++;
            } else {
                System.out.println("Não é um par. As cartas serao ocultadas e o turno passa para o outro jogador.");
                revelado[linha1][coluna1] = false;
                revelado[linha2][coluna2] = false;
                jogadorAtual = 1 - jogadorAtual;
            }
        }

        System.out.println("\n=== FIM DE JOGO ===");
        System.out.println("Todos os 24 pares foram encontrados!");
        System.out.println("Placar Final:");
        System.out.println("Jogador 1: " + placar[0] + " ponto(s)");
        System.out.println("Jogador 2: " + placar[1] + " ponto(s)");

        if (placar[0] > placar[1]) {
            System.out.println("\nJogador 1 venceu! Parabens!");
        } else if (placar[1] > placar[0]) {
            System.out.println("\nJogador 2 venceu! Parabens!");
        } else {
            System.out.println("\nEmpate! Bom jogo para os dois!");
        }

        scanner.close();
    }
}