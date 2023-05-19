package BMExercicio03;

import java.util.Scanner;

public class TesteBMExercicio03 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;
        System.out.println("Informe um numero para converter: ");
        numero = scan.nextDouble();
        
        System.out.println("Converter de Metre Quadrado para Pes Quadrados:");
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.metrosParaPes(numero));
        System.out.println();

        System.out.println("Converter de Pe Quadrado para Centrimetro Quadrado:");
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.peParaCentimetro(numero));
        System.out.println();

        System.out.println("Converter de Milha Quadrada para Acres:");
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.milhaParaAcres(numero));
        System.out.println();

        System.out.println("Converter de Acre para Pes Quadrados:");
        System.out.println("Resultado: " + ConversaoDeUnidadesDeArea.acreParaPes(numero));
        System.out.println();
    }
}
