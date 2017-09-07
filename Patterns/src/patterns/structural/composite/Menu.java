/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Andrey
 */
public class Menu extends MenuComponent {

    private ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;
    private Iterator iterator;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+ getName());
        System.out.println(", "+ getDescription());
        System.out.println("------------------------");
        
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()){
            MenuComponent component = (MenuComponent)iterator.next();
            component.print();
        }
    }

    @Override
    public Iterator createIterator() {
        if(iterator == null){
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
    
    

}
