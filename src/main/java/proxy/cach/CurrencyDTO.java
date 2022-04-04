package proxy.cach;


import org.jdbi.v3.core.mapper.reflect.ColumnName;
import org.jdbi.v3.core.mapper.reflect.JdbiConstructor;

public class CurrencyDTO {
    private String currency;
    private int sell;
    private int bue;


    @JdbiConstructor
    public CurrencyDTO(@ColumnName("currency") String currency, @ColumnName("sell") int sell, @ColumnName("buy") int bue) {
        this.currency = currency;
        this.sell = sell;
        this.bue = bue;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setSell(int sell) {
        this.sell = sell;
    }

    public void setBue(int bue) {
        this.bue = bue;
    }

    public String getCurrency() {
        return currency;
    }

    public int getSell() {
        return sell;
    }

    public int getBue() {
        return bue;
    }

    @Override
    public String toString() {
        return "CurrencyDTO{" +
                "currency='" + currency + '\'' +
                ", sell=" + sell +
                ", bue=" + bue +
                '}';
    }
}
