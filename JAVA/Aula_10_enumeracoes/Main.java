package Aula_10_enumeracoes;

public class Main {
  public static void main(String[] args) {

    //Enumerações são um conjunto limitado de dados, torna o códgio mais confiável, é um recurso do JAVA

    // chamar a enumeração criada

    Turno turnoCurso = Turno.manha;

    // aplicar enum com SWITCH

    switch (Nivel) {
      case junior -> { 
        System.out.println("Seu nível atual é Junior");
      }
      case pleno -> {      
        System.out.println("Seu nível atual é Pleno");
      }
      case senior -> {     
        System.out.println("Seu nível atual é Senior");
      }

    }


  }
}
