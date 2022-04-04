package proxy.cach;

public class Main {

    public static void main(String[] args) {
        var serp = new CachedExchangeRateProvider();
        for (int i = 0; i < 100; i++) {
            System.out.println("i -> " + i);
            System.out.println(serp.getAllData());
        }
         serp.getDataByCurrency("USD");
    }

}
