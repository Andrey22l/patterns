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
public class CafeMenuIterator implements Iterator<MenuItem>{
    
    private final Hashtable<String, MenuItem> menuitems;
    private final java.util.Iterator<MenuItem> iterator;
    public CafeMenuIterator(Hashtable<String, MenuItem> menuitems){
        this.menuitems = menuitems;
        this.iterator = menuitems.values().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public MenuItem next() {
        return iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }
    
}
