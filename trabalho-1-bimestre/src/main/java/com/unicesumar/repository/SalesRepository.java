package com.unicesumar.repository;

import com.unicesumar.entities.Sales;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class SalesRepository implements EntityRepository<Sales> {
    private final Connection connection;

    public SalesRepository(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Sales entity) {
        String query = "INSERT INTO users VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            stmt.setString(1, entity.getUuid().toString());
            stmt.setString(2, entity.getUser_id().toString());
            stmt.setString(3, entity.getPayment_method());
            stmt.setString(4, entity.getSales_data());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Optional<Sales> findById(UUID id) {
        String query = "SELECT * FROM Sales WHERE id = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            stmt.setString(1, id.toString());
            ResultSet resultSet = stmt.executeQuery();
            if (resultSet.next()) {
                return Optional.of(new Sales(
                        UUID.fromString(resultSet.getString("user_id")),
                        resultSet.getString("payment_method"),
                        resultSet.getString("sales_data")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }


    @Override
    public List<Sales> findAll() {
        String query = "SELECT * FROM sales";
        ArrayList<Sales> sales = new ArrayList<>();

        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                sales.add(new Sales(
                        UUID.fromString(resultSet.getString("user_id")),
                        resultSet.getString("payment_method"),
                        resultSet.getString("sales_data")
                ));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return sales;
    }

    @Override
    public void deleteById(UUID id) {
        String query = "DELETE FROM sales WHERE uuid = ?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            stmt.setString(1, id.toString());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
