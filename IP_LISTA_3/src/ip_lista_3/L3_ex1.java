
package ip_lista_3;

import java.util.Scanner;

public class L3_ex1 {
     public static void main(String[] args) {
   	Scanner input = new Scanner(System.in);
    	double p, q, conta, atraso;
   
    	System.out.println("Esse algoritmo determina a conta de energia paga em dia e em atraso. ");
    	System.out.println("Digite o preco do quilowatt");
    	p = Double.parseDouble(input.nextLine());
    	System.out.println("Digite a quantidade de quilowatts");
    	q = Double.parseDouble(input.nextLine());
    	conta = p*q;
    	atraso = conta+conta*0.1;
    	if (q>70){System.out.println("Consumo elevado de energia");}
    	else {System.out.println("Voce e um consumidor consciente");}
    	System.out.println("O valor da conta: "+conta);
    	System.out.println("O valor da conta atrasada: "+atraso);	 
   }  
}
