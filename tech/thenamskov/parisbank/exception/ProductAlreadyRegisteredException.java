package tech.thenamskov.parisbank.exception;


public class ProductAlreadyRegisteredException extends Exception {

  public ProductAlreadyRegisteredException(String message) {
    super(message);
  }

  public String getMessage() {
    return super.getMessage();
  }
}