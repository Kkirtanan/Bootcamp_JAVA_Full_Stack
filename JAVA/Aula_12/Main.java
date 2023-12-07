package Aula_12;

// Encapsulamento
// ato de ocultar parte do código para garantir que uma informação não será maniupulada por quem não deve, como o atributo salario
// existem métodos padrão para encapsulamento
public class Main {
  public static void main(String[] args) {
    // criar um objeto da classe Funcionário

    // Funcionario f1 = new Funcionario("Kely","000.000.000-00","(11)99999-9999",4500);
    // f1.cumprimentar();
    // double salarioAtual = f1.retornarSalario();
    // f1.addBonificacao(salarioAtual*0.01);
    // f1.cumprimentar();
     

    Celular c1 = new Celular("+119999", 8, "123456");
    System.out.println(c1.getNumero());
    System.out.println(c1.getMemoriaRam());

    c1.setNumero("123456");
    c1.setSenha("12315464");
    System.out.println(c1.getNumero());

    
  }
}
