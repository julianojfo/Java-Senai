package br.com.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));
        biblioteca.adicionarLivro(new Livro("O Príncipe", "Maquiavel"));
        biblioteca.adicionarLivro(new Livro("Guerra e Paz", "Tolstói"));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBem-vindo à Biblioteca");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Mostrar Catálogo");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    biblioteca.mostrarCatalogo();
                    break;
                case 2:
                    System.out.println("Digite o título do livro que deseja emprestar:");
                    scanner.nextLine(); // Limpar o buffer do teclado
                    String livroEmprestimo = scanner.nextLine();
                    biblioteca.emprestarLivro(livroEmprestimo);
                    break;
                case 3:
                    System.out.println("Digite o título do livro que deseja devolver:");
                    scanner.nextLine(); // Limpar o buffer do teclado
                    String livroDevolucao = scanner.nextLine();
                    biblioteca.devolverLivro(livroDevolucao);
                    break;
                case 4:
                    System.out.println("Obrigado por usar a Biblioteca. Até logo!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
            }
        }
    }
}