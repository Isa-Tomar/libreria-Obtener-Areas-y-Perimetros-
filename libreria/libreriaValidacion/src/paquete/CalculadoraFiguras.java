package paquete;

/**
 * Esta clase utiliza métodos estáticos para calcular
 * el área y el perímetro de diferentes figuras geométricas.
 * <p>
 */
public final class CalculadoraFiguras {

    /**
     * Constructor de la clase
     */
    private CalculadoraFiguras() {}

    /**
     * Calcula el área de un cuadrado.
     *
     * @param lado medida del lado del cuadrado
     * @return Área del cuadrado
     */
    public static double areaCuadrado(double lado) {
        return lado * lado;
    }

    /**
     * Calcula el perímetro de un cuadrado.
     *
     * @param lado medida del lado del cuadrado
     * @return Perímetro del cuadrado
     */
    public static double perimetroCuadrado(double lado) {
        return 4 * lado;
    }

    /**
     * Calcula el área de un rectángulo.
     *
     * @param base   medida de la base
     * @param altura Altura del rectángulo
     * @return Área del rectángulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Calcula el perímetro de un rectángulo.
     *
     * @param base   medida de la base
     * @param altura Altura del rectángulo
     * @return Perímetro del rectángulo
     */
    public static double perimetroRectangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    /**
     * Calcula el área de un triángulo.
     *
     * @param base   medida de la base
     * @param altura Altura del triángulo
     * @return Área del triángulo
     */
    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    /**
     * Calcula el perímetro de un triángulo.
     *
     * @param l1 medida del lado 1
     * @param l2 medida del lado 2
     * @param l3 medida del lado 3
     * @return Perímetro del triángulo
     */
    public static double perimetroTriangulo(double l1, double l2, double l3) {
        return l1 + l2 + l3;
    }

    /**
     * Calcula el área de un polígono regular.
     *
     * @param lados   Número de lados
     * @param lado    medida de un lado
     * @param apotema Longitud del apotema
     * @return Área del polígono regular
     */
    public static double areaPoligonoRegular(int lados, double lado, double apotema) {
        return (lados * lado * apotema) / 2;
    }

    /**
     * Calcula el perímetro de un polígono regular.
     *
     * @param lados Número de lados
     * @param lado  medida de un lado
     * @return Perímetro del polígono regular
     */
    public static double perimetroPoligonoRegular(int lados, double lado) {
        return lados * lado;
    }

    /**
     * Calcula el área de un círculo.
     *
     * @param radio Radio del círculo
     * @return Área del círculo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /**
     * Calcula el perímetro (circunferencia) de un círculo.
     *
     * @param radio Radio del círculo
     * @return Perímetro del círculo
     */
    public static double perimetroCirculo(double radio) {
        return 2 * Math.PI * radio;
    }
}
