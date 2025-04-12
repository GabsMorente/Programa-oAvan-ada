package org.example;

import org.example.controller.ProductController;
import org.example.controller.UserController;
import org.example.model.repository.ProductRepository;
import org.example.model.repository.UserRepository;
import org.example.view.MenuView;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:database.sqlite";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn == null) {
                System.out.println("Falha na conexão.");
                return;
            }

            ProductRepository productRepo = new ProductRepository(conn);
            UserRepository userRepo = new UserRepository(conn);

            ProductController productController = new ProductController(productRepo);
            UserController userController = new UserController(userRepo);

            MenuView menu = new MenuView(productController, userController);
            menu.exibirMenu();

        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
