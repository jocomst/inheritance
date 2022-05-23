
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */

public class Herd implements Movable{
    private ArrayList<Movable> list;
    
    public Herd() {
        this.list = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable m : this.list) {
            m.move(dx, dy);
        }
    }
    
    public String toString() {
        String s = "";
        for (Movable m : this.list) {
            s+= m + "\n";
        }
        
        return s;
    }
    
}
