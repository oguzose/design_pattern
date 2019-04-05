
package creational.singelton.simple.after;


public class ResourceManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // PrintSpooler spooler = new PrintSpooler(); //cannot use new keyword

        PrintSpooler spooler = PrintSpooler.getInstance();
        System.out.println(spooler);

        PrintSpooler spooler2 = PrintSpooler.getInstance();
        System.out.println(spooler2);

        PrintSpooler spooler3 = PrintSpooler.getInstance();
        System.out.println(spooler3);
                          
    }

}
