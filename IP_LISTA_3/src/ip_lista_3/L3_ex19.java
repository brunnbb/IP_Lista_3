
package ip_lista_3;

import java.util.Scanner;

public class L3_ex19 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int d, m, a;
    boolean bi, v, v1, V;
   	 
    System.out.println("Esse algoritmo determina se uma data e valida ou nao.");
    System.out.println("Digite o dia");
    d = Integer.parseInt(input.nextLine());
    System.out.println("Digite o mes");
    m = Integer.parseInt(input.nextLine());
    System.out.println("Digite o ano");
    a = Integer.parseInt(input.nextLine());
    bi = (a%4 == 0)&&((a%100 != 0)||(a%400 == 0));
   	 
    	if (m==1||m==3||m==5||m==7||m==8||m==10||m==12){
        	v = (d<=31)&&(d>=1);
    	}
    	else{
        	if(m==4||m==6||m==9||m==11){
            	v = (d<=30)&&(d>1);
        	}
        	else{
            	if(m==2){
                	if(bi==true){
                    	v = (d<=29)&&(d>=1);
                	}
                	else{
                    	v = (d<=28)&&(d>=1);
                	}
            	}
            	else{
                	v = false;
            	}
        	}
    	}
   	 
    	v1 = a>=1&&a<=9998;
    	V = v1&&v;
    	if (V==true)
            System.out.println("Data valida.");
    	
    	else
            System.out.println("Data invalida.");
    	
   	 
   }   }


    
    

