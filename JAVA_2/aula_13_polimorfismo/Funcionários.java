package aula_13_polimorfismo;

// se não tiver abstract, é uma classe completa
// Funcionário é filha da classe Pessoa
public class Funcionários extends Pessoa{
  
  //construtor

  Funcionários(String nome){
    super(nome); // entender o que é esse super()
  }
}
