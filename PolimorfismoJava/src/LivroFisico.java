public class LivroFisico extends Livro {
    private double taxaImpressao;

    public LivroFisico(Autor autor) {
        super(autor);
    }

    public double getTaxaImpressao() {
        return taxaImpressao;
    }

    @Override
    public boolean aplicarDesconto(double desconto) {
        if (desconto > 30) {
            System.out.println("Erro ao aplicar o desconto.");
            return false;
        }
        
        double valor = super.getValor()-super.getValor()*desconto/100;
        super.setValor(valor);
        System.out.println("Desconto aplicado ao Livro!");
        return true;
    }
}