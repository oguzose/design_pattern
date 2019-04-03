
package creational.singelton.simple.before;

import creational.singelton.simple.after.PrintSpooler;

public class ResourceManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // PrintSpooler spooler = new PrintSpooler(); cannot use new keyword

        PrintSpooler spooler = PrintSpooler.getInstance();

                          
    }

}
