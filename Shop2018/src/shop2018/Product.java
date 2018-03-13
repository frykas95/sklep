/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {
    private String name;
    private BigDecimal price;
    private int count = 100;

    public Product(String nazwa, BigDecimal cena) {
        this.name = nazwa;
        this.price = cena;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
    
    public String toString()
    {
        return name + " ("+price+"zł)";
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int compareTo(Product second) {
        return name.compareTo(second.name);
    }
    
    
}