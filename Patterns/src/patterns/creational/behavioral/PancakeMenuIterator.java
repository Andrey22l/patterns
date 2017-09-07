/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.behavioral;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class PancakeMenuIterator implements Iterator<MenuItem> {

    private ArrayList<MenuItem> items = null;
    private int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position++);
        return item;
    }

}
