/** 
 * @author: A0258524Y
**/

class Customer extends Person {
  private boolean isTraining;

  public Customer(String name) {
    super(name);
    this.isTraining = false;
  }

  @Override
  public String toString() {
    String str = "Customer: " + super.toString();
    return str;
  }

  public boolean isTraining() {
    return this.isTraining;
  }
  
  public void startTraining() {
    this.isTraining = true;
  }

  public void stopTraining() {
    this.isTraining = false;
  }


}
