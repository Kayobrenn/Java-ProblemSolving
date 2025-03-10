import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matematica calc = new Matematica();

        System.out.print("Digite o primeiro número:");
        calc.n1 = scanner.nextInt();

        System.out.print("Digite o segundo número:");
        calc.n2 = scanner.nextInt();

        System.out.println("=====Menu Matematica====");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.print("Digite a opção desejada:");
        calc.opcao = scanner.nextInt();

        switch (calc.opcao) {
            case 1:
                calc.somar();
                System.out.println("Resultado: " + calc.resultado1);
                break;
            case 2:
                calc.subtrair();
                System.out.println("Resultado: " + calc.resultado2);
                break;
            case 3:
                calc.multiplicar();
                System.out.println("Resultado: " + calc.resultado3);
                break;
            case 4:
                calc.dividir();
                System.out.println("Resultado: " + calc.resultado4);
                break;

        }
    }
}
