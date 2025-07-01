package situacao1;

interface Banco {
    void pagar(String comprovante);
}

interface ComponenteArquivo {
    void mostrar();
}

interface Relatorio {
    void gerar();
}

class PagamentoAtual {
    public void printReceipt(String comprovante) {
        System.out.println("Imprimindo comprovante: " + comprovante);
    }

    public String send() {
        return "Comprovante enviado com sucesso!";
    }
}

class BancoAdapter implements Banco {

    PagamentoAtual pagamentoAtual = new PagamentoAtual();

    @Override
    public void pagar(String comprovante) {
        pagamentoAtual.printReceipt(comprovante);
        System.out.println(pagamentoAtual.send());
    }
}

interface SistemaCompleto extends Banco, ComponenteArquivo, Relatorio {

}

class SistemaImpl implements SistemaCompleto {

    @Override
    public void pagar(String comprovante) {
        System.out.println("Sistema pagando com comprovante: " + comprovante);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando componente de arquivo.");
    }

    @Override
    public void gerar() {
        System.out.println("Gerando relatório.");
    }
}