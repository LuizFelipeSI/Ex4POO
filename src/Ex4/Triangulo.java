package Ex4;

public class Triangulo {

    private double base;
    private double lado1;
    private double lado2;

    private double perimetro;
    private String forma;

    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public String getForma() {
        return this.forma;
    }

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
        return this.perimetro;
    }

    public double calcularArea() {
        double area;
        if (this.base == this.lado1 && this.base == this.lado2) {
            area = (this.base * this.lado1) / 2;
            return area;

        } else if (this.base != this.lado1 && this.lado1 == this.lado2) {
            area = (this.base * this.lado1) / 2;
            return area;

        } else {
            if (this.lado1 > this.lado2) {
                area = (this.base * this.lado1) / 2;
            } else {
                area = (this.base * this.lado2) / 2;
            }
            return area;
        }
    }

    public String verificarForma() {
        if (this.base == this.lado1 && this.base == this.lado2) {
            this.forma = "Equilátero";
        } else if (this.base != this.lado1 && this.lado1 == this.lado2) {
            this.forma = "Isósceles";
        } else {
            this.forma = "Escaleno";
        }
        return this.forma;
    }

    public String toString() {
        return "Classificação do Triângulo: " + verificarForma() + "\nÁrea do Triângulo: " + String.format("%.2f", calcularArea()) + "\nPerímetro do Triângulo: " + getPerimetro();
    }
}
