package Aula_2;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
// Operadores, são os mesmos do JS, mesma sintaxe
        /*
         * '+' : Adição
         * '-' : Subtração
         * '*' : Multiplicação
         * '/' : Divisão
         * '%' : Módulo (Resto da divisão)
         */
  
        // Operadores de Atribuição

        /*
         * =    : Atribuição Simples
         * +=   : Soma e atribuição
         * -=   : Subtração e atribuição
         * *=   : Multiplicação e atribuição
         * /=   : Divisão e atribuição
         * %=   : Módulo e atribuição
         */
        // int x = 7;
        // x += 3; //Equivalente x = x + 3; resultado: x=10
        // x -= 2;
        // x *= 2;

        // Operadores de Comparação
        /*
         * ==   : igual a
         * !=   : diferente
         * >    : maior
         * <    : menor
         * >=   : maior ou igual a
         * <=   : menor ou igual a 
        */

        // int m = 5;
        // int n = 10;
        // boolean igual = (m == n); // False
        // boolean diferente = (m != n); // True
        // boolean maiorQue = (m > n); // false
        // boolean menorQue = (m < n); // true

        // OPERADORES LÓGICOS
        /*
            * &&    : E lógico (AND)
            * ||    : OU lógico (OR)
            * !     : NEGAÇÃO lógica (NOT) 
        */

        // boolean p = true;
        // boolean q = false;

        // boolean resultadoAND = p && q; // false
        // boolean resultadoOR = p || q; //true
        // boolean resultadoNOTp = !p; // false

  //       int a = 10;
  //       int b = 3;
  //       int soma = a + b;
  //       int subtracao = a - b;
  //       int multiplicacao = a * b;

  // // Operadores Bitwhise (bit a bit)
  //     // & AND bitwise
  //     // ! OR  bitwise
  //     // ^ XOR bitwise (OU exclusivo)
  //     // ~ complemento bitwise


  // int modulo = a % b; // resto da divisão
  // double divisao = (double) a/b;   //conversão automática do resultado da divisão para double
  // System.out.println("A sintaxe de módulo é:" + modulo);
  // System.out.println("A sintaxe de divisão é:" + divisao);

  

  // int n1 = 5; // representação binaria 0101
  // int n2 = 3; // representação binaria 0011
  // int resultadoAND = n1 & n2;
  // int resultadoOR = n1 | n2;
  // int resultadoXOR = n1 ^ n2;
  // int resultadoNOT = ~n1;


  //       // DecimalFormat df = new DecimalFormat("#.######");
  //       System.out.println("A soma é: " + soma);
  //       System.out.println("A divisão é: " + divisao);
        



  // Estruturas de seleção e condição

    // ESTRUTURAS CONDICIONAIS
    // CONDICIONAIS SIMPLES
    //     int numero = 10;
    //     if (numero > 0){
    //         System.out.println("O número é positivo.");
    //     }

    // // CONDICIONAIS COMPOSTA
    //     int x = -5;
    //     if(x > 0){
    //         System.out.println("O número é positivo.");
    //     } else{
    //         System.out.println("O número não é positivo.");
    //     }

    // // CONDICIONAIS ENCADEADAS
    //     int y = 0;
    //      if(y > 0){
    //         System.out.println("O número é positivo");
    //     } else if (y < 0){
    //         System.out.println("O número é negativo");
    //     }else{
    //         System.out.println("O número é zero.");
    //     }  

  int dia = 5;
  String nomedoDia;

  switch (nomedoDia) {
    case 1:
      nomedoDia = "Domingo"
      break;
      case 2:
      nomedoDia = "Segunda-feira"
      break;
      case 3:
      nomedoDia = "Terça-feira"
      break;

    System.out.printf("Hoje é :%s\n", nomedoDia);
  }

//   // import java.text.MessageFormat;
// String mensagem = MessageFormat.format("Hoje é: {0}", nomeDoDia);
// System.out.println(mensagem);

// String msg = String.format("Hoje é: %s", nomeDoDia)

    }
}
