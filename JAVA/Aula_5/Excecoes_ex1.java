package Aula_5;

public class Excecoes_ex1 {
  public static void main(String[] args) {
    // para tratar possiveis erros que possam acontecer
    
    int x = 10;
    int y = 0;

    try {
      // código aonde uma exceção pode ocorrer
      int resultado = dividir (x,y); // exemplo de divisao por zero
      System.out.println("Resultado : "+ resultado);
    } catch (ArithmeticException erro) {
      // TODO: handle exception

      System.out.println("Erro: Divisão por zero não permitida");
      erro.printStackTrace();
    }

  }

  //Metodo que lançar exceção, tem que fazer fora da classe principal

    public static int dividir (int a, int b)  throws
    ArithmeticException{
      return a/b;
    }


}
