package controller;

import java.util.ArrayList;

import models.Sales;
import repository.Repository;

public class Controller {
    Repository repository = new Repository();
    ArrayList<Sales> lista = new ArrayList<Sales>();

    public void addSaleToRepository(Sales sale) {
        repository.addSales(sale);
    }

    public void report(String cliente, int mes) {
        lista = repository.getSales();
        double total = 0.0;
        for (Sales sale : lista) {
            int mesTeste = sale.getMes();
            String clienteTeste = sale.getCliente();
            if (mesTeste == mes && clienteTeste.equals(cliente)) {
                total += sale.getQuantidade() * sale.getProduto().getPrice()
                        * sale.getProduto().getCategory().getValue();
            }
        }
        System.out.printf("O valor total é: %.2f\n", total);
    }
}
