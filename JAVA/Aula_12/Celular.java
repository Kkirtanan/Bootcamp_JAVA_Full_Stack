package Aula_12;

public class Celular {
  private String numero;
  private int memoriaRam;
  private String senha;

// criar um construtor publico

  public Celular(String numero, int memoriaRam, String senha){
    this.numero = numero;
    this.memoriaRam = memoriaRam;
    this.senha = senha;
  }
}

// Convenção de métodos para leitura de atributos privados

// Getter

public String getNumero(){
  return numero;
}

public int getMemoriaRam(){
  return memoriaRam;
}

// Setter = permite alteração do atributo

public void setNumero(String novoNumero){
  numero = novoNumero;
}

public void setSenha(String novaSenha){
  if (novaSenha.length()>= 8 && !novaSenha.equals(senha)) {
    senha = novaSenha;
    System.out.println("Senha alterada com sucesso");
  }
}

