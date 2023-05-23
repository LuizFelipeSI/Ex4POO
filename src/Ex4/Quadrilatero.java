package Ex4;

public class Quadrilatero {

    private double base;
    private double altura;
    private double perimetro;
    private String forma;


    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public String getForma() {
        return this.forma;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double getPerimetro() {
        this.perimetro = (2 * this.base) + (2 * this.altura);
        return this.perimetro;
    }

    public double calculaArea() {
        double area = this.base * this.altura;
        return area;
    }

    public String verificarForma() {
        if (this.base != this.altura) {
            this.forma = "Retângulo";
        } else {
            this.forma = "Quadrado";
        }
        return this.forma;
    }

    public String toString() {
        return "Tipo do quadrilátero: " + verificarForma() + "\nÁrea do quadrilátero: " + String.format("%.2f", calculaArea()) + "\nPerímetro do quadrilátero: " + getPerimetro();
    }
}
