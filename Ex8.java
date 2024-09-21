
package exercicio1;
import java.util.Scanner;
public class Ex8 {
    public static void main (String[]args){
        
        //criando Scanner
        Scanner ent = new Scanner(System.in);
        
        //pedindo a nota 1
        System.out.println("Insira a nota 1");
        float n1 = ent.nextFloat();
        
        //pedindo a nota 2
        System.out.println("Insira a nota 2");
        float n2 = ent.nextFloat();
        
        //pedindo a nota 3
        System.out.println("Insira a nota 3");
        float n3 = ent.nextFloat();
        
        //pedindo a nota 4
        System.out.println("Insira a nota 4");
        float n4 = ent.nextFloat();
        
        //imprimindo e realizando a conta da media 
        System.out.printf("a media das 4 notas é igual a: %.2f", (n1+n2+n3+n4)/4);
        
    }
}
