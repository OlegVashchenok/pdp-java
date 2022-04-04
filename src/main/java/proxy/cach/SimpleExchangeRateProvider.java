package proxy.cach;

import java.util.List;

import static proxy.cach.SQL.select;

public class SimpleExchangeRateProvider implements ExchangeRateProvider {


    @Override
    public List<CurrencyDTO> getAllData() {
        return select("select * from exchange_rate", CurrencyDTO.class);
    }

    @Override
    public CurrencyDTO getDataByCurrency(String currency) {
        return select("select * from exchange_rate where currency = '" + currency +"';", CurrencyDTO.class).get(0);
    }
}
