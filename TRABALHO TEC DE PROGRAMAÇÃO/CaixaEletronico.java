import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] notas = {200, 100, 50, 20, 10, 5, 2};

        System.out.print("Valor do saque: ");
        int valor = scanner.nextInt();

        System.out.println("Notas:");

       
        for (int i = 0; i < notas.length; i++) {
            int quantidade = valor / notas[i];

            if (quantidade > 0) {
                System.out.println(quantidade + " x R$ " + notas[i]);
                valor = valor % notas[i]; 
            }
        }

        scanner.close();
    }
}