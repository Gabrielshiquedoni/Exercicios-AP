
package exercicio1;
import java.util.Scanner;
public class ex3 {
    public static void main (String[]args){
        
        //cria o scanner
        Scanner ent = new Scanner(System.in);
        
        //pede e le o numero 
        System.out.println("Insira um número:");
        double n = ent.nextDouble();
        
        //imprime o quadrado no numero 
        System.out.printf("o quadrado desse numero: %.2f\n", n*n);
    }
}
