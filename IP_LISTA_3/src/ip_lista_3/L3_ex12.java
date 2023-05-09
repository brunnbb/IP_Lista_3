
package ip_lista_3;

import java.util.Scanner;

public class L3_ex12 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    float a;
    System.out.println("Digite o valor do angulo.");
    a = Float.parseFloat(input.nextLine());
    if (a>90)
        System.out.println("O angulo e obtuso.");
    else
        if (a==90)
            System.out.println("O angulo e reto.");
        else
            System.out.println("O angulo e agudo");	 
    }   
}



    

