// Ex 5 — Crie um array com os valores {10,20,30,40,50}, altere o terceiro elemento para 99 e exiba o array completo.

package unidimensionais;
public class Ex5 {
    public static void main(String[] args) {
        
        int [] valores = {10,20,30,40,50};

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valores antes da mudança:" + valores[i]);
        }

        System.out.println();
        
        valores[2] = 99;
        for (int i = 0; i < valores.length; i++) {
            System.out.println("Valores depois da mudança:" + valores[i]);
        }

    }

}