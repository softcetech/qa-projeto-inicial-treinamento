import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ConversorTemperatura{
    public static double celsiusParaFahrenheit(double c){
        return (double) (c * 9/5) + 32;
    }
    public static double fahrenheitParaCelsius(double f){
        return (double) (f - 32) * 5/9;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num1 = scanner.nextInt();

        System.out.println("Escolha qual conversão deseja: ");
        System.out.println("1 - Converter de Celsius para Fahrenheit");
        System.out.println("2 - Converter de Fahrenheit para Celsius");
        System.out.println("Opção: ");

        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Resultado da conversão de Celsius para Fahrenheit: " + celsiusParaFahrenheit(num1));
                break;
            case 2:
                try{
                    System.out.println("Resultado da conversão de Fahrenheit para Celsius:" + fahrenheitParaCelsius(num1));
                } catch (IllegalArgumentException e){
                    System.out.print("Erro: " + e.getMessage());
                }
                break;
            default:
                System.out.print("Opção inválida.");

        }
        scanner.close();
    }
}
