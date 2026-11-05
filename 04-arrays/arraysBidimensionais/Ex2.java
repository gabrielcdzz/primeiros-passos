// Ex 2 — Crie um char[][] 4x4, preencha tudo com '#' e exiba o tabuleiro formatado.

package arraysBidimensionais;
public class Ex2 {
    public static void main(String[] args) {
        
    char [][] tabuleiro = new char[4][4]; 

    for (int i = 0; i < tabuleiro.length; i++) {
        for (int j = 0; j < tabuleiro.length; j++) {
            tabuleiro [i][j] = '#';
        }
    }

    System.out.println("Ficou assim:");
   for (int i = 0; i < tabuleiro.length; i++) {
        for (int j = 0; j < tabuleiro.length; j++) {
            System.out.print(tabuleiro [i][j] + " ");
        }
        System.out.println();
    }
}
}