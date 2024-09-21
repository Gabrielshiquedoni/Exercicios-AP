
package exercicio1;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[]args){
        
        //criando scanner
        Scanner ent = new Scanner (System.in);
        
        //declarando e pedindo o lado A
        System.out.println("Insira o lado A");
        float A = ent.nextFloat();
        
        //declarando e pedindo o lado B
        System.out.println("Insira o lado B");
        float B = ent.nextFloat();
        
        //imprimindo e fazendo a conta da hipotenusa 
        System.out.printf("a hipotenusa desse triangulo é igual a: %.2f", Math.sqrt(A*A+B*B));

    }
}
