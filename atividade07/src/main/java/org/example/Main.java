package org.example;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Buscar produto por código");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Opção de cadastro selecionada.\n");

                    System.out.println("Insira o número do código:");
                    int codigo = scanner.nextInt();
                    System.out.println("\nInsira o nome do produto:");
                    String nome = scanner.nextLine();
                    System.out.println("\nInsira o número do código:");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(codigo, nome, preco);
                    listaProdutos.add(produto);
                    break;

                case 2:
                    System.out.println("Opção de busca selecionada.");
                    int codigoBusca = scanner.nextInt();

                    Produto produtoEncontrado = null;
                    for (Produto p : produto) {
                        if (p.getCodigo() == codigoBusca) {
                            produtoEncontrado = p;
                            break;
                        }
                    }

                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado: " + produtoEncontrado);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}