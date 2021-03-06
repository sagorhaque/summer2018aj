/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.console.application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**
 *
 * @author monirulhasan
 */
public class DBConsoleApplication {

    public DBConsoleApplication() {
//        Product product = new Product(48, "Jinhao 159", 900);
//        System.out.println(product);

        ProductDAO productDao = new ProductDAOMySQLImplementation();
//        productDao.insertProduct(product);
        List<Product> productList = productDao.getAllProducts();
        
        for (Product product : productList)
            System.out.println(product);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new DBConsoleApplication();
    }

}
