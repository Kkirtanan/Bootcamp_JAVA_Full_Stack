package Aula_10_exemplo2;

public class Desenvolvedor {
  // atributos da classe
  String nome;
  String email;
  int anosExp;
  double salario;
  NivelDesenvolvedor nivel;
  boolean estaEmpregado;


  // método construtor
  Desenvolvedor(
    String nome, 
    String email, 
    int anosExp, 
    double salario, 
    NivelDesenvolvedor nivel, 
    boolean estaEmpregado){
      this.nome = nome;
      this.email = email;
      this.anosExp = anosExp;
      this.salario = salario;
      this.nivel = nivel;
      this.estaEmpregado = estaEmpregado;
  }

  // construindo os métodos
  void ganharExp(){
    anosExp++;
  }

  void reajustarNivel(){
    if (anosExp <= 2){
      nivel = NivelDesenvolvedor.junior;
    } else if(anosExp >2 && anosExp <= 5){
      nivel = NivelDesenvolvedor.pleno;
    } else {
      nivel = NivelDesenvolvedor.senior;
    }
  }

  void aumentarSalario(){
    switch(nivel) {
      case junior -> {
        salario += 150; 
      }
      case pleno -> {
        salario += 250;
      }
      case senior -> {
        salario += 500;
      }
    }
  }


}
