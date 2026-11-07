// Ex 4 — Crie um char[][] 7x7, preencha tudo com '#' e exiba 

package bidimensionais;
public class Ex4 {
    public static void main(String[] args) {
        char[] [] hashtags = new char[7][7];

        for (int i = 0; i < hashtags.length; i++) {
            for (int j = 0; j < hashtags.length; j++) {
                hashtags [i] [j] = '#';
            }
            System.out.println();
        }

        System.out.println("Ficou assim:");

        for (int i = 0; i < hashtags.length; i++) {
            for (int j = 0; j < hashtags.length; j++) {
                System.out.print(hashtags[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}