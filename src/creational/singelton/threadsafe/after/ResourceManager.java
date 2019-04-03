package creational.singelton.threadsafe.after;


public class ResourceManager {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PrintSpooler spooler = PrintSpooler.getInstance();

        // First thread
        Thread threadOne = new Thread(() -> {
            PrintSpooler s = PrintSpooler.getInstance();
            System.out.println(s);
        });

        // Second thread
        Thread threadTwo = new Thread(() -> {
            PrintSpooler s = PrintSpooler.getInstance();
            System.out.println(s);
        });

        threadOne.start();
        threadTwo.start();

    }

}
