package Aula_8_atividade;

public class Main {
  public static void main(String[] args) {
    
    Veiculo v1 = new Veiculo();
    v1.ligado = true;
    v1.ano = 2023;
    v1.marca = "Fiat";
    v1.kmRodados = 0.0;
    v1.consumo = 20.0;
    v1.tanqueAtual = 90.0;
    v1.ligar();

    Double gastoCombustivel = v1.viajar(100.0);

    

    
  }
}
