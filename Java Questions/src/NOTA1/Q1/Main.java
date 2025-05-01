package NOTA1.Q1;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Aluno aluno = new Aluno();

        System.out.print("Digite qual é a primeira nota:");
        aluno.nota1 = sc.nextDouble();

        System.out.print("Digite qual a segunda nota:");
        aluno.nota2 = sc.nextDouble();

        System.out.print("Digite qual a terceira nota:");
        aluno.nota3 = sc.nextDouble();

        if (aluno.calculoMedia() >= 7.0) {
            System.out.printf("Aluno Aprovado com média %.2f!%n", aluno.calculoMedia());
        } else if (aluno.calculoMedia() < 4.0) {
            System.out.printf("Aluno Reprovado com média %.2f!%n", aluno.calculoMedia());
        } else {
            System.out.printf("Aluno está na Final com média %.2f!%n", aluno.calculoMedia());
        }

        sc.close();
    }
}
