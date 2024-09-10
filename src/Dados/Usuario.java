package Dados;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String matricula;  // Variável de matrícula definida uma vez
    private List<Livros> livrosEmprestados; // Lista para armazenar livros emprestados

    public Usuario(String nome, String matricula, String matricula1) {
        this.nome = nome;
        this.matricula = matricula;
        this.livrosEmprestados = new ArrayList<>(); // Inicializa a lista
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adicionarLivroEmprestado(Livros livro) {
        livrosEmprestados.add(livro);
    }

    public Livros removerLivroEmprestado(String livroId) {
        for (Livros livro : livrosEmprestados) {
            if (livro.getId().equals(livroId)) {
                livrosEmprestados.remove(livro);
                return livro;
            }
        }
        return null;
    }

    public String getId() {
        return matricula;
    }
}
