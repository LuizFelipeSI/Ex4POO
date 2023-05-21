package Ex4;

public class ManipuladorDeElementos {

    public void obterInformacoesCirculo(Circulo c) {
        c.calculaArea(8);
        c.getRaio();
        c.getPerimetro();
    }
    public void obterInformacoesQuadrilatero(Quadrilatero q) {
        q.calculaArea(8, 6);
        q.getPerimetro();
    }
    public void obterInformacoesTriangulo(Triangulo t) {
        t.calcularArea(5, 7, 9);
        t.getPerimetro();
    }
}
