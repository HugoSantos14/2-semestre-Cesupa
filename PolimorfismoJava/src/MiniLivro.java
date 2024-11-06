public class MiniLivro extends Livro {
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        System.out.println("Esse livro não pode receber desconto.");
        return false;
    }
}
