
package creational.singelton.simple.before;


public class ResourceManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrintSpooler spooler = new PrintSpooler();
        System.out.println(spooler);

        PrintSpooler spooler2 = new PrintSpooler();
        System.out.println(spooler2);

        //PrintSpooler spooler = PrintSpooler.getInstance();

                          
    }

}
