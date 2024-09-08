import execercicio1.*;
import execercicio2.ExistenciaLetraA;
public class Main {
    public static void main(String[] args) throws Exception {
     Fibonacci.fibonacci();

   String texto = "exemplo teste de contador de letras  'a'.";

 
   int quantidade = ExistenciaLetraA.contarLetraA(texto);

   
   if (quantidade > 0) {
       System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + quantidade + " vez(es) no texto.");
   } else {
       System.out.println("A letra 'a' (maiúscula ou minúscula) não aparece no texto.");
   }
   
    }
}
