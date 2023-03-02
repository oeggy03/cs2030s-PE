/** 
 * @author: A0258524Y
**/

class Treadmill extends Equipment {

  private double speed;

  public Treadmill(double speed) {
    super();
    this.speed = speed;
  }

  @Override
  public String toString() {
    String str = "Equipment: Treadmill at speed " + speed;
    return str;
  }
}
