
package creational.builder.before;

import java.awt.Color;
import java.awt.Dimension;


public class Architect {
    
    public static void main(String[] args) {
        Bedroom room = new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2, 1, true, true);        
    }
    
}
