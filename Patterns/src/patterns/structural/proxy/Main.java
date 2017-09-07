/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andrey
 */
public class Main {

    public static void main(String[] args) {
        withProxy();
        //withoutProxy();
    }

    public static void withProxy() {
        ImageProxy image1 = new ImageProxy("image 1");
        ImageProxy image2 = new ImageProxy("image 2");

        List<Image> list = new ArrayList<>();
        list.add(image1);
        list.add(image2);

        Application app = new Application(list);
        System.out.println("Application setup");
        app.draw();
    }
    
    public static void withoutProxy() {
        Image image1 = new Image("image 1");
        Image image2 = new Image("image 2");

        List<Image> list = new ArrayList<>();
        list.add(image1);
        list.add(image2);

        Application app = new Application(list);
        System.out.println("Application setup");
        app.draw();
    }
}
