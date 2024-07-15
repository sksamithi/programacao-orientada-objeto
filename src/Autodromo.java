public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("123455443");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("454365");
        z400.ligar();

        Veiculo coringa = jeep;
        coringa.ligar();
    }
}