package Aula_5;

import java.util.Scanner;

public class Excecoes_ex3 {
  public static void main(String[] args) {
    Scanner x = new Scanner(System.in);
    String usuario, senha;
    boolean credenciaisValidas = false;

    while (!credenciaisValidas) {
      try {
        System.out.println("Digite um nome de usuário: ");
        usuario = x.nextLine();
        System.out.println("Digite uma senha: ");
        senha = x.nextLine();

        if(usuario.equals(senha)) {
          throw new Exception("Usuário e senha não podem ser iguais");
        }
        credenciaisValidas = true;
      } catch (Exception e){
          System.out.println(e.getMessage());
      }
    }
    System.out.println("Cadastro realizado com sucesso");
    x.close();
  }
}
