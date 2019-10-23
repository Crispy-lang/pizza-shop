/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzaconfigapp;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import model.OptionSet;
import model.PizzaConfig;

/**
 *
 * @author tay
 */
public class PizzaConfigApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      menu();
    } 
    public static void menu(){
         OptionSet opset=new OptionSet();
        
        OptionSet.Option sizeopt1= opset.new Option();
        OptionSet.Option sizeopt2= opset.new Option();
        OptionSet.Option sizeopt3= opset.new Option();
        
        OptionSet.Option deliveryopt1= opset.new Option();
        OptionSet.Option deliveryopt2= opset.new Option();
        
        OptionSet.Option meatopt1= opset.new Option();
        OptionSet.Option meatopt2= opset.new Option();
        OptionSet.Option meatopt3= opset.new Option();
        OptionSet.Option meatopt4= opset.new Option();
        
        OptionSet.Option vegopt1= opset.new Option();
        OptionSet.Option vegopt2= opset.new Option();
        OptionSet.Option vegopt3= opset.new Option();
        OptionSet.Option vegopt4= opset.new Option();
        
        OptionSet.Option cheeseopt1= opset.new Option();
        OptionSet.Option cheeseopt2= opset.new Option();
        OptionSet.Option cheeseopt3= opset.new Option();
        
        
//       Options 

//        size-option
        sizeopt1.setName("Small");
        sizeopt1.setPrice(0);
        
        sizeopt2.setName("Medium");
        sizeopt2.setPrice(2000);
        
        sizeopt3.setName("Large");
        sizeopt3.setPrice(3500);
        
//        delivery-option
        deliveryopt1.setName("Take-away");
        deliveryopt1.setPrice(500);
        
        deliveryopt2.setName("Eat-in");
        deliveryopt2.setPrice(0);
        
//        meat-option
        meatopt1.setName("beef");
        meatopt1.setPrice(1500);
        
        meatopt2.setName("peperoni");
        meatopt2.setPrice(800);
        
        meatopt3.setName("anchovy");
        meatopt3.setPrice(600);
        
        meatopt4.setName("ham");
        meatopt4.setPrice(500);
        
//        veg-option
        vegopt1.setName("mushroom");
        vegopt1.setPrice(500);
        
        vegopt2.setName("Onion");
        vegopt2.setPrice(500);
        
        vegopt3.setName("black-olives");
        vegopt3.setPrice(500);
        
        vegopt4.setName("pineaple");
        vegopt4.setPrice(1000);
        
//        cheese-option
        cheeseopt1.setName("regular");
        cheeseopt1.setPrice(500);
        
        cheeseopt2.setName("no-cheese");
        cheeseopt2.setPrice(0);
        
        cheeseopt3.setName("extra-cheese");
        cheeseopt3.setPrice(1500);
        

        
        
        
        
//       assigning options to lists  

        List<OptionSet.Option> sizeoptionlist=new ArrayList<>();
        sizeoptionlist.add(sizeopt1);
        sizeoptionlist.add(sizeopt2);
        sizeoptionlist.add(sizeopt3);
        
        List<OptionSet.Option> deliveryoptionlist=new ArrayList<>();
        deliveryoptionlist.add(deliveryopt1);
        deliveryoptionlist.add(deliveryopt2);
        
        List<OptionSet.Option> meatoptionlist=new ArrayList<>();
        meatoptionlist.add(meatopt1);
        meatoptionlist.add(meatopt2);
        meatoptionlist.add(meatopt3);
        meatoptionlist.add(meatopt4);
         
        List<OptionSet.Option> vegoptionlist=new ArrayList<>();
        vegoptionlist.add(vegopt1);
        vegoptionlist.add(vegopt2);
        vegoptionlist.add(vegopt3);
        vegoptionlist.add(vegopt4);
        
        List<OptionSet.Option> cheeseoptionlist=new ArrayList<>();
        cheeseoptionlist.add(cheeseopt1);
        cheeseoptionlist.add(cheeseopt2);
        cheeseoptionlist.add(cheeseopt3);
         
        
//        OptionSets
        
        OptionSet sizeopset=new OptionSet();
        sizeopset.setName("Size-choice");
        sizeopset.setChoices(sizeoptionlist);
        
        OptionSet deliveryopset=new OptionSet();
        deliveryopset.setName("delivery-choice");
        deliveryopset.setChoices(deliveryoptionlist);
        
        OptionSet meatopset=new OptionSet();
        meatopset.setName("Meat-Choice");
        meatopset.setChoices(meatoptionlist);
        
        OptionSet vegopset=new OptionSet();
        vegopset.setName("Veg-choice");
        vegopset.setChoices(vegoptionlist);
        
        OptionSet cheeseopset=new OptionSet();
        cheeseopset.setName("Cheese-choice");
        cheeseopset.setChoices(cheeseoptionlist);
                
   
//       assigning OptionSets to lists  

        List<OptionSet> sizemenu=new ArrayList<>();
        sizemenu.add(sizeopset);
        
        List<OptionSet> deliverymenu=new ArrayList<>();
        deliverymenu.add(deliveryopset);
        
        List<OptionSet> meatmenu=new ArrayList<>();
        meatmenu.add(meatopset);
        
        List<OptionSet> vegmenu=new ArrayList<>();
        vegmenu.add(vegopset);
        
        List<OptionSet> cheesemenu=new ArrayList<>();
        cheesemenu.add(cheeseopset);
        
        
//     Pizzeria Menu
       Scanner sc = new Scanner(System.in);
       int pick;
       do{
       System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
       System.out.println("\t\t\tPizzeria app.");
       System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
       
      System.out.println("\t\t.1.Pizza Orders.");
      System.out.println("\t\t.2.Pizza Update Order.");
      System.out.println("\t\t.3.Pizza Order undo.");
      System.out.println("\t\t.4.Pizza Order view.");
      System.out.println("\t\t.6.Quit.");
      
      
      System.out.println("\t\tpick a pizza command..\n");
      pick=sc.nextInt();
    
              double total=0,meatprice=0,cheesePrice=0,vegPrice=0,sizePrice=0,deliveryPrice=0;
              int meat,beef=0,pep=0,anch=0,ham=0;
              int mushroom=0,onion=0,blackolives=0,pineapple=0;
              String sizes= "small";
              String delivery= "No-Choice";
      switch(pick){
              
          case 1:
              
              do{
              
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t\tPizzeria app -> Meat-Options.");
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t"+meatmenu);
              System.out.println("\t\t[1]beef,[2]peperoni,[3]anchovy,[4]ham,[5]next_optionSet");
              meat= sc.nextInt();
              if(meat==1){
                meatprice=meatopt1.getPrice();
                total+=meatprice;
                beef++;
              }
              else if(meat==2){
                meatprice += meatopt2.getPrice();
                total+=meatprice;
                pep++;
              }
              else if(meat==3){
                meatprice += meatopt3.getPrice();
                total+=meatprice;
                anch++;
              }
              else if(meat==4){
                meatprice += meatopt4.getPrice();
                total+=meatprice;
                ham++;
              }
              }while(meat!=5);
              System.out.println("You have Chosen "+beef+" beef,"+pep+" peperoni,"+anch+" anchovy,"+ham+" ham.");
          case 2:
              String resp= "n";
              int cheese;
              do{
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t\tPizzeria app -> cheese-Options.");
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++"); 
              System.out.println("\t\t"+cheesemenu);
              
              System.out.println("\t\t[1]Regular,[2]no-cheese,[3]extra-cheese,[4]next_optionSet");
              cheese= sc.nextInt();
              if(cheese==1){
                  cheesePrice = cheeseopt1.getPrice();
                  total+=cheesePrice;
              }
              else if(cheese==2){
                  cheesePrice = cheeseopt2.getPrice();
                  total+=cheesePrice;
              }
              else if(cheese==3){
                  cheesePrice = cheeseopt3.getPrice();
                  total+=cheesePrice;
              }
              
              }while(cheese!=4);
              
          case 3:
              int veg;
              
              do{
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t\tPizzeria app -> veg-Options.");
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++"); 
              System.out.println("\t\t"+vegmenu);
              System.out.println("\t\t[1]mushroom,[2]onion,[3]black-olives,[4]pineapple,[5]next_optionSet");
              veg= sc.nextInt();
              if(veg==1){
                    vegPrice+=vegopt1.getPrice();
                    total+=vegPrice;
                    mushroom++;
              }
              else if(veg==2){
                    vegPrice+=vegopt2.getPrice();
                    total+=vegPrice;
                    onion++;
              }
              else if(veg==3){
                    vegPrice+=vegopt3.getPrice();
                    total+=vegPrice;
                    blackolives++;
              }
              else if(veg==4){
                    vegPrice+=vegopt4.getPrice();
                    total+=vegPrice;
                    pineapple++;
              }
              }while(veg!=5);
          
          case 4:
              int size;
              
              
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t\tPizzeria app -> Size-Options.");
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++"); 
              System.out.println("\t\t"+sizemenu);
              System.out.println("\t\t[1]Small,[2]Medium,[3]Large,[4]next_optionSet");
              size= sc.nextInt();
              if(size==1){
                  sizePrice=sizeopt1.getPrice();
                  total+=sizePrice;
              }
              else if(size==2){
                   sizePrice=sizeopt2.getPrice(); 
                   total+=sizePrice;
                   sizes="Medium";
              }
              else if(size==3){
                   sizePrice=sizeopt3.getPrice();
                   total+=sizePrice;
                   sizes="Large";
              }
             
          case 5:
              int del;
              do{
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++");
              System.out.println("\t\t\tPizzeria app -> delivery-Options.");
              System.out.println("\t\t\t++++++++++++++++++++++++++++++++"); 
              System.out.println("\t\t"+deliverymenu);
              System.out.println("\t\t[1]Take-Away,[2]Eat-in,[3]next_optionSet");
              del= sc.nextInt();
              if(del==1){
                    deliveryPrice+=deliveryopt1.getPrice();
                            
                    delivery="Take-Away";
                    total+=deliveryPrice;
              }
              else if(del==2){
                   deliveryPrice+=deliveryopt2.getPrice();
                   delivery="Eat-in";
                   total+=deliveryPrice;
              }
             
              }while(del!=3);
          
          default:
              System.out.println("\n");
               
      }
      System.out.println("\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
      System.out.println("\t\tMeat-choice: "+beef+" beef,"+pep+" peperoni,"+anch+" anchovy,"+ham+" ham.");
      System.out.println("\t\tVeg-choice: "+mushroom+" mushroom,"+onion+" onion,"+blackolives+" blackolives,"+pineapple+" pineapple.");
      System.out.println("\t\tSize-choice: "+sizes);
      System.out.println("\t\tdelivery-choice: "+delivery+"\n");
      System.out.println("\t\t\t\tTotal Price:"+total+" Rwf.");
      System.out.println("\t\t++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
      
       try{
    // Create file 
           FileWriter fstream = new FileWriter(System.currentTimeMillis() + "pizzaOrder.txt");
           BufferedWriter out = new BufferedWriter(fstream);
           out.write("\t\tMeat-choice: "+beef+" beef,"+pep+" peperoni,"+anch+" anchovy,"+ham+" ham.");
           out.write("\t\tVeg-choice: "+mushroom+" mushroom,"+onion+" onion,"+blackolives+" blackolives,"+pineapple+" pineapple.");
           out.write("\t\tSize-choice: "+sizes);
           out.write("\t\tdelivery-choice: "+delivery+"\n");
           out.write("\t\t\t\tTotal Price:"+total+" Rwf.");
    //Close the output stream
           out.close();
         }catch (Exception e){//Catch exception if any
             System.err.println("Error: " + e.getMessage());
         }
      
       
    }while(pick!=6);
       }
    
    }
    



