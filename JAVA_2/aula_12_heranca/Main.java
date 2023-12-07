package aula_12_heranca;


  // o conceito de herança diz que uma classe pode herdar caracteristicas e ações de outras classes, que serão os atributos e métodos


public class Main {
  
  public static void main(String[] args) {
    
    //criar objeto na classe principal

    Animal aguia = new Animal();
    aguia.setNome("Águia");
    aguia.setEspectativaVida(12);
    aguia.setEspecie("Ave");
    aguia.setHabitat("montanhas");
    aguia.setSimetrico(true);
    aguia.setVertebrado(true);

    System.out.println(aguia.getNome());

    Ave galinha = new Ave();
    galinha.setNome("Galinha");
    galinha.setHabitat("planicíe");
    galinha.setEspectativaVida(5);
    
    System.out.println(galinha.getNome());
    System.out.println(galinha.getEspecie());
    System.out.println(galinha.getEnvergaduraAsa());



  }
}
