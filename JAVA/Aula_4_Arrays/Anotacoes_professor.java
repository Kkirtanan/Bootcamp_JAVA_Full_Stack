import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


package Aula_4_Arrays;

public class Anotacoes_professor {
  public static void main(String[] args) {
     // Criando um ArrayList de Strings

     ArrayList<String> minhaLista = new ArrayList<String>();
     // Adicionando elementos
     minhaLista.add("Alberto");
     minhaLista.add("Douglas");
     minhaLista.add("Nelson");
       // Removendo elementos de uma lista
     // minhaLista.remove(0);
     // Acessando elementos
     // String nome = minhaLista.get(0);
     System.out.println("Elementos na Lista");
     for (String elemento : minhaLista){
        System.out.println(elemento);
     }

     String palavraParaRemover = "Douglas";

     // Verificar se existe a palavra na lista
     if(minhaLista.contains(palavraParaRemover)){
        minhaLista.remove(palavraParaRemover);
        System.out.println("Elemento Removido: "+ palavraParaRemover);
     }else{
        System.out.println("A palavra não está presente nao Lista.");
     }
     
     System.out.println("Elementos na Lista após Remoção.");
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
     String itemParaLocalizar = "Jonatas";
     String novoItem = "Kely";
     // Verificar se o item esta presente na lista
     int indice = minhaLista.indexOf(itemParaLocalizar);
     // indice = 3
     if (indice != -1){
        minhaLista.set(indice, novoItem);
        System.out.println("Ítem Substituído: "+ itemParaLocalizar + " Por: " + novoItem) ;
     }else{
        System.out.println("Item não encontrado na lista.");
     }

     // Ordenar os elementos de uma lista em ordem alfabética
     Collections.sort(minhaLista);
     // Ordernar os elementos em ordem reversa
     Collections.sort(minhaLista, Collections.reverseOrder());

     System.out.println("Elementos na Lista após Substituição.");
     for (String elemento : minhaLista){
        System.out.println(elemento);
     }
  }
}
