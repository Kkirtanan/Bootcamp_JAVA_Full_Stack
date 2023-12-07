package Aula_10_calculadora;

public class Main {
  public static void main(String[] args) {
    
    Calculadora calc = new Calculadora();
    double resultado1 = calc.calcular(10, 5, OperacaoCalculadora.multiplicar);
    double resultado2 = calc.calcular(10, 5, OperacaoCalculadora.subtrair);

    System.out.println("Resultado1: "+resultado1);
    System.out.println("Resultado2: "+resultado2);



  }


}
