
package exercicio1;
import java.util.Scanner;
public class ex2 {
     public static void main(String[] args) {
         
      //cria o scanner 
      Scanner ent = new Scanner (System.in);
      
      //pede e le a base
      System.out.println("insira a base:");
      byte base = ent.nextByte();
      
      //pede e le o expoente
      System.out.println("insira o expoente:");
      byte expo = ent.nextByte();
      
      //declaro e faço o resultado
      double resul = Math.pow(base,expo);
      
      //imprime o resultado 
      System.out.printf("o resultado = %.2f ", resul);   
     }
}
        