/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.TreeSet;


public class Warehouse {
    private List<Product> products = new ArrayList();
    
    public Warehouse()
    {
        products.add(new Product("chleb", new BigDecimal("1.8")));
        products.add(new Product("cukier", new BigDecimal("3.2")));
        products.add(new Product("olej", new BigDecimal("4.2")));
        products.add(new Product("maka", new BigDecimal("2.2")));
    }
    
    public Collection<Product> productsSortByName()
    {
        TreeSet set = new TreeSet();
        set.addAll(products);
        return set;
    }
    
    
    
    
    public Collection<Product> productsSortByPrice()
    {
        PriceComparator c = new PriceComparator();
        TreeSet<Product> set = new TreeSet(c);
        set.addAll(products);
        return set;
    }
    
    public void doOrder(Cart Cart)
    {
        
    }
    
    
    @Override
    public String toString()
    {
        return products.toString();
    }
    
    public static void main(String[] args) {
        Warehouse w = new Warehouse();
        System.out.println(w);
        System.out.println(w.productsSortByName());
        System.out.println(w.productsSortByPrice());
       
    }
    
}