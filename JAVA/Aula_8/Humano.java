package Aula_8;

import java.time.LocalDate;

// atributos são variaveis, podem ser chamados atributos de classe

public class Humano {
  String nome;
  String sobrenome;
  LocalDate dataNascimento;
  double altura;
  double peso;

  // criar um metodo para a classe

  void seApresentar(){
    System.out.println("Olá me chamo: "+nome+" "+sobrenome);
  }

  void mostrarImc(){
    // peso/altura^2
    double imc = peso/(altura*altura);
    System.out.println("Meu IMC é: "+ imc);

  }

  // criar um método com retorno, para que a informação possa ser utilizada, o retorno precisa ser guardado em uma variavel na main
  String nomeCompleto(){
    return nome+" "+sobrenome;
  }

  // criar um metodo que retorna o IMC
  Double calcularIMC(){
    return peso/(altura*altura);
  }

  void fazerExercicio(){
    System.out.println("Estou me exercitando");
    peso -= 0.5;
  }

  void comer(String comida){
    System.out.println("Estou comendo "+comida);
    peso+= 0.5;
  }

}
