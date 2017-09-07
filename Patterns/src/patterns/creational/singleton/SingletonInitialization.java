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
public class SingletonInitialization {

    private static final SingletonInitialization INSTANCE = new SingletonInitialization();

    private SingletonInitialization() {

    }

    public static SingletonInitialization getInstance() {
        return INSTANCE;
    }

}
