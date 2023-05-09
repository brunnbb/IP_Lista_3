
package ip_lista_3;

import java.util.Scanner;

public class L3_ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  	int idade;
  	 
  	System.out.println("Qual a idade do nadador.");
     	idade = Integer.parseInt(input.nextLine());
     	if (5<=idade&&idade<=10)
         	System.out.println("A sua categoria: Infantil");	
     	else
            if(11<=idade&&idade<=17)
             	System.out.println("A sua categoria: Juvenil");
            else
             	if(18<=idade&&idade<=60)
               	System.out.println("A sua categoria: Adulto");
             	else
                    if(idade>60)
                     	System.out.println("A sua categoria : Senior");
                    else
                     	System.out.println("Muito jovem, nao pode participar");	 
    }   
}

    
