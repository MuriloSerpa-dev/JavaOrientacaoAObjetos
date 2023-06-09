package com.algaworksfjo.desafiostaticefinal;

public class MatermaticaUtil {
    public static final double PI = 3.14;

    public static int calcularFibonacci(int posicao) {
        if (posicao < 2) {
            return posicao;
        }
        return calcularFibonacci(posicao - 1) + calcularFibonacci(posicao - 2);
    }

    public static double calcularAreaCirculo(double raio) {
        double areaCirculo = raio * raio * PI;
        return areaCirculo;

    }
}
