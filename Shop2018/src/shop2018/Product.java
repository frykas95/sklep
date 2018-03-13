/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

public class Product {
    private String name;
    private BigDecimal price;

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
    
}