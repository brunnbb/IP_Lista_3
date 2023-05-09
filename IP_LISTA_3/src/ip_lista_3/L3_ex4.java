
package ip_lista_3;

import java.util.Scanner;

public class L3_ex4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, R;
 
  	System.out.println("Digite um algarismo inteiro");
  	N = Integer.parseInt(input.nextLine());
  	R = N%2;
     	if(R==0)
            System.out.println("O algarismo faz-se par ");
     	
     	else 
            System.out.println("O algarismo faz-se impar");
    }   
}

    

