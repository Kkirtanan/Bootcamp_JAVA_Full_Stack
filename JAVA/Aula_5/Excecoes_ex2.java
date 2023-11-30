package Aula_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes_ex2 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    try{
    System.out.println("Digite dois números para calcular média: ");
    System.out.println("Número 1 : ");
    double n1 = entrada.nextDouble();
    System.out.println("Número 2 : ");
    double n2 = entrada.nextDouble();
    double media = (n1+n2)/2;
    System.out.println("A média dos números é: "+media);
    } catch(InputMismatchException e){
      System.out.println("Por favor, insira valores numéricos válidos.");
   } finally{
      entrada.close();
   }

  }
}
