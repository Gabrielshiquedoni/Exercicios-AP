
package exercicio1;
import java.util.Scanner;
public class Ex11 {
    public static void main (String[]args){
        
        //criando scanner
        Scanner ent = new Scanner (System.in);
        
        //pede e le o numero 
        System.out.println("Insira um numero:");
        float n = ent.nextFloat();
        
        //cria condicao, se n é menor que 0 imprimir "numero negativo", se nao, " numero positivo 
        if (n<0){
            System.out.println("Numero negativo");
        }else {
            System.out.println("Numero positivo");
        }
    }
}
