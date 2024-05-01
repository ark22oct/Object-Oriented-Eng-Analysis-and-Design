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
public class FoodComponent {
    
    private String foodName;
    
    public FoodComponent(String foodName){
        this.foodName = foodName;
    }
    
    
    public void print(int level){
        System.out.println(foodName);
    }
    
    
    public String getName(){
        return foodName;
    }
}
