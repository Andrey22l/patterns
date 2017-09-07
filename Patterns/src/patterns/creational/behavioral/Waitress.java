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
public class Waitress {
    
    private final ArrayList<Menu> menuList;

    public Waitress(ArrayList<Menu> menuList) {
        this.menuList = menuList;
    }
    
    public void printMenu(){
        for(Menu menu: menuList){
            if(menu instanceof DinnerMenu){
                System.out.println("--Dinner menu--");
            }
            if(menu instanceof PancakeMenu){
                System.out.println("--Pancake menu--");
            }
            if(menu instanceof CafeMenu){
                System.out.println("--Cafe menu--");
            }
            
            printMenu(menu.iterator());
        }
    }
    
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem)iterator.next();
            System.out.println(item.getName()+"  "+item.getPrice());
        }
    }
}
