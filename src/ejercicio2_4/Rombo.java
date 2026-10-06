package ejercicio2_4;

public class Rombo {

    int lado;

    int altura;

    Rombo(int lado, int altura) {
        this.lado = lado;
        this.altura = altura;
    }

    double calcularArea() {
        return lado * altura;
    }

    double calcularPerimetro() {
        return 4 * lado;
    }
}