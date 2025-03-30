import java.util.Scanner;

public class Atividade2
{
    public static void main(String[] args) {
        Scanner leitorNumeros = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = leitorNumeros.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitorNumeros.nextInt();

        System.out.println("Soma: " + (num1 + num2));
        System.out.println("Subtração: " + (num1 - num2));
        System.out.println("Multiplicação: " + (num1 * num2));

        leitorNumeros.close();
    }
}
