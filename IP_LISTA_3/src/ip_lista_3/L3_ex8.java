
package ip_lista_3;

import java.util.Scanner;

public class L3_ex8 {
    public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
   	double sal, aum = 0, nov;
        String nome;
        char cat;
   	 
   	System.out.println("Digite o nome");
        nome = input.nextLine();
        System.out.println("Digite a categoria");
        cat = input.nextLine().charAt(0);
        System.out.println("Digite o salario atual");
        sal = Double.parseDouble(input.nextLine());
         
        switch(cat){
            case 'a': aum = sal*10/100;
            break;
            case 'A': aum = sal*10/100;
            break;
            case 'b': aum = sal*15/100;
            break;
            case 'B': aum = sal*15/100;
            break;
            case 'c': aum = sal*25/100;
            break;
            case 'C': aum = sal*25/100;
            break;
            case 'd': aum = sal*15/100;
            break;
            case 'D': aum = sal*15/100;
            break;
            case 'e': aum = sal*15/100;
            break;
            case 'E': aum = sal*15/100;
            break;
            case 'f': aum = sal*25/100;
            break;
            case 'F': aum = sal*25/100;
            break;
            case 'g': aum = sal*30/100;
            break;
            case 'G': aum = sal*30/100;
            break;
            case 'h': aum = sal*10/100;
            break;
            case 'H': aum = sal*10/100;
            default: System.out.println("Categoria incorreta. Conta nao pode ser efetuada."); 
        }
        nov = sal+aum;
        System.out.println("Funcionario(a) "+nome+" categoria "+cat+", tem o novo salario valendo R$ "+nov);    
    }   
}
