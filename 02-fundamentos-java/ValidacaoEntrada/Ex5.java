// Ex 5 — Leia a escolha "par"/"impar" com validacao completa, depois leia numero 0-10 validado, e exiba ambos confirmados.
package ValidacaoEntrada;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Neste programa, você deverá escolher par ou impar e após escrever um número entre 1-10.");

        String parOuImpar;
        int numero;

        System.out.println("Para escolher, digite par ou impar: ");
        while (true)
        {
           parOuImpar = sc.next().toLowerCase();
            if (!parOuImpar.equals("par") && !parOuImpar.equals("impar")) {
                System.out.println("Por favor, digite uma entrada válida.");
            }

            else {
                System.out.printf("\nVocê escolheu %s ", parOuImpar);
                break;
                
            }
        }
            
            System.out.println("Agora, preciso que você escolha um número de 1-10:");
            while (true) {
                if (sc.hasNextInt()) {
                    numero = sc.nextInt();
                    if (numero <= 10 && numero >= 1) {
                        System.out.printf("\nVocê escolheu %d", numero);
                        break;
                    } else {
                        System.out.println("Por favor, digite um número de 1 a 10.");
                    }

                } else System.out.println("Preciso que você digite um número.");
                sc.next();

            }

                System.out.printf("\nVocê escolheu %s e o número %d.", parOuImpar, numero);


        }
    }
