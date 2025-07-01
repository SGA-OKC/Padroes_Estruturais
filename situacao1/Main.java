package situacao1;

class Main {
    public static void main(String[] args) {
        BancoAdapter adapter = new BancoAdapter();
        adapter.pagar("Comprovante #123");

        SistemaImpl sistema = new SistemaImpl();
        sistema.pagar("Comprovante #456");
        sistema.mostrar();
        sistema.gerar();
    }
}