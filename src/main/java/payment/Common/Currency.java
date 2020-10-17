package payment.Common;

public enum Currency {
    RUB("P"),
    EUR("$"),
    USD("&");
        private String symbol;

        Currency(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}


