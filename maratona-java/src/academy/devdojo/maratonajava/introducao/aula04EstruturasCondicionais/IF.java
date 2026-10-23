package academy.devdojo.maratonajava.introducao.aula04EstruturasCondicionais;

public class IF {
    public static void main(String[] args){
        // if = se
        int idade = 17;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado");
        }

        if (isAutorizadoComprarBebida == false) {
            System.out.println("Não autorizado");
        }
    }
}
