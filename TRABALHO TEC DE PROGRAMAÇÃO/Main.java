import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // decimais digitados com ponto: 7.5

        // Criação dos objetos (pelo menos cinco funcionários)
        Funcionario[] funcionarios = {
            new Funcionario("Ana Souza", "Analista", 4500.00),
            new Funcionario("Carlos Lima", "Técnico", 3200.00),
            new Funcionario("Mariana Alves", "Engenheira", 8900.00),
            new Funcionario("Pedro Rocha", "Assistente", 2400.00),
            new Funcionario("Juliana Costa", "Supervisora", 6100.00)
        };

        System.out.println("===== AUMENTO DE SALÁRIO =====");

        // Percentual informado individualmente para cada funcionário
        for (Funcionario f : funcionarios) {
            System.out.printf("%nFuncionário: %s (%s) - salário atual: R$ %.2f%n",
                    f.getNome(), f.getCargo(), f.getSalario());
            System.out.print("Percentual de aumento (%): ");
            double percentual = scanner.nextDouble();

            f.aumentarSalario(percentual);
        }

        System.out.println("\n===== DADOS APÓS O AUMENTO =====");
        for (Funcionario f : funcionarios) {
            System.out.println("--------------------------------");
            f.exibirDados();
        }
        System.out.println("--------------------------------");

        scanner.close();
    }
}