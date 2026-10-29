package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;
/*
Prática
Estacionamento. Crie variáveis com os dados abaixo:
placa: ABC1D23, tipo do veículo: 'C' (char: 'C' = carro, 'M' = moto), minutos estacionado: 200 (int),
dia da semana: 7 (int: 1 = domingo ... 7 = sábado), é mensalista: false

Regras de cobrança:
1. Converta os minutos em horas cheias com /, qualquer minuto que sobrar conta como mais uma hora (use % e ++)
   Exemplo: 200 min = 3h e sobram 20 min, então são cobradas 4 horas
2. A primeira hora custa R$ 8,00 e cada hora adicional custa R$ 5,00
3. Moto paga metade do valor
4. No fim de semana (domingo ou sábado) o valor fica 20% mais caro
5. O valor máximo é R$ 40,00 (diária)
6. Mensalista não paga nada
7. Se ficou até 15 minutos também não paga (tolerância)

Imprima:
Placa: <placa> | Tempo: <minutos> min | Horas cobradas: <horas>
Valor a pagar: R$ <valor>
e, se for o caso, "Isento (mensalista)" ou "Isento (tolerância)"
 */
public class ExEstacionamento {
    public static void main (String[] args){
        String placa  = "ABC1D23";
        char tipoDoVeiculo = 'C';
        int minutosEstacionado = 200;
        int diaDaSemana = 7;
        boolean mensalista = false;
        int horasCobradas = minutosEstacionado / 60;

        if (minutosEstacionado % 60 > 0 ){
            horasCobradas++;
        }
        double valor = 8 + (horasCobradas - 1) * 5;
        if (tipoDoVeiculo == 'M'){
            valor = 4 + (horasCobradas - 1) * 2.5;
        }
        if (diaDaSemana == 1 || diaDaSemana == 7){
            valor = valor + valor*0.2;
        }
        if (valor >40){
            valor =40;
        }
        if (mensalista == true){
            valor = 0;
        }
        if (minutosEstacionado <=15){
            valor = 0;
        }
        System.out.println("Placa: " + placa + " | Tempo: " + minutosEstacionado + " min | Horas cobradas: " + horasCobradas);
        System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
        if (mensalista == true){
            System.out.println("Mensalista!");
        }
        if (minutosEstacionado <= 15){
            System.out.println("Insento!");
        }
    }
}
