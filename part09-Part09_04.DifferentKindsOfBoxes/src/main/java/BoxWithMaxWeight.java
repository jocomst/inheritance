/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box {

    private ArrayList<Item> items;
    private int maxWeight;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.currentWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : this.items) {
            if (i.equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public int currentWeight() {
        int sum = 0;
        for (Item o : this.items) {
            sum += o.getWeight();
        }
        
        return sum;
    }

}
