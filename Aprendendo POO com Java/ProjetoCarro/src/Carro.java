public class Carro {
    public String marca;
    public double preco;
    public int quantidadePortas;

    public Carro(){
        this.marca = "";
        this.preco = 0;
        this.quantidadePortas = 0;
    }

    public Carro(String marca, double preco, int quantidade){
        this.marca = marca;
        this.preco = preco;
        this.quantidadePortas = quantidade;
    }

    public void mostrarInfo(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Preço: R$" + this.preco);
        System.out.println("N° de portas: " + this.quantidadePortas);
    }

    public void setMarca(String marca){
        if (marca.length() > 0) {
            this.marca = marca;
        }
    }

    public String getMarca(){
        return this.marca;
    }
}
