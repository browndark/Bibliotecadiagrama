package Dados;

import Dados.Livros;
import Dados.Usuario;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

public class Biblioteca {
    private List<Livros> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarLivro(Livros livro) {
        livros.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean emprestarLivro(String livroId, String usuarioId) {
        Optional<Livros> livroOpt = livros.stream()
                .filter(l -> l.getId() != null && l.getId().equals(livroId) && l.isDisponivel())
                .findFirst();

        Optional<Usuario> usuarioOpt = usuarios.stream()
                .filter(u -> u.getId() != null && u.getId().equals(usuarioId))
                .findFirst();

        if (livroOpt.isPresent() && usuarioOpt.isPresent()) {
            Livros livro = livroOpt.get();
            Usuario usuario = usuarioOpt.get();
            livro.setDisponivel(false);
            usuario.adicionarLivroEmprestado(livro);
            return true;
        }
        return false;
    }

    public boolean devolverLivro(String livroId, String usuarioId) {
        Optional<Usuario> usuarioOpt = usuarios.stream().filter(u -> u.getId().equals(usuarioId)).findFirst();

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            Livros livro = usuario.removerLivroEmprestado(livroId);

            if (livro != null) {
                livro.setDisponivel(true);
                return true;
            }
        }
        return false;
    }

    public Livros buscarLivro(String livroId) {
        return livros.stream().filter(l -> l.getId().equals(livroId)).findFirst().orElse(null);
    }

    public Usuario buscarUsuario(String usuarioId) {
        return usuarios.stream().filter(u -> u.getId().equals(usuarioId)).findFirst().orElse(null);
    }

    public List<Livros> listarLivrosDisponiveis() {
        List<Livros> livrosDisponiveis = new ArrayList<>();
        for (Livros livro : livros) {
            if (livro.isDisponivel()) {
                livrosDisponiveis.add(livro);
            }
        }
        return livrosDisponiveis;
    }
}
