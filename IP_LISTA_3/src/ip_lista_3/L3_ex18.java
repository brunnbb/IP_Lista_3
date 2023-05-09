
package ip_lista_3;

import java.util.Scanner;

public class L3_ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  	double saldo, cre;
     	System.out.println("Esse algoritmo determina um credito especial");
  	System.out.println("Digite o saldo medio no ultimo ano");
     	saldo = Double.parseDouble(input.nextLine());
     	if (saldo<=500)
         	cre = saldo*0;  	 
     	else
            if(saldo>=500.01&&saldo<=1000)
             	cre = saldo*30/100;
         	else
             	if(saldo>=1000.01&&saldo<=3000)
                 	cre = saldo*40/100;
             	else
                 	cre = saldo*50/100;
     	System.out.println("O credito especial disponivel: R$ "+cre);
    	 
    }   
}


    

