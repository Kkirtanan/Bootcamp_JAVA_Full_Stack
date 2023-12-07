package Aula_9;

public class Livro {

    String titulo;
    String autor;
    String isbn;
    String resumo;
    Integer anopublicacao;
    Integer paginas;

  // atribuição no método construtor

  Livro (String titulo, String autor) {
    // para indicar que a palavra da esquerda se refere ao atributo da classe, colocar this. faz referencia ao escopo global da classe
    this.titulo = titulo;
    this.autor = autor;
  }

  // método construtor que não define os parametros

  Livro(){

  }

  // Pode criar quanto métodos construtores precisar, porém não pode repetir a ordem e tipo dos parâmetros

  Livro(String titulo, Integer anopublicacao){

  }

  Livro(String titulo, String autor, Integer paginas){
    this.titulo = titulo;
    this.autor = autor;
    this.paginas = paginas;
  }

  // forma de evitar que haja repetição de código nos construtores
  Livro(String titulo, String autor, String resumo){
    this(titulo, autor); //faz referencia aos parametros que ja foram citados em outro método, para evitar repetição
    this.resumo = resumo;
  }
 
  // construtor com todos os atributos
  Livro(
    String titulo,
    String autor,
    String isbn,
    String resumo,
    Integer anopublicacao,
    Integer paginas){
      this(titulo, autor, resumo);
      this.paginas = paginas;
      this.isbn = isbn;
      this.anopublicacao = anopublicacao;
    }
}
