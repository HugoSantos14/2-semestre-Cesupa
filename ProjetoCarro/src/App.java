public class App {
    public static void main(String[] args) throws Exception {
        Carro fusca = new Carro();
        fusca.marca = "VW";
        fusca.preco = 22000;
        fusca.quantidadePortas = 2;
        fusca.mostrarInfo();

        Carro uno = new Carro("Fiat", 50000, 4);
        uno.mostrarInfo();
    }
}
