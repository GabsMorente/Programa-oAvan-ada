package org.example.view;


import org.example.controller.ProductController;
import org.example.controller.UserController;
import org.example.model.entities.Product;
import org.example.model.entities.User;


import java.util.List;
import java.util.Scanner;

public class MenuView {
    private final ProductController productController;
    private final UserController userController;
    private final Scanner scanner;

    public MenuView(ProductController productController, UserController userController) {
        this.productController = productController;
        this.userController = userController;
        this.scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int option;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Cadastrar Usuário");
            System.out.println("4 - Listar Usuários");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Consumir newline

            switch (option) {
                case 1 -> cadastrarProduto();
                case 2 -> listarProdutos();
                case 3 -> cadastrarUsuario();
                case 4 -> listarUsuarios();
                case 5 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        } while (option != 5);
    }

    private void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Consumir newline
        productController.cadastrarProduto(nome, preco);
        System.out.println("Produto cadastrado!");
    }

    private void listarProdutos() {
        List<Product> produtos = productController.listarProdutos();
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            produtos.forEach(System.out::println);
        }
    }

    private void cadastrarUsuario() {
        System.out.print("Nome do usuário: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        userController.cadastrarUsuario(nome, email, senha);
        System.out.println("Usuário cadastrado!");
    }

    private void listarUsuarios() {
        List<User> usuarios = userController.listarUsuarios();
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            usuarios.forEach(System.out::println);
        }
    }
}
