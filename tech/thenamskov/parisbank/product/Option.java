package tech.thenamskov.parisbank.product;


public class Option extends Product {

  private String exchange,
                 ticker;
  
  private int validForDays;

  public Option(String exchange, String ticker, int validForDays) {
    this.exchange = exchange;
    this.ticker = ticker;
    this.validForDays = validForDays;
    price(exchange, ticker, validForDays);
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

  public double price(String exchange, String ticker, int validForDays) {
    if(exchange != "" && ticker != "") {
      if(validForDays > 0) {
        if(validForDays > 10) {
          setValue(400.00);
        }

        if(validForDays < 10) {
          setValue(200.00);
        }

      } else setValue(100.00);
    }

    return value();
  }
}