
package ip_lista_3;

import java.util.Scanner;

public class L3_ex14 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double a, pesoM, pesoF;
    char g;
    System.out.println("Qual a altura da pessoa.");
    a = Double.parseDouble(input.nextLine());
    System.out.println("Qual o genero da pessoa? (M ou F)");
    g = input.nextLine().charAt(0);
    pesoM = 72.7*a - 58;
    pesoF = 62.1*a - 44.7; 
    
    if((g =='M')||(g == 'm'))
    	System.out.println("O seu peso ideal e "+pesoM+" kg");	 
    else
    	if((g == 'F')||(g == 'f'))
            System.out.println("O seu peso ideal e "+pesoF+" kg");
    	else
            System.out.println("Erro, genero invalido.");		 
    }   
}

    

