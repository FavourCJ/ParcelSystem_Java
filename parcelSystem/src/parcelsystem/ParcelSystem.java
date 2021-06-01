/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcelsystem;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import static parcelsystem.ParcelSystem.draw_line;

/**
 *
 * @author user
 */
public class ParcelSystem {
    public static List customer;
    public static List item;
    public static List postOffice;
   public static List itemPath;
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     customer = new ArrayList();
        item = new ArrayList();
        postOffice = new ArrayList();
        itemPath = new ArrayList();
                
        
        create_customer();
        
        new Menu().setVisible(true);
        
        System.out.printf("\n");
        create_item();
        
         System.out.printf("\n");
        create_itemPath();
        
         System.out.printf("\n");
        create_PostOffice();
        
        

    }
         
        
    
    
    public static void draw_line(int num) {
        String ln="";
        for (int i=0; i<num; i++) ln+="=";
        System.out.printf("\n"+ln);
    }
    
    
    public static void create_customer()
            
            {
                
                System.out.printf("\n Add_student()\n\n");
        
        add_customer(111, "Favour","Chapp-Jumbo","Bag111", 120 );
        add_customer(222, "Testing","Code","Book222", 121 );
        add_customer(333, "Joe","Waltar","Shoe333", 122 );
        

        System.out.printf("\n LIST CUSTOMER\n\n");
        list_customer();
        
                 
            }
    
    public static void add_customer(int cus_id, String cus_name, String cus_surname, String item_id, int item_trackingNum) {
            customer cus =new customer( cus_id, cus_name, cus_surname, item_id, item_trackingNum);
            customer.add(cus);
    }
      
    
     public static void edit_customer(int cus_id, String cus_name, String cus_surname, String item_id, int item_trackingNum) {
        
     customer cus=null;
      Boolean found=false;
      Iterator <customer> itr = customer.iterator();
      while (itr.hasNext()) {
          cus = itr.next(); 
          if(cus_id==cus.getCus_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          cus.setCus_id(cus_id);
          cus.setCus_name(cus_name);
          cus.setCus_surname(cus_surname);
          cus.setItem_id(item_id);
          cus.setItem_trackingNum(item_trackingNum);
      }
    }
    
      public static void delete_customer(int cus_id) {
         
     customer cus=null;
      Boolean found=false;
      Iterator <customer> itr = customer.iterator();
      while (itr.hasNext()) {
          cus = itr.next(); 
          if(cus_id==cus.getCus_id()) {
              found=true;
              break;
          }
      }
      if (found) customer.remove(cus);
      }
      
      
      public static void list_customer() {
      customer cus;
      
      Iterator <customer> itr = customer.iterator();
      //public customer(int cus_id, String cus_name, String cus_surname, String item_id, int item_trackingNum)
      System.out.printf("\n%10s %10s %15s %15s %10s",
              "Customer Id", "Customer Name", "Customer Surname", 
              "Item Id","Item Tracking Number");
        draw_line(90);
        
      while (itr.hasNext()) {
          cus = itr.next(); 
         
          System.out.printf("\n%10d %10s %15s %15s %10d  ",
              cus.getCus_id(), cus.getCus_name(), cus.getCus_surname(), cus.getItem_id(), cus.getItem_trackingNum() );
      }
      draw_line(90);
        
    }
   
         public static void backup_customer() throws IOException
    {
     File outfile  = new File("customer.dat");
     FileOutputStream outfilestream = new FileOutputStream(outfile);
        try (ObjectOutputStream outObjectStream = new ObjectOutputStream(outfilestream)) {
            outObjectStream.writeObject(customer);
        }
     
    }
    
    public static void retrieve_customer() throws IOException, ClassNotFoundException
    {
     File infile  = new File("customer.dat");
     FileInputStream infilestream = new FileInputStream(infile);
        try (ObjectInputStream inObjectStream = new ObjectInputStream(infilestream)) {
            customer = (ArrayList)inObjectStream.readObject();
        }
     
    }
       public static void create_item()
            
            {
                
                System.out.printf("\n ADD ITEM()\n\n");
        
        add_item(1234, "Shoe","Small","United State", 120, 11198, (float) 12.00);
        add_item(12235, "Bag","Small","United Kingdom", 121, 8976, (float) 56.00);


        System.out.printf("\n LIST ITEM\n\n");
        list_item();
        
         System.out.printf("\n EDIT ITEM\n\n");
          edit_item(0, "Bag","Small","United Kingdom", 121, 8976, (float) 56.00);
        list_item();
        
                 
            }
    
    public static void add_item(int item_trackingNum, String item_name, String item_type, String item_destination, int cus_id, int item_id, float item_weight) {
            item it =new item( item_trackingNum, item_name, item_type, item_destination, cus_id, item_id, item_weight);
            item.add(it);
    }
      
   
    public static void edit_item(int item_trackingNum, String item_name, String item_type, String item_destination, int cus_id, int item_id, float item_weight) {
        
     item it=null;
      Boolean found=false;
      Iterator <item> itr = item.iterator();
      while (itr.hasNext()) {
          it = itr.next(); 
          if(item_id==it.getItem_id()) {
              found=true;
              break;
          }
      }
      if (found) {
          it.setItem_trackingNum(item_trackingNum);
          it.setItem_name(item_name);
          it.setItem_type(item_type);
          it.setItem_destination(item_destination);
          it.setCus_id(cus_id);
          it.setItem_id(item_id);
          it.setItem_weight(item_weight);
         
      }
    }
    
      public static void delete_item(int item_id) {
         
      item it=null;
      Boolean found=false;
      Iterator <item> itr = item.iterator();
      while (itr.hasNext()) {
          it = itr.next(); 
          if(item_id==it.getItem_id()) {
              found=true;
              break;
          }
      }
      if (found) item.remove(it);
      }
      
      
      public static void list_item() {
      item it;
      
      Iterator <item> itr = item.iterator();
      //int item_trackingNum, String item_name, String item_type, String item_destination, int cus_id, String item_id, float item_weight
      System.out.printf("\n%10s %10s %15s %15s %10s %12s %12s",
              "Item Tracking Number", "Item Name", "Item Type", 
              "Item Destination","customer Id", "Item ID", "Item Weight");
        draw_line(90);
        
      while (itr.hasNext()) {
          it = itr.next(); 
         
          System.out.printf("\n%10d %10s %15s %15s %10d %12s %12f ",
              it.getItem_trackingNum(), it.getItem_name(), it.getItem_type(), it.getItem_destination(), it.getCus_id(), it.getItem_id(), it.getItem_weight() );
      }
      draw_line(90);
        
    }
      
   
public static void create_itemPath()
            
            {
        System.out.printf("\n ADD ITEM PATH()\n\n");
        
        add_itemPath( "Turkey222","99450", 111, 120 );
        add_itemPath("UK333","99450", 333, 121);
        add_itemPath("Turkey444","99450", 555, 122 );
        
        
        System.out.printf("\n LIST ITEM PATH\n\n");
        list_itemPath();
       
        
               
               
            }
    
    public static void add_itemPath(String itemPath_id, String postOffice_code, int item_id, int cus_id) {
            itemPath itP =new itemPath( itemPath_id,  postOffice_code,  item_id, cus_id);
            itemPath.add(itP);
    }
      
   
    public static void edit_itemPath(String itemPath_id, String postOffice_code, int item_id, int cus_id) {
        
     itemPath itP=null;
      Boolean found=false;
      Iterator <itemPath> itr = itemPath.iterator();
      while (itr.hasNext()) {
          itP = itr.next(); 
          if(item_id == itP.getItem_id()) {
              found=true;
              break;
          }
      }
      if (found) {
         itP.setItemPath_id(itemPath_id);
         itP.setPostOffice_code(postOffice_code);
         itP.setItem_id(item_id);
         itP.setCus_id(cus_id);
      }
    }
    
        
      public static void delete_itemPath(int item_id) {
         
        itemPath itP=null;
      Boolean found=false;
      Iterator <itemPath> itr = itemPath.iterator();
      while (itr.hasNext()) {
          itP = itr.next(); 
          if(item_id == itP.getItem_id()) {
              found=true;
              break;
          }
      }
      if (found) itemPath.remove(itP);
      }
      
      
      public static void list_itemPath() {
      itemPath itP;
      
      Iterator <itemPath> itr = itemPath.iterator();
      
      System.out.printf("\n%10s %10s %15s %15s",
             "Item Path Id", "Post Office Code", "Item Id", "Customer ID");
        draw_line(90);
        
      while (itr.hasNext()) {
          itP = itr.next(); 
         
          System.out.printf("\n%10s %10s %15s %15d ",
              itP.getItemPath_id(), itP.getPostOffice_code(), itP.getItem_id(), itP.getCus_id());
                  }
      draw_line(90);
        
    }
   

    public static void create_PostOffice()
            
            {
        System.out.printf("\n ADD POST OFFICE()\n\n");
        //  public static void add_PostOffice(float itemPrice, String postCode, float itemWeight, String postAddress)
        add_PostOffice((float)100.00, 99450, (float) 34.00, "EMU");
       

        System.out.printf("\n LIST POST OFFICE\n\n");
        list_postOffice();
        
                 
            }
    
    // public postOffice(float itemPrice, String postCode, float itemWeight, String postAddress)
    public static void add_PostOffice(float itemPrice, int postCode, float itemWeight, String postAddress) {
            postOffice po =new postOffice(  itemPrice,  postCode,  itemWeight,  postAddress);
            postOffice.add(po);
    }
      
   
    public static void edit_postOffice(float itemPrice, int postCode, float itemWeight, String postAddress) {
        
     postOffice po=null;
      Boolean found=false;
      Iterator <postOffice> itr = postOffice.iterator();
      while (itr.hasNext()) {
          po = itr.next(); 
          if(postCode == po.getPostCode()) {
              found=true;
              break;
          }
      }
      if (found) {
        
         po.setItemPrice(itemPrice);
         po.setPostCode(postCode);
         po.setItemWeight(itemWeight);
        po.setPostAddress(postAddress);
         
         
      }
    }
    
      public static void delete_postOffice(int postCode) {
         
        postOffice po=null;
      Boolean found=false;
      Iterator <postOffice> itr = postOffice.iterator();
      while (itr.hasNext()) {
          po = itr.next(); 
          if(postCode == po.getPostCode()) {
              found=true;
              break;
          }
      }
      if (found) postOffice.remove(po);
      }
      
      
      public static void list_postOffice() {
      postOffice po;
      
      Iterator <postOffice> itr = postOffice.iterator();
      
       // public postOffice(float itemPrice, String postCode, float itemWeight, String postAddress)
      System.out.printf("\n%10s %10s %15s %15s",
             "Item Price", "Post Office Code", "Item Weight", "postAddress");
        draw_line(90);
        
      while (itr.hasNext()) {
          po = itr.next(); 
         
          System.out.printf("\n%10f %10s %15f %15s ",
              po.getItemPrice(), po.getPostCode(), po.getItemWeight(), po.getPostAddress());
                  }
      draw_line(90);
        
    }
   
     
            
    }

            

