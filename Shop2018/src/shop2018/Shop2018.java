/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

/**
 *
 * @author Student
 */
public class Shop2018 {

    
   
    public static void main(String[] args) {
        Product chleb = new Product("chleb",new BigDecimal("1.8"));
        Product cukier = new Product("cukier",new BigDecimal("3.2"));
        Product olej = new Product("olej",new BigDecimal("4.2"));
        Product maka = new Product("maka",new BigDecimal("2.2"));
        
        Cart koszyk = new Cart();
        koszyk.dodaj(chleb);
        koszyk.dodaj(cukier);
        koszyk.dodaj(olej);
        koszyk.dodaj(olej);
        koszyk.dodaj(maka);
        koszyk.dodaj(maka);
        
        System.out.println(koszyk.doPay());
        System.out.println(koszyk);
       
        

        
    }
    
}
