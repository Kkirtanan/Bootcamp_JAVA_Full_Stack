package Aula_8;

import java.time.LocalDate;

// Orientação Objeto
public class main {
  public static void main(String[] args) {

    // criar variavel para guardar um objeto, coloca o nome da classe, a variavel e fazer a instância, ou seja, criar o objeto. No exemplo abaixo, h1 é apenas um dos milhares de objetos possiveis de serem criados

    Humano h1 = new Humano();
    // atribuir os atributos ao h1

    h1.nome = "Kely";
    h1.sobrenome = "Rodrigues";
    h1.altura = 1.70;
    h1.peso = 72;
    h1.dataNascimento = LocalDate.of(1993, 11, 18);

    // chamar os metodos para o objeto h1

    // h1.seApresentar();
    // h1.mostrarImc();
    // h1.nomeCompleto();
      String nomeComp1 = h1.nomeCompleto();
    // System.out.println("O retorno é :"+" "+ nomeComp1);
      Double calcIMC1 = h1.calcularIMC();
    // System.out.println("O retorno do IMC para h1 é :"+calcIMC1);

    // metodos que alteram atributos, foram definidos na classe Humado e manipulados na main

    System.out.println(h1.peso);
    h1.comer("abacaxi");
    h1.comer("kiwi");
    h1.comer("pizza");
    System.out.println(h1.peso);
    h1.mostrarImc();
    h1.fazerExercicio();
    h1.fazerExercicio();
    h1.fazerExercicio();
    h1.fazerExercicio();
    System.out.println("Peso depois do exercício: "+h1.peso+", IMC após o exercício: "+ calcIMC1);





    
  }
}
