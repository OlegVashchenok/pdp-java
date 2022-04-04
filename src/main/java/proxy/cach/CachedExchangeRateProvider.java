package proxy.cach;

import java.util.List;

public class CachedExchangeRateProvider implements ExchangeRateProvider {

    private SimpleExchangeRateProvider simpleExchangeRateProvider;
    private List<CurrencyDTO> currencyList;
    private static int counter = 0;

    public CachedExchangeRateProvider() {
        simpleExchangeRateProvider = new SimpleExchangeRateProvider();
    }


    private void revalidateCache() {
        currencyList = simpleExchangeRateProvider.getAllData();
    }

    @Override
    public List<CurrencyDTO> getAllData() {
        counter++;
        if ((currencyList == null) || (counter % 10 == 0)) revalidateCache();
        return currencyList;
    }

    @Override
    public CurrencyDTO getDataByCurrency(String currency) {
        counter++;
        if ((currencyList == null) || (counter % 10 == 0)) revalidateCache();
        return currencyList.stream().filter(cur -> cur.getCurrency().equals(currency)).findAny().get();
    }
}
