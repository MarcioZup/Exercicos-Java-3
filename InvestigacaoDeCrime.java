import java.util.Locale;
import java.util.Scanner;

public class InvestigacaoDeCrime {
    public static void main(String[] args) {
        System.out.println("Tenho algumas perguntas a fazer para a investigação desse crime. Me responda com S para SIM e N para NÂO.");
        int contadorDeSim = 0;
        System.out.println("Telefonou para a vítima?");
        Scanner teclado = new Scanner(System.in);
        char resposta = teclado.next().toUpperCase(Locale.ROOT).charAt(0);
        if (resposta == 'S'){
            contadorDeSim ++;
        }else{
            contadorDeSim = contadorDeSim + 0;
        }
        System.out.println("Esteve no local do crime?");
        resposta = teclado.next().toUpperCase(Locale.ROOT).charAt(0);
        if (resposta == 'S'){
            contadorDeSim ++;
        }else{
            contadorDeSim = contadorDeSim + 0;
        }
        System.out.println("Mora perto da vítima?");
        resposta = teclado.next().toUpperCase(Locale.ROOT).charAt(0);
        if (resposta == 'S'){
            contadorDeSim ++;
        }else{
            contadorDeSim = contadorDeSim + 0;
        }
        System.out.println("Devia para a vítima?");
        resposta = teclado.next().toUpperCase(Locale.ROOT).charAt(0);
        if (resposta == 'S'){
            contadorDeSim ++;
        }else{
            contadorDeSim = contadorDeSim + 0;
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = teclado.next().toUpperCase(Locale.ROOT).charAt(0);
        if (resposta == 'S'){
            contadorDeSim ++;
        }else{
            contadorDeSim = contadorDeSim + 0;
        }
        switch (contadorDeSim){
            case 2:
                System.out.println("Você é uma pessoa SUSPEITA do crime!");
                break;
            case 3: case 4:
                System.out.println("Você é CÚMPLICE do crime!");
                break;
            case 5:
                System.out.println("Você é o ASSASSINO! Está PRESO!");
                break;
            default:
                System.out.println("Você é INOCENTE! Obrigado por colaborar com a investigação!");
        }


    }
}
