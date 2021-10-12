package tech.thenamskov.parisbank.product;


public class Stock extends Product {

  private String ticker,
                 exchange;

  

  public Stock(String exchange, String ticker) {
    this.exchange = exchange;
    this.ticker = ticker;
    price(exchange, ticker);
    setId();
  }

  public String exchange() {
    return exchange;
  }

  public String ticker() {
    return ticker;
  }

  public double price(String exchange, String ticker) {
    if(exchange != "" && ticker != "")
    setValue(500.00);
    return value();
  }
}
