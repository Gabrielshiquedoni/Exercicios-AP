
package exercicio1;
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos valores A, B e C
        System.out.print("Digite o valor de A: ");
        double A = scanner.nextDouble();
        System.out.print("Digite o valor de B: ");
        double B = scanner.nextDouble();
        System.out.print("Digite o valor de C: ");
        double C = scanner.nextDouble();

        // Ordenar os valores em ordem decrescente (sem array)
        double maior, meio, menor;

        if (A >= B && A >= C) {
            maior = A;
            if (B >= C) {
                meio = B;
                menor = C;
            } else {
                meio = C;
                menor = B;
            }
        } else if (B >= A && B >= C) {
            maior = B;
            if (A >= C) {
                meio = A;
                menor = C;
            } else {
                meio = C;
                menor = A;
            }
        } else {
            maior = C;
            if (A >= B) {
                meio = A;
                menor = B;
            } else {
                meio = B;
                menor = A;
            }
        }

        A = maior;
        B = meio;
        C = menor;

        // Verificar se forma triângulo
        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verificar tipo de triângulo pelos ângulos
            double A2 = A * A;
            double B2 = B * B;
            double C2 = C * C;

            if (A2 == (B2 + C2)) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (A2 > (B2 + C2)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else if (A2 < (B2 + C2)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verificar tipo de triângulo pelos lados
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (A == B || B == C || A == C) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }

    }
}


