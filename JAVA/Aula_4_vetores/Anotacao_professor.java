package Aula_4_vetores;

public class Anotacao_professor {
  public static void main(String[] args) {
    // Vetores e ArrayList
    // Declarando um vetor em Java
    // int[] meuVetor = new int[4];
    // meuVetor[0] = 10;
    // meuVetor[2] = 5;

    int [] meuVetor = {10,20,30,40,50};
    // Imprime todos os elementos de um vetor
    System.out.println("Vetor Original:");
    for(int elemento : meuVetor){
       System.out.println(elemento);
    }
    int novoElemento1 = 60;
    int novoElemento2 = 70;
    // Cria um novo vetor com tamanho maior
    // meuVetor = Arrays.copyOf(meuVetor, meuVetor.length + 2);
    int novoTamanho = meuVetor.length + 2;
    int[] novoVetor = new int[novoTamanho];

    // Copia os elementos do vetor orignal para o novo
    for (int i = 0; i < meuVetor.length; i++){
       novoVetor[i] = meuVetor[i];
    }
    // Adicionar os novos elementos no final do vetor
    // meuVetor[meuVetor.length - 2] = novoElemento1;
    // meuVetor[meuVetor.length - 1] = novoElemento2;
    novoVetor[novoTamanho - 2] = novoElemento1;
    novoVetor[novoTamanho - 1] = novoElemento2;
    // Imprime todos os elementos do novo vetor
    System.out.println("Vetor com novos elementos:");
    for(int elemento : novoVetor){
       System.out.println(elemento);
    }
    
      
    
    // for (int i = 0; i < meuVetor.length; i++){
    //    System.out.println("Elemento " + i + ": " + meuVetor[i]);
    // }

 }
}
