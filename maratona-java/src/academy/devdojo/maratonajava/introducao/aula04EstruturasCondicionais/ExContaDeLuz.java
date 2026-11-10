package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;

public class ExContaDeLuz {
    public static void main(String[] args) {
        String nome = "Mariana";
        int consumoKwh = 180;
        char bandeira = 'A';
        boolean tarifaSocial = false;
        int diasDeAtraso = 3;
        double consumo = 0;
        int faixa = 0;

        if (consumoKwh <= 100) {
            consumo = consumoKwh * 0.5;
            faixa = 1;
        } else if (consumoKwh <= 200) {
            consumo = consumoKwh * 0.7;
            faixa = 2;
        } else {
            consumo = consumoKwh * 0.9;
            faixa = 3;
        }

        if (bandeira == 'V'){
            // sem acréscimo
        }
        else if (bandeira == 'A'){
            consumo +=5;
        }
        else if (bandeira == 'R') {
            consumo +=10;
        }
        else{
            System.out.println("Bandeira Inválida");
        }

        if (tarifaSocial) {
            consumo *=0.6;
        }

        if(diasDeAtraso >0){
            consumo *= 1.02;
            System.out.println("Pagamento em atraso: multa de 2% aplicada.");
        }

        if(consumo <15){
            consumo = 15;
            System.out.println("Valor minimo aplicado");
        }
        System.out.println("Cliente: " + nome + " | Consumo: " + consumoKwh + " kWh | Faixa: " + faixa + " | Total: R$ " + String.format("%.2f", consumo));
    }
}
