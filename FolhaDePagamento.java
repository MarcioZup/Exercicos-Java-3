import java.util.Scanner;

public class FolhaDePagamento {
    public static void main(String[] args) {

        System.out.println("Entre com o valor em R$ da sua hora trabalhada: ");
        Scanner teclado = new Scanner(System.in);
        double valorHoraTrabalhada = teclado.nextDouble();
        System.out.println("Entre com a quantidade de horas trabalhadas nesse mês: ");
        double quantidadeHorasTrabalhadas = teclado.nextDouble();
        teclado.close();
        double salarioBruto = (valorHoraTrabalhada * quantidadeHorasTrabalhadas);
        double descontoIR;
        double descontoINSS;
        double FGTS;
        double totalDescontos;
        double salarioLiquido;

        if (salarioBruto <= 900){
            System.out.printf("Salário Bruto: ( %.0f * %.0f) \t\t\t: R$ %.2f \n", quantidadeHorasTrabalhadas, valorHoraTrabalhada, salarioBruto);
            System.out.printf("(-) IR (isento) \t\t\t\t\t: R$ %.2f \n", salarioBruto);
            descontoINSS = (float) (salarioBruto * 0.1);
            System.out.printf("(-) INSS ( 10%%) \t\t\t\t\t: R$ %.2f \n", descontoINSS);
            FGTS = (salarioBruto * 0.11);
            System.out.printf("FGTS (11%%) \t\t\t\t\t\t\t: R$ %.2f \n", FGTS);
            totalDescontos = descontoINSS;
            System.out.printf("Total de descontos \t\t\t\t\t: R$ %.2f \n", totalDescontos);
            salarioLiquido = (salarioBruto - totalDescontos);
            System.out.printf("Salário Líquido \t\t\t\t\t: R$ %.2f ", salarioLiquido);
        }else if(salarioBruto > 900 & salarioBruto <= 1500){
            System.out.printf("Salário Bruto: ( %.0f * %.0f) \t\t\t: R$ %.2f \n", quantidadeHorasTrabalhadas, valorHoraTrabalhada, salarioBruto);
            descontoIR = (salarioBruto * 0.05);
            System.out.printf("(-) IR (5%%) \t\t\t\t\t\t: R$ %.2f \n", descontoIR);
            descontoINSS = (float) (salarioBruto * 0.1);
            System.out.printf("(-) INSS ( 10%%) \t\t\t\t\t: R$ %.2f \n", descontoINSS);
            FGTS = (salarioBruto * 0.11);
            System.out.printf("FGTS (11%%) \t\t\t\t\t\t\t: R$ %.2f \n", FGTS);
            totalDescontos = (descontoINSS + descontoIR);
            System.out.printf("Total de descontos \t\t\t\t\t: R$ %.2f \n", totalDescontos);
            salarioLiquido = (salarioBruto - totalDescontos);
            System.out.printf("Salário Líquido \t\t\t\t\t: R$ %.2f ", salarioLiquido);
        }else if(salarioBruto > 1500 & salarioBruto <= 2500){
            System.out.printf("Salário Bruto: ( %.0f * %.0f) \t\t\t: R$ %.2f \n", quantidadeHorasTrabalhadas, valorHoraTrabalhada, salarioBruto);
            descontoIR = (salarioBruto * 0.1);
            System.out.printf("(-) IR (10%%) \t\t\t\t\t\t: R$ %.2f \n", descontoIR);
            descontoINSS = (float) (salarioBruto * 0.1);
            System.out.printf("(-) INSS ( 10%%) \t\t\t\t\t: R$ %.2f \n", descontoINSS);
            FGTS = (salarioBruto * 0.11);
            System.out.printf("FGTS (11%%) \t\t\t\t\t\t\t: R$ %.2f \n", FGTS);
            totalDescontos = (descontoINSS + descontoIR);
            System.out.printf("Total de descontos \t\t\t\t\t: R$ %.2f \n", totalDescontos);
            salarioLiquido = (salarioBruto - totalDescontos);
            System.out.printf("Salário Líquido \t\t\t\t\t: R$ %.2f ", salarioLiquido);
        }else{
            System.out.printf("Salário Bruto: ( %.0f * %.0f) \t\t\t: R$ %.2f \n", quantidadeHorasTrabalhadas, valorHoraTrabalhada, salarioBruto);
            descontoIR = (salarioBruto * 0.2);
            System.out.printf("(-) IR (20%%) \t\t\t\t\t\t: R$ %.2f \n", descontoIR);
            descontoINSS = (float) (salarioBruto * 0.1);
            System.out.printf("(-) INSS ( 10%%) \t\t\t\t\t: R$ %.2f \n", descontoINSS);
            FGTS = (salarioBruto * 0.11);
            System.out.printf("FGTS (11%%) \t\t\t\t\t\t\t: R$ %.2f \n", FGTS);
            totalDescontos = (descontoINSS + descontoIR);
            System.out.printf("Total de descontos \t\t\t\t\t: R$ %.2f \n", totalDescontos);
            salarioLiquido = (salarioBruto - totalDescontos);
            System.out.printf("Salário Líquido \t\t\t\t\t: R$ %.2f ", salarioLiquido);
        }

    }
}
