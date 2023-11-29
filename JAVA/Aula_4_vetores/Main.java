package Aula_4_vetores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //     // Vetor com valores definidos
    // int[] meuVetor = {1, 2, 3, 4, 5};

    // // Imprime todos os elementos de um vetor
    // System.out.println("Vetor Original:");
    // for (int elemento : meuVetor) {
    //   System.out.println("Elemento: " + elemento);
    // }

    // int novoElemento1 = 60;
    // int novoElemento2 = 70;

    // // Cria um novo vetor com tamanho maior
    // meuVetor = Arrays.copyOf(meuVetor, meuVetor.length + 2);

    // // Adicionar os novos elementos no final do vetor
    // meuVetor[meuVetor.length - 2] = novoElemento1;
    // meuVetor[meuVetor.length - 1] = novoElemento2;

    // // Imprime todos os elementos do novo vetor
    // System.out.println("Vetor com novos elementos:");
    // for (int elemento : meuVetor) {
    //   System.out.println("Elemento: " + elemento);
    // }


      // Criando um ArrayList de Strings

      ArrayList<String> minhaLista = new ArrayList<String>();
      // Adicionando elementos
      minhaLista.add("Alberto");
      minhaLista.add("Douglas");
      minhaLista.add("Nelson");
      // Acessando elementos
      // String nome = minhaLista.get(0);
      // System.out.println("Elementos na Lista");
      // for (String elemento : minhaLista){
      //    System.out.println(elemento);
      // }

      // // Removendo elementos de uma lista
      // minhaLista.remove(0);

      //       System.out.println("Elementos na Lista");
      // for (String elemento : minhaLista){
      //    System.out.println(elemento);
      // }


      //Varrer a lista para buscar um elemento sem saber a posição

      // verificar se na lista contem um elemento

      String palavraParaRemover = "Douglas";

      if (minhaLista.contains(palavraParaRemover)) {
        minhaLista.remove(palavraParaRemover);
        System.out.println("Elemento removido: "+ palavraParaRemover);
      } else {
        System.out.println("A palavra não está presente na lista");
      }

      System.out.println("Elementos na lista após a remoção");
      for (String elemento : minhaLista){
         System.out.println(elemento);
      }


      String novoElemento = "Jonatas";
      // Verificar se o elemento já existe na lista
      if(!minhaLista.contains(novoElemento)){
         minhaLista.add(novoElemento);
         System.out.println("Elemento Adicionado: "+ novoElemento);
      }else{
         System.out.println("Elemento já está presente na Lista.");
      }
         System.out.println("Elementos na lista após a inclusão");
      for (String elemento : minhaLista){
         System.out.println(elemento);
      }

      //Trocar elementos na lista
      String itemParaLocalizar = "Jonatas";
      String novoItem = "Kely";

      // Verificar se o item esta presente na lista
      int indice = minhaLista.indexOf(itemParaLocalizar);

      if (indice != -1){
         minhaLista.set(indice, novoItem);
         System.out.println("Ítem Substituído: "+ itemParaLocalizar + " Por: " + novoItem) ;
      }else{
         System.out.println("Item não encontrado na lista.");
      }
      System.out.println("Elementos na Lista após Substituição.");
      for (String elemento : minhaLista){
         System.out.println(elemento);
        }



        //Ordenar os elementos em ordem alfabetica

        Collections.sort(minhaLista);

        //Ordenas os elementos em ordem contraria ao alfabetico
        Collections.sort(minhaLista, Collections.reverseOrder());

        System.out.println("Elementos na Lista após inversão.");
        for (String elemento : minhaLista){
         System.out.println(elemento);
        }


  }
}
