import java.util.Scanner;
public class Atividade4
{
    public static void main(String[] args) {
        Scanner leitorNotas = new Scanner(System.in);
        double soma = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota " + i + ": ");
            soma += leitorNotas.nextDouble();
        }
        double media = soma / 4;
        System.out.println("Média: " + media);

        leitorNotas.close();
    }
}
