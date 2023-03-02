import model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        Gato gato = new Gato("Mia","branco", 2);
        System.out.println(gato);

        Livro livro1 = new Livro("Memorias postumas", 399);
        System.out.println(livro1);
    }
}

class Livro {
    private String nome;
    private int numPaginas;

    public Livro(String nome, int numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}