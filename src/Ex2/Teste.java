/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex2;

import Ex2.Metodos;
import java.util.Scanner;

/**
 *
 * @author João Paulo Santos Almeida.
 */
public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Digite um número inteiro:");
        num = entrada.nextInt();
        System.out.println("Somatorio de 1 ate "+num+" e:"+Metodos.funcaoE01(num));
        System.out.println("mult de 1 ate "+num+" e:"+Metodos.funcaoE02(num));
        System.out.println("cubo de 1 ate "+num+" e:"+Metodos.funcaoE03(num));
       int num2;
       System.out.println("Digite um número inteiro:");
       num2 = entrada.nextInt();
        System.out.println("numero "+num+" sobre "+num2+" e "+Metodos.funcaoE04(num,num2));
        System.out.println("o n-esimo do "+num+" e:"+Metodos.funcaoE05(num));
        System.out.println("a multiplicaçao de "+num+" vezes "+num2+" sera: "+Metodos.funcaoE06(num,num2));
        System.out.println("e a somatoria de 0 ate "+Metodos.funcaoE07(num));
        System.out.println("e a somatoria de "+num+" ate "+Metodos.funcaoE08(num));
        System.out.println("sao os pares ate "+(Metodos.funcaoE09(num)-1));
        System.out.println("sao os pares ate "+Metodos.funcaoE10(num));  
    }
}
