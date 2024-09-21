
package exercicio1;
import java.util.Scanner;
public class Ex17 {
    public static void main (String[]args){
        
        //cria o scanner 
        Scanner ent = new Scanner (System.in);
        
        //recebe os valores de A,B,C e D
        System.out.println("Insira o valor de A");
        int A = ent.nextInt();
        System.out.println("Insira o valor de B");
        int B = ent.nextInt();
        System.out.println("Insira o valor de C");
        int C = ent.nextInt();
        System.out.println("Insira o valor de D");
        int D = ent.nextInt();
        
        if (B>C && D>A && (C+D)>(A+B) && C>0 && D>0 && A%2==0 ){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores nao aceitos");
        }
    }
}
