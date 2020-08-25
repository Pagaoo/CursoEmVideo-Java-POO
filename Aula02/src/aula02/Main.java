package aula02;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.tampar();
        c1.rabiscar();
        c1.status();
        System.out.println("-------------------------");
        
        Caneta c2 = new Caneta();
        c2.modelo = "Positivo";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 10;
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
    
}
