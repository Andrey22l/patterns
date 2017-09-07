/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.behavioral;

/**
 *
 * @author Andrey
 */
public class DinnerMenu implements Menu{

    private static final int MAX_ITEMS = 6;
    private MenuItem[] items = null;
    private int numberOfItems = 0;

    public DinnerMenu() {
        items = new MenuItem[MAX_ITEMS];

        addItem("Dish 1", "some food", false, 15.50);
        addItem("Dish 2", "some food", false, 5.50);
        addItem("Dish 3", "some food", false, 9.50);
        addItem("Dish 4", "some food", true, 18.50);
        addItem("Dish 5", "some food", false, 7.50);
        addItem("Dish 6", "some food", false, 4.35);
    }

    @Override
    public Iterator iterator() {
        return new DinnerMenuIterator(items);
    }

    private void addItem(String name, String description, boolean isVegiterian, double price) {
        if (numberOfItems > MAX_ITEMS) {
            throw new IndexOutOfBoundsException("Array is full");
        } else {
            MenuItem item = new MenuItem();
            item.setName(name);
            item.setDescription(description);
            item.setVegeterian(isVegiterian);
            item.setPrice(price);
            
            items[numberOfItems++] = item;
        }

    }
}
