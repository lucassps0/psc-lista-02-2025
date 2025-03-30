import java.util.Scanner;
public class Atividade5
{
    public static void main(String[] args) {
        Scanner leitorGasolina = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: ");
        double precoLitro = leitorGasolina.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = leitorGasolina.nextDouble();

        double valorPagar = precoLitro * litros;
        System.out.println("O valor total a pagar é: R$ " + valorPagar);

        leitorGasolina.close();
    }
}
