package br.com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void emprestarLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && !livro.isEmprestado()) {
                livro.emprestar();
                System.out.println("Livro emprestado: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não disponível para empréstimo ou não encontrado.");
    }

    public void devolverLivro(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equals(titulo) && livro.isEmprestado()) {
                livro.devolver();
                System.out.println("Livro devolvido: " + livro.getTitulo());
                return;
            }
        }
        System.out.println("Livro não encontrado ou já devolvido.");
    }

    public void mostrarCatalogo() {
        if (livros.isEmpty()) {
            System.out.println("A biblioteca está vazia.");
            return;
        }
        System.out.println("Catálogo da Biblioteca:");
        for (Livro livro : livros) {
            System.out.println("- " + livro.getTitulo() + " por " + livro.getAutor() + " (Disponível: " + !livro.isEmprestado() + ")");
        }
    }
}
