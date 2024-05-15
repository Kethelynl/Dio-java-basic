public class Operadores {
    
    public static void main(String[] args) {
        //int numero = 5;

        //System.out.println( - numero);
        //-------------------------------------
        //int numero = 5;
        //X repetição
        //numero++; // é igua a numero + 1

        //System.out.println(numero); // == 6

        //System.out.println(-- numero); // ele tira um valor

        //boolean variavel = true;
        //System.out.println(!variavel); //muda o valor 
        //---------------------------------------------------
        //int a, b;

       // a = 4;
        //b = 6;

       // String resultado = ' ';

       // if(a==b)
      //  resultado = "verdadeiro";
       // else
      //  resultado = "falso";

      //uma forma mais simples de resolver o problema acima

      /* String resultado = a == b ? "verdadeiro : "Falso; */
      
      
      /* && = E
       * || = OU
       * 
       */

       boolean condicao1 = true;
       boolean condicao2 = true;

       if(condicao1 && condicao2){
        System.out.println("as duas são verdadeiras");
       }

       if(condicao1 || condicao2){
        System.out.println("uma das condiçoes verdadeira");
       }

    
    }
}
