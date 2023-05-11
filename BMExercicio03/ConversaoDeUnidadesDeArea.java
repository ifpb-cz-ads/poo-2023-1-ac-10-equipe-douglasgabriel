package BMExercicio03;
/*
 * Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos
 * para conversão das unidades de área segundo a lista abaixo.
 * 
 * 1 metro quadrado = 10.76 pés quadrados
 * 1 pé quadrado = 929 centímetros quadrados
 * 1 milha quadrada = 640 acres
 * 1 acre = 43.560 pés quadrados
 */

public class ConversaoDeUnidadesDeArea{
    private static final double METRO = 10.76;
    private static final double CENTI = 929;
    private static final double MILHAACRES = 640;
    private static final double ACRE = 43.560;

    public static double metrosParaPes (double metro){
        double pesQuadrados = metro * METRO;
        return pesQuadrados;
    }

    public static double peParaCentimetro (double pe){
        double centimetro = pe * CENTI;
        return centimetro;
    }

    public static double milhaParaAcres (double milha){
        double acres = milha * MILHAACRES;
        return acres;
    }

    public static double acreParaPes (double acre){
        double pesQuadrados = acre * ACRE;
        return pesQuadrados;
    }
}