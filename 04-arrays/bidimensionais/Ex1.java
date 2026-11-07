// Ex 1 — Crie uma matriz 3x3 de inteiros, preencha com os valores de 1 a 9 usando for aninhado e exiba.

package bidimensionais;
public class Ex1 {
     public static void main(String[] args) {
        int [] [] matriz3x3 = new int [3][3]; 
        int valor = 0;

        for (int i = 0; i < matriz3x3.length; i++){
            for (int j = 0; j < matriz3x3.length; j++) {
                matriz3x3 [i][j] = valor++ + 1;
            }
        }

        for (int i = 0; i < matriz3x3.length; i++){
            for (int j = 0; j < matriz3x3.length; j++) {
                System.out.print(matriz3x3[i] [j] + " ");
            }
            System.out.println();
        }
        }
     }
