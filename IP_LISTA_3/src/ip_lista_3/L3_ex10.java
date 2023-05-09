
package ip_lista_3;

import java.util.Scanner;

public class L3_ex10 {
    public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
   	int x, y, z;
   	 
        System.out.println("Esse algoritmo determina se tres valores formam um triangulo");
        System.out.println("Digite o primeiro valor");
        x = Integer.parseInt(input.nextLine());
        System.out.println("Digite o segundo valor");
        y = Integer.parseInt(input.nextLine());
        System.out.println("Digite o terceiro valor");
        z = Integer.parseInt(input.nextLine());
        if((x+y>z)||(z+y>z)||(z+x>y))
            System.out.println("Nao e triangulo");
        else
            if(x==y&&x==z)
                System.out.println("Equilatero");
            else
                if(x==y||x==z||z==y)
                    System.out.println("Isocele");
                else
                    System.out.println("Escaleno");     
        }   
}  

    

