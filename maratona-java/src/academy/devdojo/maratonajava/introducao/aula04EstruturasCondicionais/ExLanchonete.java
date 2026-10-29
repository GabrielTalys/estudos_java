package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;
/*
Prática
Caixa da lanchonete. Crie variáveis com os dados abaixo:
nome do cliente: Ana, preço do lanche: 18.50, preço do refrigerante: 6.00,
quantidade de lanches: 3, quantidade de refrigerantes: 2, dinheiro do cliente: 60

1. Calcule o valor total do pedido
2. Se o total for maior que 50, aplique 10% de desconto usando um operador de atribuição
3. Guarde em uma variável boolean se o cliente consegue pagar (dinheiro >= total)
4. Guarde em uma variável boolean se o pedido é um combo (pelo menos 1 lanche E pelo menos 1 refrigerante)
5. Imprima: Cliente: <nome>, total do pedido: <total>
6. Use if para imprimir "Pagamento aprovado, troco: <troco>" ou "Saldo insuficiente, faltam: <valor>"
   e "Pedido é um combo!" se for combo
 */
public class ExLanchonete {
    public static void main (String[] args){
        String nome = "Ana";
        double precoLanche = 18.5;
        double precoRefrigerante = 6.0;
        int quantidadeDeLanches = 3;
        int quantidadeDeRefrigerante = 0;
        double dinheiro = 45.5;
        double valorPedido = (quantidadeDeLanches * precoLanche + quantidadeDeRefrigerante * precoRefrigerante);
        System.out.println("Cliente: " + nome+ ", total do pedido: " + valorPedido);

        if (valorPedido > 50){
            valorPedido *=0.9;
            System.out.println("Você ganhou 10% de desconto, seu pedido ficou: " + valorPedido);
        }
        if (dinheiro >= valorPedido){
            double troco = dinheiro - valorPedido;
            System.out.println("Você consegue pagar!, seu troco é de: R$" + troco);
        }
        boolean isFalta = dinheiro < valorPedido;
        if (isFalta){
            double falta = valorPedido - dinheiro;
            System.out.println("Para conseguir pagar ainda falta R$: " + String.format("%.2f", falta));
        }
        boolean isCombo = quantidadeDeLanches >=1 && quantidadeDeRefrigerante >= 1;
        if (isCombo){
            System.out.println("Seu pedido é um combo.");
        }
    }
}
