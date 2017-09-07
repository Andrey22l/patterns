/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.composite;

/**
 *
 * @author Andrey
 */
public class Main {
 
    public static void main(String [] args){
        MenuComponent menu1 = new Menu("Menu 1", "Breakfast");
        MenuComponent menu2 = new Menu("Menu 2", "Lunch");
        MenuComponent menu3 = new Menu("Menu 3", "Dinner");
        MenuComponent menu4 = new Menu("Menu 4", "Dessert");
        
        MenuComponent allMenu = new Menu("All Menu", "combined");
        
        allMenu.add(menu1);
        allMenu.add(menu2);
        allMenu.add(menu3);
        
        menu3.add(new MenuItem("Item 1", "submenu menu 3", false, 6.33));
        menu3.add(menu4);
        
        menu4.add(new MenuItem("Item 1", "submenu menu 4", false, 5.25));
        
        Waitress waitress = new Waitress(allMenu);
        
        waitress.printMenu();
        
    }
}
