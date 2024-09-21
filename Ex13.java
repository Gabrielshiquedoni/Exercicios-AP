
package exercicio1;
import java.util.Scanner;
public class Ex13 {
    public static void main(String[]args){
        
        //criando scanner
        Scanner ent = new Scanner(System.in);
        
        //pede e le numero 1
        System.out.println("Insira numero 1");
        float n1 = ent.nextFloat();
        
        //pede e le numero 2
        System.out.println("Insira numero 2");
        float n2 = ent.nextFloat();
        
        //pede e le numero 3
        System.out.println("Insira numero 3");
        float n3 = ent.nextFloat();
        
        //criando condicional 
        if (n1>=n2&&n1>=n3) {
            System.out.println("O maior numero é o primeiro :"+n1);
        }else if (n2>=n1&&n2>=n3) {
            System.out.println("O maior numero é o segundo :"+n2);
        }else if (n3>=n1&&n3>=n2){
            System.out.println("O maior numero é o terceiro :"+n3);
        }
}
}

