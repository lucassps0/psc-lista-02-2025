import java.util.Scanner;
public class Atividade6
{
    public static void main(String[] args) {
        Scanner leitorViagem = new Scanner(System.in);
        System.out.print("preço da viagem para a Alemanha: ");
        double precoAlemanha = leitorViagem.nextDouble();

        System.out.print("preço da viagem para Portugal: ");
        double precoPortugal = leitorViagem.nextDouble();

        System.out.print("preço da viagem para a Itália: ");
        double precoItalia = leitorViagem.nextDouble();

        System.out.print("quantidade de pessoas que irão para a Alemanha: ");
        int pessoasAlemanha = leitorViagem.nextInt();

        System.out.print("quantidade de pessoas que irão para Portugal: ");
        int pessoasPortugal = leitorViagem.nextInt();

        System.out.print("quantidade de pessoas que irão para a Itália: ");
        int pessoasItalia = leitorViagem.nextInt();

        double valorTotalAlemanha = precoAlemanha * pessoasAlemanha;
        double valorTotalPortugal = precoPortugal * pessoasPortugal;
        double valorTotalItalia = precoItalia * pessoasItalia;

        double valorTotalViagem = valorTotalAlemanha + valorTotalPortugal + valorTotalItalia;
        int totalPessoas = pessoasAlemanha + pessoasPortugal + pessoasItalia;

        System.out.printf("O valor total da viagem é: % 2f Reais%n", valorTotalViagem);
        System.out.printf("Um total de %d pessoas que irão nas viagens.%n", totalPessoas);
        leitorViagem.close();
    }
}
