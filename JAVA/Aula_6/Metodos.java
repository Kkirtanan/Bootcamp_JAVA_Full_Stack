package Aula_6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Metodos {

      //Metodos são funções em JAVA
    // o public static void main(String[] args) é o método principal sem ele não executa os demais, precisa ter em pelo menos um arquivo da pasta, caso contrario vai apenas compilar o código.
    // Modificadores de acesso:
    //public: qualquer classe pode acessar o mpetodo public e o metodo void
    //private não pode ser acessado por outras classes
    // Static define que o método é membro da classe ou objeto
    // metodo com letra minuscula é um objeto, estância, não usa Static
    // Metodo com letra maiscula é a classe, usa Static
    // VOID representa um método sem retorno
    // MAIN precisa ter essa palavra para que o JAVA encontre o método
    // parâmetros String[] args , como o JAVA é uma linguagem tipada, precisa informar os tipos das variaveis nos argumentos
    // para crirar novos métodos, faz dentro da classe, mas fora do método principal e depois dele
    // tudo criado dentro do metodo principal não precisa colocar static, pois se torna já um objeto static
    
    static double squareRoot(double valor){
      return Math.sqrt(valor);
    }

    static void bemVindo(String nome){
      System.out.println("Bem Vindo(a), "+ nome);
    }

    static void mostrarDataHora(){
      LocalDateTime dataHora = LocalDateTime.now();
      DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
      System.out.println(formatador.format(dataHora));
    }


  public static void main(String[] args) {
    double raiz = squareRoot(121);
    System.out.println(raiz);

    bemVindo("Kely");

    mostrarDataHora();

    //chamar o metodo Computador criado dentro do package Aula_6 no metodo principal
    Computador comp = new Computador();
    comp.ligar();
    comp.executar("Visual Studio Code");

    
  }
}
