
package exercicio1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        //cria o scanner
        Scanner scanner = new Scanner(System.in);

        // Lê o primeiro número
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        // Lê o segundo número
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcula o produto
        double produto = num1 * num2;

        // Exibe o resultado
        System.out.println("O produto dos números é: " + produto);
    }
    
}
