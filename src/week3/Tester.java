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
        
        Customer customer = new Customer(200, "Julian", "Bass");
        
        Visitor visitor = new Visitor(date, "Mark", "Zarb");
        System.out.println(visitor);
    }
    
}
