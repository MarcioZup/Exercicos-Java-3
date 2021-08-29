import java.util.Locale;
import java.util.Scanner;

public class PostoCombustiveis {
    public static void main(String[] args) {

        System.out.println("Digite o tipo de combustível (G - Gasolina ou A - Álcool) : ");
        Scanner teclado = new Scanner(System.in);
        String tipoDeCombustivel = teclado.next();
        System.out.println("Entre com o número de litros comprados: ");
        double litrosVendidos = teclado.nextDouble();
        double valorFinalComDesconto;
        double valorFinal = 0;
        double precoAlcool = 1.9;
        double precoGasolina = 2.5;

        if (tipoDeCombustivel.equals("A") & litrosVendidos <= 20) {
            valorFinal = (precoAlcool * litrosVendidos);
            valorFinalComDesconto = (valorFinal - (valorFinal * 0.03));
            System.out.printf("O valor a ser pago é R$ %.2f com o desconto de 3%%.", valorFinalComDesconto);
        } else if (tipoDeCombustivel.equals("A") & litrosVendidos > 20) {
            valorFinal = (precoAlcool * litrosVendidos);
            valorFinalComDesconto = (valorFinal - (valorFinal * 0.05));
            System.out.printf("O valor a ser pago é R$ %.2f com o desconto de 5%%.", valorFinalComDesconto);
        } else if (tipoDeCombustivel.equals("G") & litrosVendidos <= 20) {
            valorFinal = (precoGasolina * litrosVendidos);
            valorFinalComDesconto = (valorFinal - (valorFinal * 0.04));
            System.out.printf("O valor a ser pago é R$ %.2f com o desconto de 4%%.", valorFinalComDesconto);
        }else{
            valorFinal = (2.5 * litrosVendidos);
            valorFinalComDesconto = (valorFinal - (valorFinal * 0.06));
            System.out.printf("O valor a ser pago é R$ %.2f com o desconto de 6%%.", valorFinalComDesconto);
        }
    }
}
