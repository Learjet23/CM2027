/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

import java.util.Date;

@ClassPreamble(
   author = "Scott Learmonth",
   date = "16/02/2015"
)
/**
 *
 * @author 1303677
 */
public class Visitor extends Person {
    private Date visitDate;
    
    public Visitor(Date visitDate, String firstName, String lastName){
        super(firstName, lastName);
        this.visitDate = visitDate;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }
    
    
}
