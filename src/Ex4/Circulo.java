package Ex4;

public class Circulo {

    private double raio;
    private double perimetro;


    public void getRaio() {
        System.out.println("o raio do circulo é: " + this.raio);
    }

    public void getPerimetro() {
        this.perimetro = 2 * 3.14 * this.raio;
        System.out.println("o perimetro do circulo é: " + this.perimetro);
    }

    /*
    public Circulo(double raio) {
        this.raio = raio;
    }*/

    public void calculaArea(double raio) {
        double area = 3.14 * raio;
        this.raio = raio;
        System.out.println("a área do circulo é: " + area);
    }
}
