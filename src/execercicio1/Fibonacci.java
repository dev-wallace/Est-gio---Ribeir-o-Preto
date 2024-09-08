
package execercicio1;
import java.util.*;

public class Fibonacci {

    public static int fibonacci(){
        System.out.println("INFORME UM NUMERO PARA VERIFICACAO ");
        Scanner sc = new Scanner(System.in);
        
        int chute = sc.nextInt();

        int primeiro = 0;
      int anterior = 1;
      
        
        
          for(int i = 0;i<=15;i++){
             int proximo = primeiro+anterior;
               
                primeiro=anterior;
                anterior=proximo;

                if(chute== anterior){
                    System.out.println("numero contido na serie de fibonacci");
                }
              
            
                
    }
    

  
    return chute;
}
}