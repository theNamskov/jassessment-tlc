package tech.thenamskov.parisbank.product;


public class Future extends Product {

  private String exchange,
                 contractCode;
  
  private int month,
              year;

  public Future(String exchange, String contractCode, int month, int year) {
    this.exchange = exchange;
    this.contractCode = contractCode;
    this.month = month;
    this.year = year;
  }

  public String exchange() {
    return exchange;
  }

  public String contractCode() {
    return contractCode;
  }

  public int month() {
    return month;
  }

  public int year() {
    return year;
  }

  public double price(String exchange, String contractCode, int month, int year) {
    if(exchange != "" && contractCode != "") {
      double val = 0.00;
      if(month == 11) val+=40;
      val += 800;

      setValue(val);
    }

    return value();
  }
}