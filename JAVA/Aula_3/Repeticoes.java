
package aula_3;

import java.util.Scanner;

// todo arquivo java precisa ter a class com o nome do arquivo
public class Repeticoes {
// digitar o método principal para rodar um código em JAVA
public static void main(String[] args) {
  System.out.println("Estudando repetições");

  //for
  for (int i = 0; i<10; i++) {
    System.out.println("O valor de  é: " +i);
  }

  //while
  // para chamar a bibiloteca Scanner
  Scanner teclado = new Scanner(System.in);
  System.out.println("Digite um número (while) ");
  int num = teclado.nextInt();
  while (num <= 0) {
    num = teclado.nextInt();
  }

  //do while
  do {
    System.out.println("Digite um número (do while) ");
    num = teclado.nextInt();
  } while (num <=0);

}
}

