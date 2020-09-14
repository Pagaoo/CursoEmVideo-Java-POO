package Aula04;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("BIC", 1.0f, "Azul");
        Caneta c2 = new Caneta("Pencil", 9.0f, "Roxa");
        
        //c1.setModelo("BIC"); // = c1.modelo("BIC"); para atributos públicos, pode-se usar os dois modelos. Isso também inclui usar os Getters, caso privado, só funciona os Getters.
        //c1.setPonta(1.0f); //Caso o atributo seja privado, só podera usar setters e não mais: c1.ponta(1.0f);
        c1.status();
        System.out.println("--------------------------------------------------");
        c2.status();
    }
}
