/** 
 * @author: A0258524Y
**/

class StartTrainingAction extends Action {
  private Customer customer;
  private Trainer trainer;
  private Equipment equipment;
  
  public StartTrainingAction(Customer customer, Trainer trainer,
      Equipment equipment) {
    this.customer = customer;
    this.trainer = trainer;
    this.equipment = equipment;

    this.trainer.startTraining(this.equipment);
    this.customer.startTraining();
  }

  @Override
  public String toString() {
    return this.trainer + " training " + this.customer + " using " + this.equipment;
  }
 
}

