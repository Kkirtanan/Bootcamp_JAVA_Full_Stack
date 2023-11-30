

package Aula_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Data {
  public static void main(String[] args) {
    
    // LocalDate, LocalTime para importar as bibliotecas internas do JAVA de data e hora, representam tipo de variavel, pois toda classe representa um tipo de variavel

    LocalDate dataAtual = LocalDate.now(); //é um método que vai retornar a data agora
    System.out.println(dataAtual);

    LocalTime horaAtual = LocalTime.now();
    System.out.println(horaAtual);

    // Formatação da data e hora
    // Data
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    // colocar dentro de uma variavel String a data ou hora foramtada
    String dataFormatada = formatador.format(dataAtual);
    System.out.println(dataFormatada);

    //Hora
    DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("HH:mm:ss");
    String horaFormatada = formatador2.format(horaAtual);
    System.out.println(horaFormatada);

    // biblioteca Date e Time
      LocalDateTime datahoraAtual = LocalDateTime.now();
      System.out.println(datahoraAtual);
    
    // para formatar
    DateTimeFormatter  formatador3 = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
    System.out.println(formatador3.format(datahoraAtual));

    // criar datas representadas por strings
    LocalDate Natal = LocalDate.of(2023, 12, 25);
    System.out.println(formatador.format(Natal));

    LocalTime almoço = LocalTime.of(12, 0, 0);
    System.out.println(formatador2.format(almoço));

    // receber um texto e converter para LocalDate, no formato yyyy/MM/dd
    LocalDate anoNovo = LocalDate.parse("2024-01-01");
    System.out.println(formatador.format(anoNovo));

    LocalTime meiaNoite = LocalTime.parse("00:00:00");
    System.out.println(formatador2.format(meiaNoite));

    // Operação com datetime 

    // somar horas, minutos e segundos, atribui um novo valor a variavel
    meiaNoite = meiaNoite.plusHours(2);
    meiaNoite = meiaNoite.plusMinutes(45);
    meiaNoite = meiaNoite.plusSeconds(22);
    System.out.println(formatador2.format(meiaNoite));

    Natal = Natal.plusDays(6);
    Natal = Natal.plusMonths(2);
    Natal = Natal.plusYears(3);
    System.out.println(formatador.format(Natal));

    //subtração
    Natal = Natal.minusDays(28);
    System.out.println(formatador.format(Natal));

    // obter dados de data e hora
    LocalDate  dayOfchildren = LocalDate.parse("2024-10-12");
    LocalTime timeOfwork = LocalTime.of(9, 0, 0);
    System.out.println("Mês : "+ dayOfchildren.getMonthValue());
    System.out.println("Dia : "+ dayOfchildren.getDayOfMonth());
    System.out.println("Horas : "+ timeOfwork.getHour());


    LocalDate data1 = LocalDate.of(2023, 12, 7);
    LocalDate data2 = data1.plusDays(9);
    System.out.println(formatador.format(data1));
    System.out.println(formatador.format(data2));


    //Comparação entre datatime com flag booleana
    boolean flagAfter = data1.isAfter(data2);
    System.out.println(flagAfter);
    boolean flagBefore = data1.isBefore(data2);
    System.out.println(flagBefore);
    boolean flagEqual = data1.isEqual(data2);
    System.out.println(flagEqual);

    

  }
}