package aula_12_heranca;


// fazer herança da classe animal
public class Ave extends Animal {
//Ave - subclasse ou filho
//Animal - superclasse ou pai
// copia todos os atributos e metodos da classe Animal
// colocar atributos especificos da classe Ave

private float envergaduraAsa;
private float mediaPesoOvo;

// como há encapsulamento nos atributos, não é possível alterar os atributos

// para modificar as propriedades da classe usar os metodos acessores get e set

  Ave(){
setEspecie("Ave");
setVertebrado(true);
setSimetrico(true);
  }

// métodos especificos da classe
public float getEnvergaduraAsa() {
  return envergaduraAsa;
}

public void setEnvergaduraAsa(float envergaduraAsa) {
  this.envergaduraAsa = envergaduraAsa;
}

public float getMediaPesoOvo() {
  return mediaPesoOvo;
}

public void setMediaPesoOvo(float mediaPesoOvo) {
  this.mediaPesoOvo = mediaPesoOvo;
}

//sobrescrever o método emitirSom criado na classe pai

public void emitirSom(){
  System.out.println("cococococo");
}



}
