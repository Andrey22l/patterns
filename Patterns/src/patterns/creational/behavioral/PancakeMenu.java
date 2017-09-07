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
public class PancakeMenu implements Menu {

    private ArrayList<MenuItem> items = null;

    public PancakeMenu() {
        items = new ArrayList<>();

        addItem("Pancake 1", "some food", false, 25.50);
        addItem("Pancake 2", "some food", false, 15.50);
        addItem("Pancake 3", "some food", false, 19.50);
        addItem("Pancake 4", "some food", true, 8.50);
        addItem("Pancake 5", "some food", false, 17.50);
        addItem("Pancake 6", "some food", false, 14.35);
    }

    @Override
    public Iterator iterator() {
        return new PancakeMenuIterator(items);
    }

    private void addItem(String name, String description, boolean isVegiterian, double price) {
        MenuItem item = new MenuItem();
        item.setName(name);
        item.setDescription(description);
        item.setVegeterian(isVegiterian);
        item.setPrice(price);
        items.add(item);
    }
}
