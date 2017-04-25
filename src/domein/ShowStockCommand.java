package domein;

/**
 *
 * @author sebastiaan
 */
public class ShowStockCommand implements StockCommand {

    private StockService service;

    public ShowStockCommand(StockService service) {
        this.service = service;
    }

    @Override
    public String execute() {
        return String.format("DATABASE : stockstatus%s%s%s",
                System.lineSeparator(), service.productenView(), System.lineSeparator());

    }

}
