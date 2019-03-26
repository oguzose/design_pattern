
package creational.builder.after;

import java.awt.Color;
import java.awt.Dimension;

public class Bedroom {  
    
    private Dimension dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;


    //Aşagıdaki gibi her seyi iceren bir constructor yerine daha kullanisli olanina ihtiyacimiz var
    // Onuda su sekilde yapariz Sag click refactor -> replace constructor with builder

    public Bedroom(Dimension dimensions, int ceilingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;        
        this.isDouble = isDouble;
        this.hasEnsuite = hasEnsuite;        
    }
    
}
