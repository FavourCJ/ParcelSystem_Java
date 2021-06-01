/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelsystem;

import java.io.Serializable;
import java.util.Iterator;

public class customer implements Serializable {

   
     private int cus_id;
    private String cus_name;
    private String cus_surname;
    private String item_id;
   private int item_trackingNum;

    public int getCus_id() {
       
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
        
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getCus_surname() {
        return cus_surname;
    }

    public void setCus_surname(String cus_surname) {
        this.cus_surname = cus_surname;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

   
    public int getItem_trackingNum() {
        return item_trackingNum;
    }

    public void setItem_trackingNum(int item_trackingNum) {
        this.item_trackingNum = item_trackingNum;
    }

    public customer(int cus_id, String cus_name, String cus_surname, String item_id, int item_trackingNum) {
        this.cus_id = cus_id;
        this.cus_name = cus_name;
        this.cus_surname = cus_surname;
        this.item_id = item_id;
        this.item_trackingNum = item_trackingNum;
    }

   
    
    
}

