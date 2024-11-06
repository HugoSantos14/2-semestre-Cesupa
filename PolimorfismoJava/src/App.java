public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Autor autor1 = new Autor();
        autor1.setNome("Nome1");
        autor1.setCpf("cpf1");
        autor1.setEmail("email1");

        Ebook ebook1 = new Ebook(autor1);
        ebook1.setNome("livro2");
        ebook1.setDescricao("descricao2");
        ebook1.setValor(50);
        ebook1.setIsbn("isbn2");
        ebook1.aplicarDesconto(10);
        System.out.println(ebook1.getValor());

        LivroFisico fisico1 = new LivroFisico(autor1);
        fisico1.setNome("livro3");
        fisico1.setDescricao("descricao3");
        fisico1.setValor(0);
        fisico1.setIsbn(null);
        fisico1.aplicarDesconto(0);

        Livro falso = new Ebook(autor1);
        falso.setValor(100);
        falso.aplicarDesconto(10);

        carrinho.adicionarLivro(falso);
    }
}