package principal;

import formas.Circulo;
import formas.Ponto;
import formas.Retangulo;
import formas.SegmentoReta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /*Retangulo r1 = new Retangulo(3, 4, 5, 6);*/

       /*Scanner teclado = new Scanner(System.in);
       int x = teclado.nextInt();
       int y = teclado.nextInt();
       int altura = teclado.nextInt();
       int largura = teclado.nextInt();
       float raio = teclado.nextFloat();

       Retangulo retangulo = new Retangulo(x, y, altura, largura);
       System.out.println(retangulo);

       retangulo.desenhar();

       retangulo.mover(4,5);

       retangulo.desenhar();

       retangulo.redimensionar(100, 50);

       retangulo.desenhar();

       retangulo.dividir(2, 2);

       retangulo.desenhar();

       Circulo circulo = new Circulo(x, y, raio);
       System.out.println(circulo);

       circulo.desenhar();

       circulo.mover(4,5);

       circulo.desenhar();

       circulo.redimensionar(100);

       circulo.desenhar();

       circulo.dividir(2);

       circulo.desenhar();
        */

       Ponto p = new Ponto(2, 4);
       Ponto p2 = new Ponto(6, 8);

       SegmentoReta segmentoReta = new SegmentoReta(p, p2);
       segmentoReta.tamano();
    }
}
