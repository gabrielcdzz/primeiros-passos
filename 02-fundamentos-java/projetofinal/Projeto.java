/* {Desenvolva um programa em Java para o jogo de Par ou Ímpar contra o computador. 
O sistema deverá permitir que o jogador escolha entre par ou ímpar e informe um
número inteiro entre 0 e 10. O computador deverá gerar automaticamente, de forma
aleatória, um valor também entre 0 e 10. Após isso, o programa deverá calcular a soma
dos valores e determinar o vencedor da rodada de acordo com o resultado ser par ou
ímpar. O jogo deverá possuir um placar acumulativo, contabilizando a quantidade de
vitórias do jogador, vitórias do computador e, se desejar, o total de rodadas realizadas.
Ao final de cada rodada, o sistema deverá perguntar ao usuário se deseja continuar
jogando, encerrando apenas quando o jogador optar por sair. O programa deve validar
as entradas informadas pelo usuário para garantir que apenas valores entre 0 e 10
sejam aceitos.}  */

package projetofinal;
import java.util.Scanner;
import java.util.Random;

public class Projeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Random rand = new Random();

        System.out.println("Olá! Este é um jogo de Par ou Ímpar contra a máquina.");
        
        String parOuImpar;
        int numeroEscolhido;
        int placarimpar;
        int placarpar;
            System.out.println("O jogo vai começar.");
            System.out.println("Para escolher, digite 'par' ou 'impar'");

        while (true) {
            
            parOuImpar = sc.next().toLowerCase();
            if (!parOuImpar.equals("par") && !parOuImpar.equals("impar")) {
                System.out.println("Entrada inválida. Escreva exatamente 'par' ou 'impar'.");
            }
            else {
                System.out.printf("\nVocê escolheu %s", parOuImpar);
                break;
            }
        }

        System.out.println("\nAgora, preciso que digite o número de 1-10.");
        while (true) {
            if (sc.hasNextInt()) {
                numeroEscolhido = sc.nextInt();
                if (numeroEscolhido <= 10 && numeroEscolhido >= 1) {
                    System.out.printf("\nVocê escolheu o número %d.", numeroEscolhido);
                    break; 
                } else {
                    System.out.println("Por favor, digite um número entre 1 e 10.");
                }
            } else {
                System.out.println("Isso não é um número, preciso que você digite um número:");
                sc.next();
            }
        }

        int numeroMaquina = rand.nextInt((10) + 1);
        System.out.printf("\nA máquina escolheu %d", numeroMaquina);

        sc.close();
    }
}