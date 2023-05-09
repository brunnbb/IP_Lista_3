
package ip_lista_3;

import java.util.Scanner;

public class L3_ex2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double p1, p2, t;
   	
    	System.out.println("Esse algoritmo determina se um aluno foi aprovado . ");
    	System.out.println("Digite a nota da prova 1");
    	p1 = Double.parseDouble(input.nextLine());
    	System.out.println("Digite a nota da prova 1");
    	p2 = Double.parseDouble(input.nextLine());
    	System.out.println("Digite a nota do trabalho");
    	t = Double.parseDouble(input.nextLine());
   	 
    	if ((p1>=6||p2>=6)&&(t>=7)){System.out.println("Parabens, voce foi aprovado");}
    	else {System.out.println("Infelizmente, voce nao foi aprovado");}	 
   }
}
