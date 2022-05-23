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

public class OneItemBox extends Box {

    private boolean maxed;
    private ArrayList<Item> list;

    public OneItemBox() {
        this.maxed = false;
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (!this.maxed) {
            this.list.add(item);
        }
        this.maxed = true;
    }

    @Override
    public boolean isInBox(Item item) {
        return item != null && this.list.contains(item);
    }
}
