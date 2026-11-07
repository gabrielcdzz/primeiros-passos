// Ex 4 — Crie um array de 5 posicoes, preencha todas com o valor '#' usando for e exiba o resultado.

package unidimensionais;
public class Ex4 {
    public static void main(String[] args) {
        char[] posicoes = new char[5];

        for (int i = 0; i < posicoes.length; i++){
            posicoes[i] = '#';
        }

        for (int i = 0; i < posicoes.length; i++){
            System.out.println(posicoes[i]);
        }

    }
}