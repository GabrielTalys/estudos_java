package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;
/*
Prática
Boletim escolar. Crie variáveis com os dados abaixo:
nome do aluno: Gabriel, nota 1: 6.5, nota 2: 8.0, nota 3: 5.5,
total de aulas: 40 (int), presenças: 29 (int), participou da olimpíada de matemática: true

1. Calcule a média das 3 notas
2. Se o aluno participou da olimpíada, ele ganha +1 ponto na média (use +=)
3. A média não pode passar de 10, se passar ela vira 10
4. Calcule a frequência em porcentagem: presenças / total de aulas * 100 (cuidado com a divisão entre int)
5. Crie variáveis boolean para:
   aprovado: média >= 7 e frequência >= 75
   recuperação: média >= 5 e média < 7 e frequência >= 75
   reprovado: média < 5 ou frequência < 75 (use ||)
6. Imprima: Aluno: <nome> | Média: <média> | Frequência: <frequência>%
   e depois "Aprovado", "Em recuperação" ou "Reprovado"
 */
public class ExBoletim {
    public static void main(String[] args){
        String nome = "Gabriel";
        double nota1 = 6.5;
        double nota2 = 8.0;
        double nota3 = 5.5;
        int totalDeAulas = 40;
        int presenca = 39;
        boolean participouDaOlimpiada = true;
        double presencaPorcentagem = presenca*100.0 / totalDeAulas;
        double media = (nota1 + nota2 + nota3) / 3;

        if(participouDaOlimpiada){
            media +=1;
        }
        if (media >10){
            media = 10;
        }
        System.out.println("Aluno: "+nome+ " | Média: "+String.format("%.2f",media)+ " | Frequência: "+presencaPorcentagem+"%");

        boolean aprovado = media >= 7 && presencaPorcentagem >= 75;
        if (aprovado){
            System.out.println("Você está aprovado");
        }
        boolean recuperacao = media >=5 && media <7 && presencaPorcentagem >= 75;
        if (recuperacao){
            System.out.println("Você está de Recuperação");
        }
        boolean reprovado = media <5 || presencaPorcentagem <75;
        if (reprovado){
            System.out.println("Você está Reprovado.");
        }
    }
}
