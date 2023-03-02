/** 
 * @author: A0258524Y
**/

class EnterAction extends Action {
  private Customer customer;
  
  public EnterAction(Customer customer) {
    this.customer = customer;  
  }

  @Override
  public String toString() {
    return customer + " can enter";
  }
}

