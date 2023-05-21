package Ex4;

public class Triangulo {

    private double base;
    private double lado1;
    private double lado2;

    private double perimetro;

    /*
    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }*/

    public double getBase() {
        return this.base;
    }

    public double getLado1() {
        return this.lado1;
    }

    public double getLado2() {
        return this.lado2;
    }

    public double getPerimetro() {
        this.perimetro = this.base + this.lado1 + this.lado2;
        System.out.println("o perimetro é: " + this.perimetro);
        return this.perimetro;
    }

    public double calcularArea(double base, double lado1, double lado2) {
        double area;
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
        if (base == lado1 && base == lado2) {
            System.out.println("é um triangulo Equilátero");
            area = (base * lado1) / 2;
            return area;

        } else if (base != lado1 && lado1 == lado2) {
            System.out.println("é um triangulo Isósceles");
            area = (base * lado1) / 2;
            return area;

        } else {
            System.out.println("é um triangulo Escaleno");
            if (lado1 > lado2) {
                area = (base * lado1) / 2;
            } else {
                area = (base * lado2) / 2;
            }
            System.out.println("a área do triangulo é: " + area);
            return area;
        }
    }
}
