package aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Uma caneta de modelo: " + this.modelo);
        System.out.print("que possui cor:  " + this.cor);
        System.out.println(" além de ponta " + this.ponta);
        System.out.println("esta com carga? " + this.carga);
        System.out.println("e está tampada? " + this.tampada);
 
    }
    
    void rabiscar() {
        if(this.tampada == true) 
            System.out.println("Erro, caneta tampada");
        else {
            System.out.println("Estou rabiscando!");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
}
