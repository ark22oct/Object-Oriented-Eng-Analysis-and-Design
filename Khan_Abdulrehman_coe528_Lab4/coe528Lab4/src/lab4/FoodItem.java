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
public class FoodItem extends FoodComponent {
    
    private double foodPrice;
    
    public FoodItem(String foodName, double foodPrice){
        super(foodName);
        this.foodPrice = foodPrice;
    }
    
    public double getPrice(){
        return foodPrice;
    }
    
    public void print (int level){
        
        String space = "";
        
        for(int i=0; i<level; i++){
            space = space + "\t";
        }
        System.out.printf("%s FoodItem: %s, %.1f\n",space,getName(),getPrice());
    }
}
