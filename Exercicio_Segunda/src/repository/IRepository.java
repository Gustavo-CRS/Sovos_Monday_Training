package repository;

import java.util.ArrayList;

import models.Sales;

public interface IRepository {
    void addSales(Sales sale);

    ArrayList<Sales> getSales();

}
