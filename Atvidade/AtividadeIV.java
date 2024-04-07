import java.util.Scanner;

public class AtividadeIV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        char[] vetor = new char[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i+1) + "º caractere: ");
            vetor[i] = scanner.next().charAt(0);
        }
        
        int contadorConsoantes = 0;
        System.out.println("Consoantes digitadas:");
        for (int i = 0; i < 10; i++) {
            char caractere = Character.toLowerCase(vetor[i]);
            if ((caractere >= 'a' && caractere <= 'z') && 
                caractere != 'a' && caractere != 'e' && caractere != 'i' && caractere != 'o' && caractere != 'u') {
                contadorConsoantes++;
                System.out.println(vetor[i]);
            }
        }

        System.out.println("Total de consoantes lidas: " + contadorConsoantes);
        
        scanner.close();
    }
}