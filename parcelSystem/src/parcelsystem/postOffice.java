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
public class postOffice {
   private float itemPrice;
   private int postCode;
   private float itemWeight;
   private String postAddress;

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
       
        this.itemPrice = itemPrice;
    }

    public int getPostCode() {
        
        
        return postCode;
    }

    public void setPostCode(int postCode) {
      
        this.postCode=postCode;
    }

    public float getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(float itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getPostAddress() {
        return postAddress;
    }

    public void setPostAddress(String postAddress) {
        this.postAddress = postAddress;
    }

    public postOffice(float itemPrice, int postCode, float itemWeight, String postAddress) {
        this.itemPrice = itemPrice;
        this.postCode = postCode;
        this.itemWeight = itemWeight;
        this.postAddress = postAddress;
    }
   
   
    
}
