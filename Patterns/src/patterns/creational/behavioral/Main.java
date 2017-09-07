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
public class Main {
    
    public static void main(String []args){
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new DinnerMenu());
        menuList.add(new PancakeMenu());
        menuList.add(new CafeMenu());
        Waitress waitress = new Waitress(menuList);
        waitress.printMenu();
    }
    
}
