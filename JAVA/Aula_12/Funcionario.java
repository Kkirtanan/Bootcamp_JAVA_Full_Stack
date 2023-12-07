package Aula_12;

public class Funcionario {
  
}

//método construtor

public Funcionario(String  nome, String cpf, String telefone, double salario){
  this.nome = nome;
  this.telefone = telefone;
  this.cpf = cpf;
  this.salario = salario;
}

// métodos da classe

public void cumprimentar(){
  System.out.println("Me chamo "+ nome + "e recebeo "+ salario +" reais");
}

public void addBonificacao(double valor){
  if (valor <= 100){
    salario += valor;
  } else {
    System.out.println("Bonificação inválida");
  }

  public double retornarSalario() {
    return salario;
  }
}