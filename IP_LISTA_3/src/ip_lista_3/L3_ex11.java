
package ip_lista_3;

import java.util.Scanner;

public class L3_ex11 {
    public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
        int h, m, s, t, h1, m1, s1;
   	System.out.println("Digite o valor das horas");
        h = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor dos minutos");
        m = Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor dos segundos");
        s = Integer.parseInt(input.nextLine());
        t = h*3600+m*60+s+1;
        h1=t/3600;
        m1=(t%3600)/60;
        s1=(t%3600)%60;        
        System.out.println("Novo horario: "+h1+"h:"+m1+"min:"+s1+"s");
    }   
}


    

