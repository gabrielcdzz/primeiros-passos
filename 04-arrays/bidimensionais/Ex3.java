// Ex 3 — Crie uma matriz 3x3, leia 9 valores inteiros do usuario e armazene na matriz, depois exiba.
package bidimensionais;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz3x3 = new int[3][3];
        int contador = 1;
        
        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                System.out.printf("Por favor, digite o %d° número inteiro para %d,%d\n", contador++, i+1, j+1);
                 while (!sc.hasNextInt()) {
                    System.out.println("Este caractere não é um número inteiro. \n Digite novamente:");
                    sc.next();
                    }
                matriz3x3[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sua matriz 3x3 ficou assim:");

        for (int i = 0; i < matriz3x3.length; i++) {
            for (int j = 0; j < matriz3x3.length; j++) {
                System.out.print(matriz3x3[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();


    }
    
}