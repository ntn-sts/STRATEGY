public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora( new Subtracao() );

        calculadora.setA(10);
        calculadora.setB(5);

        System.out.println("Resultado: " + calculadora.Calculo());

    }
}
