/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Date;

import java.lang.annotation.Documented;
@Documented
@interface ClassPreamble {
   String author();
   String date();
}
/**
 *
 * @author 1303677
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date date = new Date();
        
        Address addr1 = new Address("j.m.bass@rgu.ac.uk", "Aberdeen");
        Address addr2 = new Address("m.zarb@rgu.ac.uk", "Aberdeen");
        
        Customer customer = new Customer(200, "Julian", "Bass", addr1);
        System.out.println(customer);
        Visitor visitor = new Visitor(date, "Mark", "Zarb", addr2);
        System.out.println(visitor);
    }
    
}
