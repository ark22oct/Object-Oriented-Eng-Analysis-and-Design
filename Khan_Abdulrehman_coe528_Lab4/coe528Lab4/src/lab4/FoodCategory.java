/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Abdulrehman
 */

import java.util.ArrayList;


public class FoodCategory extends FoodComponent {
    
    private ArrayList<FoodCategory> foodCategories = new ArrayList<>();
    private ArrayList<FoodItem> foodItems = new ArrayList<>();
    
    
    public FoodCategory(String foodName){
        super(foodName);
    }
    
    public double getPrice(){
        
        double foodPrice=0;
        
        for (FoodItem f : foodItems){
            foodPrice = foodPrice + f.getPrice();
        }
        return foodPrice;
    }
      
    public void add(FoodComponent component){
        if (component instanceof FoodItem){
            foodItems.add((FoodItem) component);
        }
        
        else if (component instanceof FoodCategory){
            foodCategories.add((FoodCategory) component);
        }
    }
    
    public double totalFoodPrice(){
        
        double totalFoodPrice =0;
        
        for (FoodItem f : foodItems){
            totalFoodPrice = totalFoodPrice + f.getPrice();
        }
        
        for (FoodCategory f : foodCategories){
            totalFoodPrice = totalFoodPrice + f.totalFoodPrice();   
        }
        return totalFoodPrice;
    }
     
    public void print (int level){
        
        String s = "";
        
        for (int i=0; i<level; i++){
            s = s + "\t";
        }
        
        double totalFoodPrice = totalFoodPrice();
        
        for (FoodItem f : foodItems){
            totalFoodPrice = totalFoodPrice + f.getPrice();
        }
        
        //System.out.println("\t" + "Food Category" + "" + "(" + getName() + "," + "" + totalFoodPrice() + ")" + " " + "contains: \n" );
        System.out.printf("%s FoodCategory (%s, %.1f) contains: \n",s, getName(), totalFoodPrice());
        
        
        for (FoodCategory f : foodCategories){
            f.print(level +1);
        }
        for (FoodItem f : foodItems){
            f.print (level +1);
        }
    }
    
        
}
