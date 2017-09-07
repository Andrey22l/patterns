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
public class SingletonMethodSynchronized {

    private static SingletonMethodSynchronized instance = null;

    private SingletonMethodSynchronized() {

    }

    public static synchronized SingletonMethodSynchronized getInstance() {
        if (instance == null) {
            System.out.println("object was created");
            instance = new SingletonMethodSynchronized();
        }
        return instance;
    }

}
