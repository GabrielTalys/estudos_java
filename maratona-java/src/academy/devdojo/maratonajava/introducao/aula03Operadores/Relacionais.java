package academy.devdojo.maratonajava.introducao.aula03Operadores;

public class Relacionais {
    public static void main(String[] args ){
       /*
       % - resto (pode ser usado pra identificar se o número é par ou ímpar)
        */
        int resto = 20 % 2;
        System.out.println(resto);

        /*
        < - menor
        > - maior
        <= - menor ou igual
        >= - maior ou igual
        == - igual
        != - diferente
        ELES SEMPRE VÃO RETORNAR VALORES BOOLEAN = VERDADEIRO / FALSO
         */
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualDez);
    }
}
