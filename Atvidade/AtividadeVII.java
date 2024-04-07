import java.util.Scanner;

public class AtividadeVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vetor = new int[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }

        int soma = 0;
        int multiplicacao = 1;
        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
            soma += vetor[i];
            multiplicacao *= vetor[i];
        }

        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
        
        scanner.close();
    }
}