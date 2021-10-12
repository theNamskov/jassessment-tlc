package tech.thenamskov.parisbank.product;


public class Stock extends Product {

  private String ticker,
                 exchange;


  public Stock(String ticker, String exchange) {
    this.ticker = ticker;
    this.exchange = exchange;
  }

  public String exchange() {
    return exchange;
  }

  public String ticker() {
    return ticker;
  }
}
