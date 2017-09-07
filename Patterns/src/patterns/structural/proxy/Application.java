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
public class Application {
    
    private List<Image> list = new ArrayList<>();
    
    public Application(List<Image> list){
        this.list = list;
    }
    
    public void draw(){
        for(Image image: list){
            image.draw();
        }
    }
}
