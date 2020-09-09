package Aula03;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "BIC";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; - modificador privado, usa-se getters e setters para adicionar algo.
        c1.carga = 90;
        //c1.tampada = true; - modificador privado.
        c1.destampar(); //Apesar de o atributo tampar estar privado, os métodos da classe, estão públicos e se referem ao tampar.
        c1.status();
        c1.rabiscar();
    }
}
