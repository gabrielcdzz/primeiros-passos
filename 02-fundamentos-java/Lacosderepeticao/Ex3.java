// Ex 3 — Use do-while para criar um menu que repete ate o usuario digitar "n".

package Lacosderepeticao;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String sair;
        

        do {
            System.out.println("Este programa irá repetir até você sair. Para sair, digite 'n' ");
            sair = sc.nextLine();
        }

        while (!sair.equalsIgnoreCase("n")); 

            System.out.println("Você saiu do programa.");
        
    sc.close();         
    }
}