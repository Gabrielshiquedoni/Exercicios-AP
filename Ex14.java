
package exercicio1;
import java.util.Scanner;
public class Ex14 {
    public static void main (String[]args){
        
        //criando scanner 
        Scanner ent = new Scanner (System.in);
        
        //pede e le n1
        System.out.println("Insira o numero 1");
        float n1 = ent.nextFloat();
        
        //pede e le n2
        System.out.println("Insira o numero 2");
        float n2 = ent.nextFloat();
        
        //criando condicional
        if (n1==n2){
            System.out.printf(" n2 e n1 sao iguais, entao o resultado é 1");
        } else if (n1>n2){
            System.out.printf("n1 dividido por n2: %.2f", n1/n2);
        }else {
            System.out.printf("n2 dividido por n1: %.2f", n2/n1);
        }
        } 
    }

