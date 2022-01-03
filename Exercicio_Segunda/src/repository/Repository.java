package repository;

import java.util.ArrayList;

import models.Sales;

public class Repository implements IRepository {
    private ArrayList<Sales> listaSales = new ArrayList<Sales>();

    @Override
    public void addSales(Sales sale) {
        this.listaSales.add(sale);

    }

    @Override
    public ArrayList<Sales> getSales() {
        return listaSales;
    }

}
