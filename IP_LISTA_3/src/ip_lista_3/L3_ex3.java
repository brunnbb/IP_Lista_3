
package ip_lista_3;

import java.util.Scanner;

public class L3_ex3 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double peso, alt, IMC;
    
    System.out.println("Digite o peso");
    peso = Double.parseDouble(input.nextLine());
    System.out.println("Digite a altura");
    alt = Double.parseDouble(input.nextLine());
    IMC = peso/(alt*alt);
    	 
    	 
    System.out.println("O IMC da pessoa: "+IMC);
    if(IMC<20)
       System.out.println("A pessoa se encontra magro");
    else 
        if(IMC>=20&&IMC<=24.99)
           System.out.println("A pessoa se encontra normal");
        else
            if(IMC>=25&&IMC<=30)
             	 System.out.println("A pessoa se encontra em sobrepeso");	 
            else System.out.println("A pessoa se encontra obesa");
    }   	
} 

    

