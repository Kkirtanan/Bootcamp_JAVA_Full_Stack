import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = teclado.nextInt();
        
        System.out.println("Digite outro número: ");
        int n2 = teclado.nextInt();

        int soma = n1 + n2;

        System.out.println("O resultado da soma de " + n1 + " + " + n2 + " é = " + soma);
   }
}


