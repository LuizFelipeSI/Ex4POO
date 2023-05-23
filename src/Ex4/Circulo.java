package Ex4;

public class Circulo {

    private double raio;
    private double perimetro;


    public double getRaio() {
        return this.raio;
    }

    public double getPerimetro() {
        this.perimetro = 2 * 3.14 * this.raio;
        return this.perimetro;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calculaArea() {
        double area = 3.14 * this.raio;
        return area;
    }

    public String toString() {
        return "Área do cículo: " + String.format("%.2f", calculaArea()) + "\nPerímetro do círculo: " + String.format("%.2f", getPerimetro()) + "\nRaio do círuclo: " + getRaio();
    }
}
