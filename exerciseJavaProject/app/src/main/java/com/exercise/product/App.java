/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.exercise.product;

import com.exercise.product.domain.Product;

public class App {
    public static void main(String[] args) {
        Product product = new Product("P1","P1 Description",231d);
        System.out.println(product);
    }
}
