package Dados;

import java.util.UUID;

public class Livros {
    private String id;
    private String titulo;
    private Autor autor;
    private int anoDePublicacao;
    private boolean disponivel;

    public Livros(String titulo, Autor autor, int anoDePublicacao) {
        this.id = UUID.randomUUID().toString(); // Gerar um ID único
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = true; // Por padrão, o livro está disponível
    }

    public String getId() {
        return id;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Livros(String id, String titulo, Autor autor, int anoDePublicacao, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.disponivel = disponivel;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "id='" + id + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", anoDePublicacao=" + anoDePublicacao +
                ", disponivel=" + disponivel +
                '}';
    }
}
