/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.structural.proxy;

/**
 *
 * @author Andrey
 */
public class Image {

    protected String url;
    
    public Image() {
    }
    
    public Image(String url) {
        System.out.println("Loading image.. ");
        this.url = url;
    }

    public void draw() {
        System.out.println("Drawing image.. "+url);
    }
    
}
