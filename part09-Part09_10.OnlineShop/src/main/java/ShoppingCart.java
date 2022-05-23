/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String, Item> list;
    
    public ShoppingCart() {
        this.list = new HashMap<>();
    }
    
    public void add(String product, int price) {
        if (this.list.keySet().contains(product)) {
            this.list.get(product).increaseQuantity();
        } else {
            this.list.put(product, new Item(product, 1, price));
        }
    }
    
    public int price() {
        int sum = 0;
        for (Item p : this.list.values()) {
            sum += p.price();
        }
        return sum;
    }
    
    public void print() {
        for (Item p : this.list.values()) {
            System.out.println(p);
        }
    }
}
