package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;

public class ElseIf {
    public static void main(String[] args){
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 18;
        String categoria = "";
        if (idade <15){
            categoria = "Categoria Infantil";
        }
        else if (idade >=15 && idade <18 ){
            categoria = "Categoria Juvenil";
        }
        else {
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
