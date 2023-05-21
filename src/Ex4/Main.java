package Ex4;

public class Main {

    public static void main(String[] args) {

        ManipuladorDeElementos triangulo = new ManipuladorDeElementos();
        Triangulo t = new Triangulo();
        triangulo.obterInformacoesTriangulo(t);

        System.out.println("\n");

        ManipuladorDeElementos circulo = new ManipuladorDeElementos();
        Circulo c = new Circulo();
        circulo.obterInformacoesCirculo(c);

        System.out.println("\n");

        ManipuladorDeElementos quadrilatero = new ManipuladorDeElementos();
        Quadrilatero q = new Quadrilatero();
        quadrilatero.obterInformacoesQuadrilatero(q);

    }
}
