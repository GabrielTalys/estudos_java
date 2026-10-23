package academy.devdojo.maratonajava.introducao.aula03Operadores;

public class Atribuicao {
    public static void main (String[] args){
// Operadores de Atribuição

int a = 10; // =  : Atribuição simples (atribui o valor da direita à variável)
a += 5;     // += : Atribuição com adição (soma o valor ao atual e guarda o resultado: a = a + 5)
a -= 3;     // -= : Atribuição com subtração (subtrai o valor do atual e guarda o resultado: a = a - 3)
a *= 2;     // *= : Atribuição com multiplicação (multiplica o atual pelo valor e guarda o resultado: a = a * 2)
a /= 4;     // /= : Atribuição com divisão (divide o atual pelo valor e guarda o resultado: a = a / 4)
a %= 3;     // %= : Atribuição com resto/módulo (guarda o resto da divisão do atual pelo valor: a = a % 3)

        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println(bonus);


        int contador = 0;
        contador += 1; // Soma 1 (mesma coisa que: contador = contador + 1)
        contador++;    // Aumenta 1 (atualiza depois se estiver dentro de uma conta)
        contador--;    // Diminui 1 (atualiza depois se estiver dentro de uma conta)
        ++contador;    // Aumenta 1 (atualiza na hora antes de usar)
        --contador;    // Diminui 1 (atualiza na hora antes de usar)
    }
}
