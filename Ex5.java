
package exercicio1;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[]args){
        
        //cria o scanner
        Scanner ent = new Scanner(System.in);
        
        //pede e le o lado do quadrado 
        System.out.println("insira o lado do quadrado em centimetros:");
        float L = ent.nextFloat();
        
        //imprime a area do quadrado 
        System.out.printf("O quadrado tem %.2f centimetros de area", L*L);
    }
    
}
