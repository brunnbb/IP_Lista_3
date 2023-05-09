
package ip_lista_3;

import java.util.Scanner;

public class L3_ex7 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, n3;
    System.out.println("Digite o primeiro algarismo");
    n1 = Integer.parseInt(input.nextLine());
    System.out.println("Digite o segundo algarismo");
    n2 = Integer.parseInt(input.nextLine());
    System.out.println("Digite o terceiro algarismo");
    n3 = Integer.parseInt(input.nextLine());
    if(n1<=n2&&n2<=n3)
        System.out.println("Algarismos ordenados: "+n1+" "+n2+" "+n3);
    else
        if(n1<=n3&&n3<=n2)
            System.out.println("Algarismos ordenados: "+n1+" "+n3+" "+" "+n2);          	 
        else
            if(n2<=n1&&n1<=n3)
                System.out.println("Algarismos ordenados: "+n2+" "+n1+" "+n3);
            else
                if(n3<=n1&&n1<=n2)
                    System.out.println("Algarismos ordenados: "+n3+" "+n1+" "+n2);
                else
                    if(n2<=n3&&n3<=n1)
                        System.out.println("Algarismos ordenados: "+n2+" "+n3+" "+n1);
                     	else
                        System.out.println("Algarismos ordenados: "+n3+" "+n2+" "+n1);   	   	
    }   
}

    

