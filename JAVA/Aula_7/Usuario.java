package Aula_7;

import java.time.LocalDate;

public class Usuario {
  
  String nome;
  String senha;
  String email;
  LocalDate dataNascimento;
  // para o endereço precisa criar uma nova classa
  Endereco endereco; // associacao entre classes

  // criar um metodo

  void falar(String texto){
  System.out.println(texto);

  // criar um novo metodo

  void apresentar(){
    String texto = "Olá sou "+ nome + " moro em " + endereco.logradouro;
    System.out.println(texto);
  }



  
  }
}
