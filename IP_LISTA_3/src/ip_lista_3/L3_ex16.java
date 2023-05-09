
package ip_lista_3;

import java.util.Scanner;

public class L3_ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  	double x, y;
  	 
        System.out.println("Insira as coordenadas das abscissas.");
     	x = Double.parseDouble(input.nextLine());
     	System.out.println("Insira as coordenadas das ordenadas.");
     	y = Double.parseDouble(input.nextLine());
     	if(x>0&&y>0)
            System.out.println("Encontra-se no primeiro quadrante.");
     	else
            if(x<0&&y>0)
             	System.out.println("Encontra-se no segundo quadrante.");
            else
             	if(x<0&&y<0)
                    System.out.println("Encontra-se no terceiro quadrante");
             	else
                    if(x>0&&y<0)
                    System.out.println("Encontra-se no quarto quadrante");
    }
}    

    

