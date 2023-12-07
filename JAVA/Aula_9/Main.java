package Aula_9;

public class Main {
  public static void main(String[] args) {
    
  Livro cleanCode = new Livro("Clean Code","Robert C. Martin");
  // cleanCode.titulo = "Clean Code";
  // cleanCode.autor = "Robert C. Martin";
  cleanCode.resumo = "Código limpo";
  cleanCode.isbn = "132467975441";
  System.out.println(cleanCode.titulo);
  System.out.println(cleanCode.autor);
  // toda classe possuim um método construtor implicito, isso é um conceito da OO, Livro(); é o método construtor nesse caso, ele sempre é chamado no momento do instânciamento

  // new Livro(); método construtor implicito, a forma escrita desse método é
  // Livro () {

  // }

  // pode colocar os atributos, atribuições, dentro desse metodo construtor, faz na classe.

  Livro vidasSecas = new Livro("Vidas Secas","Graciliano Ramos");
  System.out.println(vidasSecas.titulo);
  System.out.println(vidasSecas.autor);

  
  Livro iracema = new Livro("Iracema", "José de Alencar");
  System.out.println(iracema.titulo);
  System.out.println(iracema.autor);

  // exemplo se os atributos serão incluidos depois da criação do método, precisa fazer um outro método construtor sem parametros na classe

  Livro harryPotter = new Livro();
  harryPotter.titulo = "Harry Potter";
  System.out.println(harryPotter.titulo);


// criar objeto com o construtor master

  Livro fundamentosJava = new Livro(
    "JAVA para iniciantes",
    "Herbert Schildt",
    "123456465",
    "sobre JAVA",
    "2010",
    "300"
  );
  System.out.println(fundamentosJava);


// Referência de objetos

Livro teste1 = new Livro("Teste", "Autor Teste");
Livro teste2 = teste1; // nesse caso por estarmos trabalhando com objetos
  }
}
