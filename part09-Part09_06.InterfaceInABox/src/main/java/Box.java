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

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> list;

    public Box(double capacity) {
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }

    public void add(Packable pack) {
        double sum = this.weight();

        if (sum + pack.weight() <= this.capacity) {
            this.list.add(pack);
        }

    }

    public double weight() {
        if (this.list.size() > 0) {
            double sum = 0.0;
            for (Packable p : this.list) {
                sum += p.weight();
            }
            return sum;
        }

        return 0.0;
    }

    @Override
    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + this.weight() + " kg";
    }
}
