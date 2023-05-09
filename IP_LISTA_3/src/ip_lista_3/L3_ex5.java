
package ip_lista_3;

import java.util.Scanner;

public class L3_ex5 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double N;
    System.out.println("Digite um algarismo");
    N = Double.parseDouble(input.nextLine());
    if(N<=10)
        System.out.println("F1");
    else 
        if(N>10&&N<=100)
            System.out.println("F2");
         	
        else
            System.out.println("F3");	 
    }   
}

    

