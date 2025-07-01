package situacao2;

interface Relatorio {
    String gerar();
}

class RelatorioSimples implements Relatorio{
    public String gerar() {
        return "relatório simples";
    }
}

class SemCabecalho implements Relatorio {
    Relatorio relatorio;

    public SemCabecalho(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    public String gerar(){
        return this.relatorio.gerar() + " sem cabeçalho,";
    }
}

class ComCabecalho implements Relatorio {
    Relatorio relatorio;

    public ComCabecalho(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    public String gerar(){
        return this.relatorio.gerar() + " com cabeçalho,";
    }
}

 class Rodape implements Relatorio {
    Relatorio relatorio;

    public Rodape(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public String gerar(){
        return this.relatorio.gerar() + " rodapé,";
    }
}

class Assinatura implements Relatorio {
    Relatorio relatorio;

    public Assinatura(Relatorio relatorio){
        this.relatorio = relatorio;
    }

    public String gerar(){
        return this.relatorio.gerar() + " assinatura.";
    }
}


public class Main {
        public static void main(String[] args) {
            Relatorio relatorio = new RelatorioSimples();
            relatorio = new SemCabecalho(relatorio);
            relatorio = new ComCabecalho(relatorio);
            relatorio = new Rodape(relatorio);
            relatorio = new Assinatura(relatorio);
    
            System.out.println("Você tem essas opções: " +  relatorio.gerar());
        }
}


//Usuários do sistema podem escolher gerar relatórios com ou sem cabeçalho, rodapé ou assinatura. 
//Como permitir essa flexibilidade sem criar várias classes diferentes para cada combinação?