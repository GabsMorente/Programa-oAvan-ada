package com.unicesumar.entities;

import java.util.UUID;

public class Sales extends Entity {
    UUID user_id;
    String payment_method;
    String sales_data;

    public Sales(UUID user_id, String payment_method, String sales_data) {
        this.user_id = user_id;
        this.payment_method = payment_method;
        this.sales_data = sales_data;
    }

    public Sales(UUID uuid, UUID user_id, String payment_method, String sales_data) {
        super(uuid);
        this.user_id = user_id;
        this.payment_method = payment_method;
        this.sales_data = sales_data;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public String getSales_data() {
        return sales_data;
    }
}
