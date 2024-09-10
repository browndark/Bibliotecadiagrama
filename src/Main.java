package Dados;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("J.K. Rowling", "Britânica");
        Autor autor2 = new Autor("George R.R. Martin", "Americano");

        Livros livro1 = new Livros("Harry Potter e a Pedra Filosofal", autor1, 1997);
        Livros livro2 = new Livros("Game of Thrones", autor2, 1996);
        String matricula1 = null;
        Usuario usuario1 = new Usuario("João Silva", "12345", matricula1);
        Usuario usuario2 = new Usuario("Maria Oliveira", "67890", matricula1);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarUsuario(usuario1);
        biblioteca.adicionarUsuario(usuario2);

        boolean emprestado = biblioteca.emprestarLivro((String) livro1.getId(), usuario1.getId());
        System.out.println("Livro emprestado: " + emprestado);

        List<Livros> livrosDisponiveis = biblioteca.listarLivrosDisponiveis();
        System.out.println("Livros disponíveis:");
        for (Livros livro : livrosDisponiveis) {
            System.out.println(livro.getTitulo());
        }

        boolean devolvido = biblioteca.devolverLivro((String) livro1.getId(), usuario1.getId());
        System.out.println("Livro devolvido: " + devolvido);
        livrosDisponiveis = biblioteca.listarLivrosDisponiveis();
        System.out.println("Livros disponíveis após devolução:");
        for (Livros livro : livrosDisponiveis) {
            System.out.println(livro.getTitulo());
        }
    }
}
