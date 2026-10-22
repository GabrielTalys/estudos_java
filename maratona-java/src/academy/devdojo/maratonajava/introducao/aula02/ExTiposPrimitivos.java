package academy.devdojo.maratonajava.introducao.aula02;
/*
Prática
Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereço <endereço>, confirmo qee recebi o salário de <salário>, na data <data>
 */
public class ExTiposPrimitivos {
    public static void main(String [] args){
        String nome = "Gabriel";
        String endereco = "Bairro: teste, Rua teste 205";
        float salario = 1560;
        String data = "20/12/2026";

        System.out.println("Eu "+nome+ " morando no endereço: "+endereco+ ", confirmo que recebi o salário de "+salario+ ", na data "+data+".");
    }
}
