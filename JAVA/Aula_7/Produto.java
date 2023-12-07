package Aula_7;


public class Produto {
  public static void main(String[] args) {
    
    // Produto é classe, panela e lampada são objetos

    Produto lampada = new Produto(); // instanciar
    lampada.codigo = "123456789";
    lampada.descricao = "Super lampada 1200w";
    lampada.nome = "Super Lampada";
    lampada.preco = 10;
    lampada.disponibilidade = true;


    Produto panela = new Produto();
    panela.codigo = "0345978164";
    panela.descricao = "Panela tramontina 3L";
    panela.preco = 150.0;
    panela.disponibilidade = false;


    System.out.println(lampada.nome);
    System.out.println(panela.nome);

    double total = lampada.preco + panela.preco;
    System.out.println("Total: " + total);


  }
}