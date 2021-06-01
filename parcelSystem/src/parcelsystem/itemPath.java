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
public class itemPath 
{
    private String itemPath_id;
    private String postOffice_code;
    private int item_id;
    private int cus_id;

    public String getItemPath_id() {
        return itemPath_id;
    }

    public void setItemPath_id(String itemPath_id) {
        this.itemPath_id = itemPath_id;
    }

    public String getPostOffice_code() {
        return postOffice_code;
    }

    public void setPostOffice_code(String postOffice_code) {
        this.postOffice_code = postOffice_code;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    public int getCus_id() {
        return cus_id;
    }

    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }

    
    
    public itemPath(String itemPath_id, String postOffice_code, int item_id, int cus_id) {
        this.itemPath_id = itemPath_id;
        this.postOffice_code = postOffice_code;
        this.item_id = item_id;
        this.cus_id = cus_id;
    }
    
    
}
