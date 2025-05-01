package Q3.Calculadora;

import java.util.Scanner;

public class MainCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calc calc = new Calc();

        System.out.print("Digite o primeiro número:");
        calc.n1 = sc.nextInt();

        System.out.print("Digite o segundo número:");
        calc.n2 = sc.nextInt();

        System.out.print("Digite o operador (+,*,-,/):");
        char operador = sc.next().charAt(0);


        switch (operador){
            case '+':
                calc.somar();
                System.out.println("Resultado: " + calc.resultado1);
                break;

            case '-':
                calc.subtrair();
                System.out.println("Resultado: " + calc.resultado2);
                break;

            case '*':
                calc.multiplicar();
                System.out.println("Resultado: " + calc.resultado3);
                break;

            case '/':
                calc.dividir();
                System.out.println("Resultado: " + calc.resultado4);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operador);
        }
    }
}

