// Ex 3 — Gere um numero secreto (1-100) e leia um palpite; diga se acertou, se e maior ou menor.

package Numerosrandom;

import java.util.Scanner;
import java.util.Random;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Este programa irá gerar um número secreto entre 1 a 100 e você tentará acertar.");

        int numero = rand.nextInt(99) + 1;
        int tentativa = 0;
        
        while (tentativa != numero)
        {
        System.out.println("Tente adivinhar o número:");
        tentativa = sc.nextInt();

        if (tentativa < numero)
        {
            System.out.printf("Número errado! O número secreto é maior que %d. Tente novamente! \n", tentativa);
        }
        else if (tentativa > numero) {
            System.out.printf("Número errado! O número secreto é menor que %d. Tente novamente!\n", tentativa);
        }

        else if (numero == tentativa) {
            System.out.printf("Você acertou! O número secreto é: %d \n", numero);
            break;
        }
        }



    }
}