import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner LeitorNumero = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = LeitorNumero.nextInt();

        System.out.println("O número informado foi " + numero);

        LeitorNumero.close();
    }
}