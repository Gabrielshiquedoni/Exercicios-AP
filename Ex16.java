
package exercicio1;
import java.util.Scanner;
public class Ex16 {
    public static void main (String[]args){
        
       //criando scanner
       Scanner ent = new Scanner(System.in);
       
       //pede e le a hora do inicio do jogo
        System.out.println("Insira o horario de inicio do jogo: ");
        int hora_in = ent.nextInt();
        
        //pede e le o horario em que o jogo acabou
        System.out.println("Insira o horario de fim do jogo: ");
        int hora_fim = ent.nextInt();
        
        //declara a variavel duracao
        int duracao;
                
        //condicional dos horarios    
        if (hora_in < hora_fim) {
            duracao = hora_fim - hora_in;
        } else {
            duracao = 24 - hora_in + hora_fim;  // Caso o jogo termine no dia seguinte
        }

        // Garantir que a duração seja no mínimo 1 hora e no máximo 24 horas
        if (duracao <= 0) {
            duracao = 24;
        }

        //imprime a duração do jogo
        System.out.println("A duração do jogo foi de " + duracao + " hora(s)."); 
    }
}
