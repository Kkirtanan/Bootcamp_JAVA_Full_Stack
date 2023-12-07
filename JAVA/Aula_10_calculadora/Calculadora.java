package Aula_10_calculadora;

public class Calculadora {
  double calcular(double a, double b, OperacaoCalculadora op) {

    switch (op){
      case somar -> {
        return a+b;
      }
      case subtrair -> {
        return a-b;
      }
      case multiplicar -> {
        return a*b;
      }
      case dividir -> {
        return a/b;
      }
      default -> {
        System.out.println("Operação inválida");
        return 0; // precisa colocar algum retorno no deault para não dar erro, mesmo que o código nunca passe por essa parte
      }
    }

  }

}
