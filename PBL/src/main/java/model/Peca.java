package model;

public class Peca extends Montagem{
    private int id;
    private String nome;


    public Peca(String nome, double preco) {
        super(preco);
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Peca{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                super.toString() +
                '}';
    }
}
