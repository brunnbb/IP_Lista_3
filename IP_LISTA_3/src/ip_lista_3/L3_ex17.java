
package ip_lista_3;

import java.util.Scanner;

public class L3_ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  	double peso, massa;
  	int pl;
    	 
     	System.out.println("Esse algoritmo determina o peso de uma pessoa em outros planetas");
  	System.out.println("Insira o seu peso.");
     	peso = Double.parseDouble(input.nextLine());
     	System.out.println("Digite o numero do planeta desejado");
     	System.out.println("1 - Mercurio");
     	System.out.println("2 - Venus");
     	System.out.println("3 - Marte");
     	System.out.println("4 - Jupiter");
     	System.out.println("5 - Saturno");
     	System.out.println("6 - Urano");
     	System.out.println("7 - Netuno");
     	pl = Integer.parseInt(input.nextLine());
     	massa = peso/9.8;
    	 
     	switch(pl){
         	case 1: System.out.println("O seu peso no planeta selecionado: "+massa*3.7+" kg");
         	break;
         	case 2: System.out.println("O seu peso no planeta selecionado: "+massa*8.87+" kg");
         	break;
         	case 3: System.out.println("O seu peso no planeta selecionado: "+massa*3.711+" kg");
         	break;
         	case 4: System.out.println("O seu peso no planeta selecionado: "+massa*24.79+" kg");
         	break;
         	case 5: System.out.println("O seu peso no planeta selecionado: "+massa*10.44+" kg");
         	break;
         	case 6: System.out.println("O seu peso no planeta selecionado: "+massa*8.87+" kg");
         	break;
         	case 7: System.out.println("O seu peso no planeta selecionado: "+massa*11.15+" kg");
         	default: System.out.println("Numero digitado invalido");	 
     	          }  
    }   
}

    

