package domein;

public class CommandFactory {

    public static StockCommand createCommand(String[] arguments,
            StockService stockService) {
        try {
            switch (arguments[0].toLowerCase()) {
                case "updatequantity":
                    return new UpdateQuantityCommand(
                            stockService, arguments[1], Integer.parseInt(arguments[2]));
                case "shipproduct":
                    return new ShipProductCommand(stockService, arguments[1]);
                case "createproduct":
                    return new CreateProductCommand(stockService, arguments[1],
                            Integer.parseInt(arguments[2]));
                case "showstock":
                    return new ShowStockCommand(stockService);
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            return new NoCommand(arguments.length > 0 ? String.format("%s called with invalid arguments", arguments[0]) : "No command arguments provided");
        }

        return new NoCommand(arguments[0]);
    }
}
