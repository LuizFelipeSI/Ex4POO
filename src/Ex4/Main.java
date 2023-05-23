package Ex4;

public class Main {

    public static void main(String[] args) {

        ManipuladorDeElementos manipulador = new ManipuladorDeElementos();

        Triangulo t = new Triangulo(3,5,5);
        Circulo c = new Circulo(5);
        Quadrilatero q = new Quadrilatero(7,9);

        manipulador.obterInformacoes(t, c, q);
    }
}
