public class Ebook extends Livro {
    // private String watermark;

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        if (desconto > 15) {
            System.out.println("Erro ao aplicar o desconto.");
            return false;
        }
        
        double valor = super.getValor()-super.getValor()*desconto/100;
        super.setValor(valor);
        System.out.println("Desconto aplicado ao Ebook!");
        return true;
    }
}