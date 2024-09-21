
package exercicio1;
import java.util.Scanner;
public class Ex15 {
    public static void main (String[]args){
        
        //criando scanner
        Scanner ent = new Scanner (System.in);
        
        //pede e le o valor de A
        System.out.println("Insira o valor de A");
        double A = ent.nextDouble();
        
        //pede e le o valor de B
        System.out.println("Insira o valor de B");
        double B = ent.nextDouble();
        
        //pede e le o valor de C
        System.out.println("Insira o valor de C");
        double C = ent.nextDouble();
        
        //declarar e calcular delta 
        double delt = (B*B - 4*A*C);
                
        //criando condicoes de quiando é impossivel calcular 
        if (A==0||delt<0){
            System.out.println("Impossivel calcular");
        }else {
            
        //declarar e calcular a raiz quadrada de delta
        double raiz_delt = Math.sqrt(delt);
            
        //declarar e calcular bhaskara positiva 
        double bhask_pos = (- B + raiz_delt) / (2*A);
        
        //declarar e calcular bhaskara negativa
        double bhask_neg = (-B - raiz_delt) / (2*A);
        
            System.out.printf("O valor da raiz: %.2f\n",bhask_pos);
            System.out.printf("O valor da raiz: %.2f\n",bhask_neg);
        }
    }
}
