/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elservlet;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hugo
 */
public class generos {
     public List getBrands(String color)
    {
        List brands = new ArrayList();
        if(color.equals("amber")){
            brands.add("Jack Amber");
            brands.add("Red moose");
        }
        else{
            brands.add("jail pale Ale");
            brands.add("Gout Stout");
        }
        return(brands);
    }
}
