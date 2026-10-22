package academy.devdojo.maratonajava.introducao.aula03Operadores;

public class LogicosAnd {
    public static void main (String [] args){
     /*
        && (AND) - E
        || (OR) - OU
        ! (NOT)- Negação
      */
        int  idade = 26;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueVinte = idade >= 20 && salario > 3000;
        boolean isDentroDaLeiMenorQueVinte = idade < 20 && salario < 2500;
        //Nesse caso as duas condições precisam ser verdadeira pra ser true
        System.out.println(isDentroDaLeiMaiorQueVinte);
        System.out.println(isDentroDaLeiMenorQueVinte);
    }
}
