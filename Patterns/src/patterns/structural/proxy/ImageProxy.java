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
public class ImageProxy extends Image{
    
    private Image image;

    public ImageProxy(String url){
        super();
        this.url = url;
    }
    
    @Override
    public void draw() {
        if(image == null){
            image = new Image(this.url);
        }
        image.draw();
    }
    
    
    
    
}
