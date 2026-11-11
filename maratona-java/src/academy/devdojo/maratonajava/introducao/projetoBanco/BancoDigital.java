package academy.devdojo.maratonajava.introducao.projetoBanco;

public class BancoDigital {
    public static void main(String[] args ){
        String titular = "Gabriel";
        char plano = 'P';   // 'B' = Básico, 'P' = Premium


        double saldo  = 1500.0;
        int horaAtual = 22;  // de 0 a 23

        double valorPix = 800.0;

        double valorCompra = 250.0;
        char categoria = 'R'; // 'R' = restaurante, 'V' = viagem, 'O' = outros
        double faturaCartao = 0;

        String nomePlano = "";
        double limiteCartao = 0;
        double limitePix = 0;
        double cashback = 0;
        String status = "";

        if(plano == 'B'){
            nomePlano = "Básico";
            limiteCartao = 1000.0;
        }
        else if(plano == 'P'){
            nomePlano = "Premium";
            limiteCartao = 3000.0;
        }
        else{
            System.out.println("Plano inválido.");
        }

        if(horaAtual >= 20 || horaAtual <6){
            limitePix = 1000.0;
        }
        else{
            if(plano == 'B'){
                limitePix = 2000.0;
            }
            else if(plano == 'P'){
                limitePix = 5000.0;
            }
            else{
                System.out.println("Você não tem um plano.");
            }
        }

        if (valorPix <=0){
            System.out.println("Pix Inválido.");
        }
        else if(valorPix > limitePix){
            System.out.println("Pix recusado: acima do limite de: "+limitePix);
        }
        else if(valorPix > saldo){
            System.out.println("Pix recusado: saldo insuficiente.");
        }
        else{
            saldo -= valorPix;
            System.out.println("Pix Aprovado." );
        }

        if (valorCompra > limiteCartao){
            System.out.println("Compra recusada: Limite insuficiente.");
        }
        else{
            if(plano == 'B'){
                cashback = valorCompra *0.01;
                System.out.println("Compra de R$ "+valorCompra+" | Cashback: R$ " + cashback);
            }
            else if (plano == 'P'){
                if (categoria == 'R'){
                    cashback = valorCompra *0.05;
                }
                else if (categoria == 'V'){
                    cashback = valorCompra *0.03;
                }
                else if (categoria == 'O'){
                    cashback = valorCompra *0.02;
                }
                System.out.println("Compra de R$ "+valorCompra+ " aprovada | Cashback: R$ "+cashback);
            }
            faturaCartao += valorCompra;
            saldo += cashback;
        }

        if (saldo >= 1000) {
            status = "Conta saudável \uD83D\uDC9A";
        }
        else if (saldo >=200){
            status = "Atenção com os gastos \uD83D\uDC9B";
        }
        else{
            status = "Saldo baixo ❤\uFE0F";
        }

        System.out.println("==== Banco Digital ====");
        System.out.println("Titular: " + titular + " | Plano: " + nomePlano);
        System.out.println("Saldo final: R$ " + String.format("%.2f",saldo));
        System.out.println("Fatura do Cartão: R$ " + String.format("%.2f",faturaCartao));
        System.out.println("Limite disponível: R$ " + String.format("%.2f",limiteCartao - faturaCartao));
        System.out.println("Status: " + status);
    }
}
