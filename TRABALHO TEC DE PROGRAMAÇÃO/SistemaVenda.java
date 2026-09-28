import java.util.Locale;
import java.util.Scanner;

public class SistemaVenda {

    public static void main(String[] args) {
        
        Locale br = Locale.forLanguageTag("pt-BR");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(br);

        System.out.print("Quantidade de vendas: ");
        int quantidade = scanner.nextInt();

        double total = 0;
        double maior = 0;
        double menor = 0;
        int acimaDe500 = 0;

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Valor da venda " + i + ": R$ ");
            double venda = scanner.nextDouble();

            total += venda;

            
            if (i == 1) {
                maior = venda;
                menor = venda;
            } else {
                if (venda > maior) {
                    maior = venda;
                }
                if (venda < menor) {
                    menor = venda;
                }
            }

            if (venda > 500) {
                acimaDe500++;
            }
        }

        double media = total / quantidade;

        
        double percentual;
        if (total <= 1000) {
            percentual = 0.03;
        } else if (total <= 5000) {
            percentual = 0.05;
        } else {
            percentual = 0.08;
        }
        double comissao = total * percentual;

        System.out.println();
        System.out.println("===== RESUMO DO DIA =====");
        System.out.printf(br, "Valor total vendido : R$ %.2f%n", total);
        System.out.printf(br, "Maior venda         : R$ %.2f%n", maior);
        System.out.printf(br, "Menor venda         : R$ %.2f%n", menor);
        System.out.printf(br, "Média das vendas    : R$ %.2f%n", media);
        System.out.println("Vendas acima de R$ 500,00: " + acimaDe500);
        System.out.printf(br, "Comissão (%.0f%%)     : R$ %.2f%n", percentual * 100, comissao);
        System.out.println("=========================");

        scanner.close();
    }
}