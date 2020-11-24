package logic;

public class LogicOperations {

    public static double calculaCirculo(double radio) {

        return Math.PI * (radio * radio);
    }

    public static double calcularHexagono(double lado, double apotema) {

        double perimetro = lado * 6;

        return Math.sqrt((perimetro * apotema) / 2);
    }

    public static double calcularPentagono(double lado, double apotema) {

        double perimetro = lado * 5;

        return Math.sqrt((perimetro * apotema) / 2);
    }

    public static double calcularTriangulo(double base, double altura) {

        return base * altura / 2;
    }

    public static double calcularRectangulo (double base, double altura) {

        return base * altura;
    }

    public static double calcularTrapecio (double base, double altura) {


        return ((base + base) * altura) / 2;
    }
}
