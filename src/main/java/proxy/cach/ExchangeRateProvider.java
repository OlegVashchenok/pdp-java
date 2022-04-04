package proxy.cach;

import java.util.List;

public interface ExchangeRateProvider {

    List<CurrencyDTO> getAllData();

    CurrencyDTO getDataByCurrency(String query);


}
