
package exercicio1;
import java.util.Scanner;
public class Ex12 {
    public static void main(String[]args){
        
        //cria o scanner
        Scanner ent = new Scanner(System.in);
        
        //pede e le o valor de L
        System.out.println("Insira o valor de L");
        double L = ent.nextDouble();
        
        //pede e le o valor de R
        System.out.println("Insira o valor de R");
        double R = ent.nextDouble();
        
        //declaro e calculo a area do quadrado 
        double area_quad = L*L;

        //declaro e calculo a area do circulo
        double area_circ = Math.PI * R * R;
        
        //cria condicional, se a area do quadrado é maior que a do circulo impirmir a area do quadrado, se nao, imprimir a do circulo 
        if (area_quad>area_circ){
            System.out.printf("Quadrado A = %.2f",area_quad);
        }else{
            System.out.printf("Circulo A = %.2f",area_circ);
        }  
    }
}
