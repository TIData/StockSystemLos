
package domein;

/**
 *
 * @author sebastiaan
 */
public class CreateProductCommand implements StockCommand{

    private StockService service;
    private String productName;
    private int quantity;

    public CreateProductCommand(StockService service, String productName, int quantity) {
        this.service = service;
        this.productName = productName;
        this.quantity = quantity;
    }
    
    
    @Override
    public String execute() {
        return service.insert(productName, quantity);
    }
    
}
