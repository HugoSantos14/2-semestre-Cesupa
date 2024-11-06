import java.util.ArrayList;

public class CarrinhoCompras {
    private ArrayList<Livro> livros;

    public CarrinhoCompras() {
        livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public double calcularPrecoTotal() {
        double valor = 0;
        for (Livro livro : livros) {
            valor += livro.getValor();
        }
        return valor;
    }
}