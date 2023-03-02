/** 
 * @author: A0258524Y
**/

abstract class Equipment {
  private boolean isAvailable;

  public Equipment() {
    this.isAvailable = true;
  }

  public void setAvailable() {
    this.isAvailable = true;
  }

  public void setUnavailable() {
    this.isAvailable = false;
  }

  public boolean isAvailable() {
    return this.isAvailable;
  }
  
  @Override
  abstract public String toString();

}
