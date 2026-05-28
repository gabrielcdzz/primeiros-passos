// Leia a nota de um aluno (0-100): Excelente (>=90), Bom (>=70), Regular (>=50) ou Insuficiente (<50).
package EstruturasCondicionais;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Este programa irá avaliar sua nota para Excelente, Bom, Regular ou Insuficiente.");
        System.out.println("Por favor, me diga a sua nota (0-100):");
        float nota = sc.nextFloat();

        if (nota >= 90) {
            System.out.println("Nota Excelente!!");
        } else if (nota >= 70) {
            System.out.println("Bom.");
        } else if (nota >= 50) {
            System.out.println("Regular");
        } else if (nota < 50) {
            System.out.println("Insuficiente...");
        }

        sc.close();
        
    }
}