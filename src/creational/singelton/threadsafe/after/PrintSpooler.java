package creational.singelton.threadsafe.after;

public class PrintSpooler {
    
    private static final PrintSpooler spooler = new PrintSpooler();
    
    private static boolean initialized = false;
    
    private PrintSpooler(){}
    
    private void init() {
        // Code to initialize our print spooler goes here
        System.out.println("buraya 1 defa girecek");
    }
    
    public static synchronized PrintSpooler getInstance() {
        
        if(initialized) return spooler;
        spooler.init();
        initialized = true;
        return spooler;
                
    }            
       
}
