import java.util.Scanner;

public class AtividadeV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        
        int indicePares = 0;
        int indiceImpares = 0;
        

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
            

            if (numeros[i] % 2 == 0) {
                pares[indicePares] = numeros[i];
                indicePares++;
            } else {
                impares[indiceImpares] = numeros[i];
                indiceImpares++;
            }
        }
    
        System.out.println("\nNúmeros digitados:");
        for (int i = 0; i < 20; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\n\nNúmeros pares:");
        for (int i = 0; i < indicePares; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\n\nNúmeros ímpares:");
        for (int i = 0; i < indiceImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        
        scanner.close();
    }
}