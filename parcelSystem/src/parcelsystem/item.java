/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelsystem;

/**
 *
 * @author user
 */
public class item 
{
     private int item_trackingNum;
    private String item_name;
    private String item_type;
    private String item_destination;
    private int cus_id;
    private int item_id;
    private float item_weight;

    public int getItem_trackingNum() {
        
        return item_trackingNum;
    }

    public void setItem_trackingNum(int item_trackingNum) {
        this.item_trackingNum = item_trackingNum;
    }

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public String getItem_type() {
        return item_type;
    }

    public void setItem_type(String item_type) {
        this.item_type = item_type;
    }

    public String getItem_destination() {
        return item_destination;
    }

    public void setItem_destination(String item_destination) {
        this.item_destination = item_destination;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    public int getItem_id() {
        return item_id;
    }

    

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public float getItem_weight() {
        return item_weight;
    }

    public void setItem_weight(float item_weight) {
        this.item_weight = item_weight;
    }  

    public item(int item_trackingNum, String item_name, String item_type, String item_destination, int cus_id, int item_id, float item_weight) {
        this.item_trackingNum = item_trackingNum;
        this.item_name = item_name;
        this.item_type = item_type;
        this.item_destination = item_destination;
        this.cus_id = cus_id;
        this.item_id = item_id;
        this.item_weight = item_weight;
    }
    
    
    
}
