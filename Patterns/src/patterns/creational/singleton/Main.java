/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.creational.singleton;

/**
 *
 * @author Andrey
 */
public class Main {

    public static void main(String args[]) throws NoSuchMethodException {
        long time = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            Singleton.getInstance();
        }
        System.out.println("Final singleton: "+(System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            SingletonWithoutVolatile.getInstance();
        }
        System.out.println("Singleton without volatile: "+(System.currentTimeMillis() - time));
        time = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            SingletonMethodSynchronized.getInstance();
        }
        System.out.println("Singleton with method synchronized: "+(System.currentTimeMillis() - time));        
        time = System.currentTimeMillis();
        for(int i=0;i<10000000;i++){
            SingletonInitialization.getInstance();
        }
        System.out.println("Singleton initialization in static: "+(System.currentTimeMillis() - time));        
    }
    
   
    
}
