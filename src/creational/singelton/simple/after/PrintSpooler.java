package creational.singelton.simple.after;

public class PrintSpooler {
    
    private static PrintSpooler spooler;
    
    private static boolean initialized = false;
    
    private PrintSpooler(){}
    
    private void init() {
        // Code to initialize our print spooler goes here
        System.out.println("buraya bir defa girecek" + spooler);
    }
    
    public static PrintSpooler getInstance() {
        
        if(initialized) return spooler;
        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
                
    }            
       
}
