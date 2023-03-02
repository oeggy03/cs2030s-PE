/** 
 * @author: A0258524Y
**/

class Dumbbell extends Equipment {

  private double weight;

  public Dumbbell(double weight) {
    super();
    this.weight = weight;
  }

  @Override
  public String toString() {
    String str = "Equipment: Dumbbell with weight " + this.weight;
    return str;
  }
}
