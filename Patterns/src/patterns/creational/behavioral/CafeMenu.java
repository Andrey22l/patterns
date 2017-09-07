/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.behavioral;

import java.util.Hashtable;

/**
 *
 * @author Andrey
 */
public class CafeMenu implements Menu {

    private final Hashtable<String, MenuItem> menuItems;

    public CafeMenu() {

        menuItems = new Hashtable<>();

        addItem("CafeMenu 1", "some food", false, 5.50);
        addItem("CafeMenu 2", "some food", false, 1.50);
        addItem("CafeMenu 3", "some food", false, 3.50);
        addItem("CafeMenu 4", "some food", true, 8.50);
        addItem("CafeMenu 5", "some food", false, 7.50);
        addItem("CafeMenu 6", "some food", false, 4.35);
    }

    @Override
    public Iterator<MenuItem> iterator() {
        return new CafeMenuIterator(menuItems);
    }

    private void addItem(String name, String description, boolean isVegiterian, double price) {
        MenuItem item = new MenuItem();
        item.setName(name);
        item.setDescription(description);
        item.setVegeterian(isVegiterian);
        item.setPrice(price);
        menuItems.put(name, item);
    }
}
