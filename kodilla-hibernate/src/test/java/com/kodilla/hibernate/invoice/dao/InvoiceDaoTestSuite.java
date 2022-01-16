package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("First product");
        Product product2 = new Product("Second product");
        Product product3 = new Product("Third product");

        Item item1 = new Item(new BigDecimal(1000),25);
        Item item2 = new Item(new BigDecimal(350), 30);
        Item item3 = new Item(new BigDecimal(800), 50);
        Item item4 = new Item(new BigDecimal(1200), 40);
        Item item5 = new Item(new BigDecimal(950), 15);

        Invoice invoice1 = new Invoice("16.01.2022.001");

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product2);
        item4.setProduct(product3);
        item5.setProduct(product3);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);
        invoice1.getItems().add(item4);
        invoice1.getItems().add(item5);

        //When
        invoiceDao.save(invoice1);
        int invoiceId = invoice1.getID();

        //Then
        assertNotEquals(0,invoiceId);

    }

}
