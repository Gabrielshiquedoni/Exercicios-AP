
package exercicio1;
import java.util.Scanner;
public class Ex9 {
    public static void main (String[]args){
        
        //cria o scanner 
        Scanner ent = new Scanner (System.in);
        
        //pede o número de cadastro 
        System.out.println("Insira o numero de cadastro do funcionario:");
        int cad = ent.nextInt();
        
        //pede as horas trabalhadas 
        System.out.println("Insira o numero de horas que foram trabalhadas no mes :");
        float hrs = ent.nextFloat();
        
        //pede o valor por hora
        System.out.println("Insira o valor de cada hora trabalhada");
        float valor = ent.nextFloat();
        
        // imprime o numero de cadastro e ja realiza a conta do salario
        System.out.printf("o número de cadastro é %d e o salario é %.2f", cad, hrs*valor ); 
    }
}