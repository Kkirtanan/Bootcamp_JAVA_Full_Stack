package aula_13_polimorfismo;

// classe pessoa seria uma abstração, colocar "abstract" antes do class, é uma classe auxiliar que compartilha caracteristicas em comum entre as classes completas do projeto, classe completa é aquela que gera objeto

public abstract class Pessoa {
  private String nome;
  

  // método construtor

  Pessoa (){

  }

  // métodos get e set

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }


}
