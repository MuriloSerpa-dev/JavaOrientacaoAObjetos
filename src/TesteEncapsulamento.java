public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar " + ar.obterTemperatura() + "° ");

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar " + ar.obterTemperatura() + "° ");
    }

}
