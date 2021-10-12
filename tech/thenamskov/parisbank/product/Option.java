package tech.thenamskov.parisbank.product;


public class Option extends Product {

  private String exchange,
                 ticker;
  
  private int validForDays;

  public Option(String exchange, String ticker, int validForDays) {
    this.exchange = exchange;
    this.ticker = ticker;
    this.validForDays = validForDays;
  }

  public String exchange() {
    return exchange;
  }

  public String ticker() {
    return ticker;
  }

  public int validForDays() {
    return validForDays;
  }
}