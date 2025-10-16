package org.example;

import org.example.dao.IDao;
import org.example.entities.Product;
import org.example.util.HibernateConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringHibernateDemoApplication {

    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);

        // Get the DAO bean
        IDao<Product> productDao = (IDao<Product>) context.getBean(IDao.class);

        // Create a product
        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);

        // Save the product
        productDao.create(product);

        System.out.println("Produit sauvegardé : " + product.getName());
    }
}
