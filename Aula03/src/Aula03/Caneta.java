package Aula03;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status() {
        System.out.println("Uma caneta modelo " + this.modelo);
        System.out.print("que possui cor: " + this.cor);
        System.out.println(" além de ponta " + this.ponta);
        System.out.println("esta com carga de: " + this.carga);
        System.out.println("e esta tampada? " + this.tampada);
    } 
    
    public void rabiscar() {
        if(this.tampada == true) {
            System.out.println("Erro! Caneta tampada");
        }
        else
            System.out.println("Rabiscando!");
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
}
