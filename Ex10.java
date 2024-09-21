
package exercicio1;
import java.util.Scanner;
public class Ex10 {
    public static void main (String []args){
        
        //criando Scanner 
        Scanner ent = new Scanner(System.in);
        
        //pede e le o nome do vendedor
        System.out.println("Insira o nome do vendedor:");
        String nome = ent.next();
        
        //pede e le o salario fixo 
        System.out.println("Insira o salario fixo:");
        float sal_base = ent.nextFloat();
        
        //pede e le o total de vendas em dinheiro 
        System.out.println("Insira em reais o quanto foi vendido:");
        float total_vend = ent.nextFloat();
        
        //operaçao para descobrir o salario final 
        float sal_final = sal_base + (total_vend*15)/100;
        
        //imprime o nome e o salario final 
        System.out.printf("O funcionario %s recebera %.2f ",nome, sal_final);
    }   
}
