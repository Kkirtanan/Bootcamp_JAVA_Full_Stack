package Aula_10_exemplo2;

public class Main {
  public static void main(String[] args) {
    
    // instanciar Desenvolvedor, criar objeto deb1
    Desenvolvedor dev1 = new Desenvolvedor("kely Rodrigues", "kelysr18@", 1, 3000, NivelDesenvolvedor.junior, false);

    // utilizar o método reajustarNivel

    dev1.ganharExp();
    dev1.ganharExp();
    dev1.ganharExp();
    dev1.reajustarNivel();
    dev1.aumentarSalario();
    System.out.println("O nível do dev1: "+dev1.nivel);
    System.out.println("O salário do dev1: "+dev1.salario);





  }
}
