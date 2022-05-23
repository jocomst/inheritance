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

public class ChangeHistory {
    private ArrayList<Double> list;
    
    public ChangeHistory() {
        this.list = new ArrayList<Double>();
    }
    
    public void add(double status) {
        this.list.add(status);
    }
    
    public void clear() {
        this.list.clear();
    }
    
    public String toString() {
        return this.list.toString();
    }
    
    public double maxValue() {
        double largest = this.list.get(0);
        
        for (Double d : this.list) {
            if (d > largest) largest = d;
        }
        
        return largest;
    }
    
    public double minValue() {
        double smallest = this.list.get(0);
        
        for (Double d : this.list) {
            if (d < smallest) smallest = d;
        }
        
        return smallest;
    }
    
    public double average() {
        double sum = 0.0;
        
        for (Double d : this.list) {
            sum += d;
        }
        
        return sum / (double) this.list.size();
    }
    
    
}
