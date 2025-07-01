package exemplo_sorvete;

// interface vai se manter do mesmo jeito 
interface Sorvete {
    String servir();
}

// implementa na interface
class SorveteSimples implements Sorvete {

    public String servir() {
        return "Sorvete de Baunilha";
    }
}

// decorator
class CoberturaChocolate implements Sorvete{
    Sorvete sorvete;

    public CoberturaChocolate(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    public String servir() {
        return this.sorvete.servir() + " com cobertura de Chocolate";
    }
}

class CoberturaMorango implements Sorvete{
    Sorvete sorvete;

    public CoberturaMorango(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    public String servir() {
        return this.sorvete.servir() + " com cobertura de Morango";
    }
}

public class Main {
    public static void main(String[] args) {
        Sorvete sorvete = new SorveteSimples();
        sorvete = new CoberturaChocolate(sorvete);
        sorvete = new CoberturaMorango(sorvete);

        System.out.println("Pedido Pronto: " +  sorvete.servir());
    }
}
