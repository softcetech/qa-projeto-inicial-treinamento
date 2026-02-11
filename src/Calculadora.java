
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Calculadora {
    // atributo
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {

        return a * b;
    }

    public static double dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return (double) a / b;
    }

    //metodo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("/nEscolha a operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da Soma: " + somar(num1, num2));
                break;
            case 2:
                System.out.println("Resultado da Subtração: " + subtrair(num1, num2));
                break;
            case 3:
                System.out.println("Resultado da Multiplicação: " + multiplicar(num1, num2));
                break;
            case 4:
                try {
                    System.out.println("Resultado da Divisão: " + dividir(num1, num2));
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                break;
                
            default:
                System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

