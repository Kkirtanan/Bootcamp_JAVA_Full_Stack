package Aula_8_atividade;

public class Veiculo {

  //atributos

  Boolean ligado;
  Integer ano;
  String marca;
  Double kmRodados;
  Double consumo; // KM/l
  Double tanqueAtual; // l

  // métodos

  void ligar(){
    if (ligado == true){
      System.out.println("Ligado");
    } else{
      System.out.println("Desligado");
    }
  
  Double viajar(Double distancia){
    kmRodados += distancia;
    if (kmRodados <= tanqueAtual*consumo){
      return kmRodados/consumo;
    }else{
        System.out.println("Viagem deve ser menor do que "+ tanqueAtual*consumo);
    }
  }
  
  Double revisao(){
    return consumo *= 0.10;
  }
  


  }
}
