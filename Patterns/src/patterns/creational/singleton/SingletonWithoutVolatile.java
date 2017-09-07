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
public class SingletonWithoutVolatile {

    private static SingletonWithoutVolatile instance = null;

    private SingletonWithoutVolatile() {

    }

    public static SingletonWithoutVolatile getInstance() {
        synchronized (SingletonWithoutVolatile.class) {
            if (instance == null) {
                System.out.println("object was created");
                instance = new SingletonWithoutVolatile();
            }
        }
        return instance;
    }

}
