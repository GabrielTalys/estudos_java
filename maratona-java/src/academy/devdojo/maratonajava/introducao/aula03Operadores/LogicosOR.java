package academy.devdojo.maratonajava.introducao.aula03Operadores;

public class LogicosOR {
    public static void main(String[] args){
      double valorTotalContaCorrente = 200;
      double valorTotalContaPoupanca = 10000;
      float valorPlaystation = 5000F;
      boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation ||valorTotalContaPoupanca > valorPlaystation;
      System.out.println(isPlaystationCincoCompravel);
      // No caso do Or(|| / OU ) pelo menos uma condição precisa ser verdadeira, só vai ser falso se as duas forem falso, caso contrario vai ser true
    }
}
