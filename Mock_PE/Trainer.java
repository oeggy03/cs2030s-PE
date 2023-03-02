/** 
 * @author: A0258524Y
**/

class Trainer extends Person {
  private boolean isTraining;
  private Equipment equipmentUsed;
  
  public Trainer(String name) {
    super(name);
    this.isTraining = false;
  }

  @Override
  public String toString() {
    String str = "Trainer: " + super.toString();
    return str;
  }

  public boolean isTraining() {
    return this.isTraining;
  }

  public void startTraining(Equipment equipment) {
    this.isTraining = true;
    this.equipmentUsed = equipment;

    this.equipmentUsed.setUnavailable();
  }

  public void stopTraining() {
    this.isTraining = false;
    
    this.equipmentUsed.setAvailable();
  }

}
