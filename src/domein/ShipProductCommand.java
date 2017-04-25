
package domein;

/**
 *
 * @author sebastiaan
 */
public class ShipProductCommand implements StockCommand{
    
    private StockService service;
    private String productName;

    public ShipProductCommand(StockService service, String productName) {
        this.service = service;
        this.productName = productName;
    }
    
    
    
    @Override
    public String execute() {
        return service.ship(productName);
    }

}
