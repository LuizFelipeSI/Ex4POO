package Ex4;

public class Quadrilatero {

    private double base;
    private double altura;
    private double perimetro;

    /*
    public Quadrilatero(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }*/

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void getPerimetro() {
        this.perimetro = (2 * this.base) + (2 * this.altura);
        System.out.println("o perimetro é: " + this.perimetro);
    }

    public void calculaArea(double base, double altura) {
        double area = base * altura;
        this.base = base;
        this.altura = altura;
        if (base != altura) {
            System.out.println("A forma é um Retângulo");
            System.out.println("a área do Retangulo é: " + area);
        } else {
            System.out.println("A forma é um Quadarado");
            System.out.println("a área do Quasrado é: " + area);
        }
    }
}
