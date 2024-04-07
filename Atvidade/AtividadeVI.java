import java.util.Scanner;

public class AtividadeIV {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] medias = new double[10];
        
        for (int aluno = 0; aluno < 10; aluno++) {
            double somaNotas = 0;

            System.out.println("Aluno " + (aluno + 1) + ":");
            for (int nota = 0; nota < 4; nota++) {
                System.out.print("Digite a nota " + (nota + 1) + ": ");
                somaNotas += scanner.nextDouble();
            }

            medias[aluno] = somaNotas / 4;
        }

        int contadorAlunosAprovados = 0;
        for (int i = 0; i < 10; i++) {
            if (medias[i] >= 7.0) {
                contadorAlunosAprovados++;
            }
        }

        System.out.println("\nNúmero de alunos com média maior ou igual a 7.0: " + contadorAlunosAprovados);

        scanner.close();
    }
}