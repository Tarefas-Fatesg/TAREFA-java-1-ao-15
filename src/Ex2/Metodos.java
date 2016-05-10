/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ex2;

/**
 *
 * @author João Paulo Santos Almeida.
 */
public class Metodos {
    public static int funcaoE01(int n){
        int soma = 0;
        
        for(int i = 0 ; i <= n; i++){
            soma = soma + i;
        }
        return soma;
    }
    public static int funcaoE02(int n){
        int mult = 1;
        
        for(int i = 1 ; i <= n; i++){
            mult *= i;
        }
        return mult;
    }
    public static int funcaoE03(int n){
        int cubo = 0;
        
        for(int i = 1 ; i <= n; i++){
            cubo += (i*i*i);
        }
        return cubo;
    }
    public static int funcaoE04(int n,int k){
    int temp = k;
        
        for(int i =n-1;i<=n; i++){
           k*= temp;
        }
        return k;
    
    
    }
    public static int funcaoE05(int n){
     
       int atual=1;
       int ant=1;
       for (int j =3; j <= n; j++) {
           int temp = atual; 
           atual+=ant;
           ant = temp;
        }
    return atual;
}

      public static int funcaoE06(int n,int k){
    int temp;
    
          for (int i = 1; i < k; i++) {
              n+=k;
          }
    return n;
    }

      public static int funcaoE07(int n){
    int temp=0;
    System.out.print(temp+" ");
          for (int i = 0; i < n; i++) {
              temp++;
              System.out.print(temp+" ");
              
          }
    return temp;
    }
      
      public static int funcaoE08(int n){
    int temp=n;
    System.out.print(temp+" ");
          for (int i = 0; i < n; i++) {
              temp--;
              System.out.print(temp+" ");
              
          }
    return temp;
    }
 public static int funcaoE09(int n){
   int temp=0;
    
          for (int i = 0; i <= n; i++) {
              if(temp%2==0){
              System.out.print(temp+" ");
              temp++;
              }else{
              temp++;
          }
   
              
}
return temp;
}

 public static int funcaoE10(int n){
   int temp=n;
    
          for (int i = 0; i <= n; i++) {
              if(temp%2==0){
              System.out.print(temp+" ");
              temp--;
              }else{
              temp--;
          }
   
              
}
return n;
}
    
}
