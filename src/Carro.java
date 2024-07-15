public class Carro extends Veiculo {
    @Override
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio");
    }

    private void confereCombustivel() {
        System.out.println("Conferindo combustível");
    }
}