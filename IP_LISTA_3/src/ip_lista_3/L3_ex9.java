
package ip_lista_3;

import java.util.Scanner;

public class L3_ex9 {
    public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
   	double saldo, res, valor;
        int op;
   	 
        System.out.println("Digite o seu numero");
        Double.valueOf(input.nextLine());
        System.out.println("Digite o saldo atual");
        saldo = Double.parseDouble(input.nextLine());
        System.out.println("Digite o tipo de operacao a ser realizada");
        System.out.println("1 - Deposito");
        System.out.println("2 - Saque");
        op = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor da operacao.");
        valor = Double.parseDouble(input.nextLine());
        res = saldo;
        
        switch(op){
            case 1: res = saldo+valor;
            break;
            case 2: res = saldo-valor;
            break;
            default: System.out.println("Numero incorreto para operacao");   
        }
        if(res>=0){
            System.out.println("Novo saldo: "+res);
        }
        else{
            System.out.println("Conta estourada");
            System.out.println("Novo saldo: "+res);
        }        
    }    
}
