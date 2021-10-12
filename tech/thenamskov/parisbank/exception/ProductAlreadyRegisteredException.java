package tech.thenamskov.parisbank.exception;


public class ProductAlreadyRegisteredException extends Exception {

  public ProductAlreadyRegisteredException(String id) {
    super("The identified product "+id+" exists.");
  }

  public String getMessage() {
    return super.getMessage();
  }
}