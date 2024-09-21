
package exercicio1;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[]args){
        
        //cria o scanner 
        Scanner ent = new Scanner (System.in);
        
        //pede e le o valor de A
        System.out.println("Insira o valor de A");
        float A = ent.nextFloat();
        
        //pede e le o valor de B
        System.out.println("Insira o valor de B");
        float B = ent.nextFloat();
        
        // pede e le o valor de C
        System.out.println("Insira o valor de C");
        float C = ent.nextFloat();
        
        //imprime a area do triangulo 
        System.out.printf("A área do triângulo retângulo que tem A por base e C por altura = %.2f\n", (C*A)/2);
        
        // imrpime a area do circulo 
        System.out.printf("A área do círculo de raio C = %.2f\n ",  (3.14159*C*C));
        
        // imprime a area do trapezio 
        System.out.printf("A área do trapézio que tem A e B por bases e C por altura = %.2f\n", (A+B)*C/2);
        
        //imprime a area do quadrado 
        System.out.printf("A área do quadrado que tem lado B = %.2f\n", B*B);
        
        //imprime a area do retangulo 
        System.out.printf("A área do retângulo que tem lados A e B = %.2f\n ", A*B);
        
        //imprime o perimetro do retangulo 
        System.out.printf("O perímetro do retângulo que tem lados A e B = %.2f\n ", 2*(A+B));
    }  
}
