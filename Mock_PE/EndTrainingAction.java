/** 
 * @author: A0258524Y
**/

class EndTrainingAction extends Action {
  private Trainer trainer;
  
  public EndTrainingAction(Trainer trainer) {
    this.trainer = trainer;
    this.trainer.stopTraining();  
  }

  @Override
  public String toString() {
    return this.trainer + " has finished training";
  }
 
}

