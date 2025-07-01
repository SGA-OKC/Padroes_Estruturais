package exemplo_pastas;

import java.util.ArrayList;
import java.util.List;

interface Documento {

    void abrir();

}

class Arquivo implements Documento {
    String nome = "<nome vazio>";

    public Arquivo(String nomeDocumento){
        this.nome = nomeDocumento;
    }

    public void abrir(){
        System.out.println("Arquivo: " + this.nome);
    }
}

class Pasta implements Documento {
    private String nome = "<nome vazio>";
    private List<Documento> documentos = new ArrayList<>();

    public Pasta(String nomeDocumento){
        this.nome = nomeDocumento;
    }

    public void adicionar(Documento documento){
        documentos.add(documento);
    }

    public void abrir(){
        System.out.println("Pasta: " + this.nome);
        for (Documento documento : documentos){
            documento.abrir();
        }
    }
}




public class Main {
    public static void main(String[] args) {
        Pasta pastaRaiz = new Pasta("raiz");
        Arquivo readme = new Arquivo("readme.md");
        Pasta java = new Pasta("java");

        pastaRaiz.adicionar(readme);
        pastaRaiz.adicionar(java);

        java.adicionar(new Arquivo("Main.java"));
        java.adicionar(new Arquivo("ExemplosPastas.java"));

        pastaRaiz.abrir();
    }
}
