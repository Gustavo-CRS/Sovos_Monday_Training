package controller;

import java.io.IOException;
import java.util.Scanner;

import enums.Products;
import menus.Menu;
import models.Sales;

public class Sistema {
    final private static Scanner scanner = new Scanner(System.in);
    final private static Menu menu = new Menu();

    public static void run() throws IOException {
        Controller controller = new Controller();

        boolean rodar = true;
        System.out.println("\f\f\f\f\f\f\f\f\f\f\f\f");
        System.out.println("Bem Vindo ao sistema da Sovos");

        while (rodar) {

            menu.exibirMenu();
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String cliente = scanner.next();
                    System.out.println("Digite o produto: ");
                    String produto = scanner.next();
                    Products p = Products.valueOf(produto.toUpperCase());
                    System.out.println("Digite a quantidade: ");
                    String quantidade = scanner.next();
                    System.out.println("Digite o mês: ");
                    String mes = scanner.next();
                    Sales sale = new Sales(cliente, p, Integer.parseInt(quantidade),
                            Integer.parseInt(mes));
                    controller.addSaleToRepository(sale);
                    break;

                case 2:
                    System.out.println("Digite o cliente a ser buscado: ");
                    String clienteBusca = scanner.next();
                    System.out.println("Digite o mês a ser buscado: ");
                    String mesBusca = scanner.next();
                    controller.report(clienteBusca, Integer.parseInt(mesBusca));
                    break;

                case 3:
                    System.out.println("\nVocê está saindo do sistema.");
                    rodar = false;
                    break;

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }

    }

}
