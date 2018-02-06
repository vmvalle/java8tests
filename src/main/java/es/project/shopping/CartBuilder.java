package es.project.shopping;

import java.util.ArrayList;

public class CartBuilder {

    ArrayList<Integer> prices = new ArrayList<Integer>();
    
    public CartBuilder(int size){
        for(int i = 0; i < size; i++){
            Double random = Math.random()*100+1;
            prices.add(random.intValue());
        }
    }
 
    public CartBuilder(int size, int value){
        for(int i = 0; i < size; i++){
        	prices.add(value);
        }
    }
 
    public ShoppingCart build(){
        return new ShoppingCart(this.prices);
    }
 
    public CartBuilder add(Integer newValue){
    	prices.add(newValue);
        return this;
    }
    
    public CartBuilder addMultiple(int size, int value){
        for(int i = 0; i < size; i++){
            prices.add(value);
        }

        return this;
    }
    
}
