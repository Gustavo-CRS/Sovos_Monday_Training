package models;

import enums.Products;

public class Sales {
    final String cliente;
    final Products produto;
    final int quantidade;
    final int mes;

    public Sales(String cliente, Products produto, int quantidade, int mes) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.mes = mes;
    }

    public String getCliente() {
        return cliente;
    }

    public Products getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getMes() {
        return mes;
    }
}
