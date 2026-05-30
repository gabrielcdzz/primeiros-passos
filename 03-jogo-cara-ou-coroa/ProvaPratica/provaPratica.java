import java.util.Scanner;
import java.util.Random;

public class provaPratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("<<<<<<<<<<<<<<<<<<<  Jogo de cara ou coroa. >>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Descrição: Este programa é um jogo de cara ou coroa contra a máquina.");

        int escolhaCaraOuCoroa = 0;
        int escolhaCARAouCOROASistema = 0;
        int simounao;
        int placarHumano = 0;
        int placarMaquina = 0;
        int qntdRodada= 0;



        do {
            while (true) {
                
            System.out.println("\nPor favor, escolha Cara(1) ou Coroa(2)");
            if (sc.hasNextInt()) {
                escolhaCaraOuCoroa = sc.nextInt();

                if (escolhaCaraOuCoroa == 1) {
                    System.out.println("\nVocê escolheu CARA.");
                     escolhaCARAouCOROASistema = 2;
                    break;
                }

                else if (escolhaCaraOuCoroa == 2) {
                    System.out.println("\nVocê escolheu COROA");
                     escolhaCARAouCOROASistema = 1;
                    break;
                }

                else {
                    System.out.println("Número inválido, por favor, digite 1 ou 2.");
                }
                
            } else {
                System.out.println("Entrada inválido! Por favor, escreva Cara(1) ou Coroa(2).");
                sc.next();
            }
        }

        if (escolhaCARAouCOROASistema == 1) {
            System.out.println("O sistema escolheu Cara.\n");
            
        } else if (escolhaCARAouCOROASistema == 2) {
            System.out.println("O sistema escolheu Coroa.\n");
            
        }

        System.out.println("Lançando moeda...");
        int moeda = rand.nextInt(2) + 1;
        
        if (moeda == 1) {
        System.out.println("+--------+");
        System.out.println("|  CARA  |");
        System.out.println("|   :)   |");
        System.out.println("+--------+\n");
        } else if (moeda == 2) {

        System.out.println("+--------+");
        System.out.println("|  COROA |");
        System.out.println("|    $   |");
        System.out.println("+--------+\n");
    }

    if (moeda == 1 && escolhaCaraOuCoroa == 1) {
        System.out.println("Você venceu!!\n");
        placarHumano++;

    } else if (moeda == 1 && escolhaCaraOuCoroa == 2) {
        System.out.println("Você perdeu!!\n");
        placarMaquina++;

    } else if (moeda == 2 && escolhaCaraOuCoroa == 2) {
        System.out.println("Você venceu!!\n");
        placarHumano++;

    } else if (moeda == 2 && escolhaCaraOuCoroa == 1) {
        System.out.println("Você perdeu!!\n");
        placarMaquina++;
    }

    qntdRodada++;
    
    System.out.println("------PLACAR------");
    System.out.printf("-----Rodada %d----- \n", qntdRodada);
    System.out.printf("Você: %d", placarHumano);
    System.out.printf("\nMáquina: %d\n", placarMaquina);

    System.out.println("\nVocê deseja continuar? Digite 1 para sim e 2 para não.\n");
    simounao = sc.nextInt(); 
    if (simounao == 1) {
        System.out.printf("\n------ RODADA %d COMEÇA!! ------", qntdRodada + 1);
    }
    

} while (simounao == 1);

    System.out.println("Sistema encerrado");
}
}
