
package domein;

/**
 *
 * @author sebastiaan
 */
public class NoCommand implements StockCommand{

    private String name;
    
    public NoCommand(String name) {
        this.name = name;
    }
    
    

    @Override
    public String execute() {
        return "Ongekende opdracht";
    }

}
