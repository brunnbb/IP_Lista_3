
package ip_lista_3;

import java.util.Scanner;

public class L3_ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  	int a, b, c;
     	String nomeA, nomeB, nomeC;
  	System.out.println("O nome do primeiro produto.");
     	nomeA = input.nextLine();
     	System.out.println("A quantidade desse produto.");
     	a = Integer.parseInt(input.nextLine());
     	System.out.println("O nome do segundo produto.");
     	nomeB = input.nextLine();
     	System.out.println("A quantidade desse produto.");
     	b = Integer.parseInt(input.nextLine());
     	System.out.println("O nome do terceiro produto.");
     	nomeC = input.nextLine();
     	System.out.println("A quantidade desse produto.");
     	c = Integer.parseInt(input.nextLine());
    	 
     	if(a<30){
         	System.out.println("O primeiro produto esta abaixo do estoque minimo.");
     	}
     	else{
         	System.out.println("O primeiro produto esta dentro do estoque minimo.");
     	}
     	if(b<30){
         	System.out.println("O segundo produto esta abaixo do estoque minimo.");
     	}
     	else{
         	System.out.println("O segundo produto esta dentro do estoque minimo.");
     	}
     	if(c<30){
         	System.out.println("O terceiro produto esta abaixo do estoque minimo.");
     	}
     	else{
         	System.out.println("O terceiro produto esta dentro do estoque minimo.");
     	}
    }   
}

    

