
package exercicio1;
import java.util.Scanner;
public class Ex4 {
    public static void main (String[]args){
        
        //cria o scanner
        Scanner ent = new Scanner(System.in);
        
        //pede e le o numero 
        System.out.println("Insira um numero:");
        int n1 = ent.nextInt();
        
        //pede e le o outro numero 
        System.out.println("insira outro numero:");
        int n2 = ent.nextInt();
        
        //imprime os numeros consecutivos dos numeros inseridos
        System.out.printf("o consecutivo dos números digitados sao %d e %d", n1+1, n2+1);
    }
}
