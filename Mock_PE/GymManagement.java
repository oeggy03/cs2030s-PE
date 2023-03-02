/** 
 * @author: A0258524Y
**/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class GymManagement {
  //array of equipment
  private Equipment[] equipment;

  //array of people
  private Person[] people;


  public static int maxCapacity;
  public static int currentCapacity;
  
  private static final int TREADMILL = 0;
  private static final int DUMBBELL = 1;
  private static final int TRAINER = 0;
  private static final int CUSTOMER = 1;
  private static final int ENTER = 0;
  private static final int START = 1;
  private static final int FINISH = 2;
  
  
  public void printEquipment() {
    for (int i = 0; i < equipment.length; i++) {
      System.out.println(equipment[i]);
    }
  }


  public void printPeople() {
    for (int i = 0; i < people.length; i++) {
      Person person = people[i];
      System.out.println(person);
    }
  }


  public GymManagement() {
    Scanner scanner = new Scanner(System.in);
    
    // Read the numebr of Equipment
    int numEquipment = scanner.nextInt();

    //Initialize the array of Equipment
    this.equipment = new Equipment[numEquipment];
    
    //creates the equipment with their properties. puts them in array of equipment
    for (int i = 0; i < numEquipment; i++) {
      int equipmentType = scanner.nextInt(); //which equipment
      double property = scanner.nextDouble(); //speed or weight

      if (equipmentType == GymManagement.TREADMILL) {
        this.equipment[i] = new Treadmill(property);
      } else if (equipmentType == GymManagement.DUMBBELL) {
        this.equipment[i] = new Dumbbell(property);
      }
    }
    
    // Read people
    int numPeople = scanner.nextInt();  

    //Initialize people array
    this.people = new Person[numPeople];
    
    for (int i = 0; i < numPeople; i++) {
      //the kind of person trainer or customer
      int peopleKind = scanner.nextInt();
      String personName = scanner.next();

      if (peopleKind == GymManagement.TRAINER) {
        this.people[i] = new Trainer(personName);
      } else if (peopleKind == GymManagement.CUSTOMER) {
        this.people[i] = new Customer(personName);
      }
    }
    
    // Read Gym Capacity
    this.maxCapacity = scanner.nextInt();
    this.currentCapacity = 0;
    
    // Read Actions
    int numActions = scanner.nextInt();

    for (int i = 0; i < numActions; i++) {
      int action = scanner.nextInt();
      if (action == GymManagement.ENTER) {
        int customerIndex = scanner.nextInt();

        //Retrieve the customer
        Customer customer = (Customer) this.people[customerIndex];

        if (currentCapacity == maxCapacity) {
          System.out.println(customer + " cannot enter");
        } else {
          this.currentCapacity++;
          EnterAction entry = new EnterAction(customer);
          System.out.println(entry);
        }
        System.out.println("Gym Capacity: " + currentCapacity + "/" + maxCapacity);

      } else if (action == GymManagement.START) {
        int trainerIndex = scanner.nextInt();
        int customerIndex = scanner.nextInt();
        int equipmentIndex = scanner.nextInt();
        
        Trainer trainer = (Trainer) this.people[trainerIndex];
        Customer customer = (Customer) this.people[customerIndex];
        Equipment equipment = this.equipment[equipmentIndex];

        if (trainer.isTraining() || !equipment.isAvailable()) {
          System.out.println("Cannot Train!");
        } else {
          StartTrainingAction starting = new StartTrainingAction(customer, trainer, equipment); 
          System.out.println(starting);
        }
      } else if (action == GymManagement.FINISH) {
        int trainerIndex = scanner.nextInt();

        Trainer trainer = (Trainer) people[trainerIndex];

        if (!trainer.isTraining()) {
          System.out.println(trainer + " is not training");
        } else {
          EndTrainingAction ending = new EndTrainingAction(trainer);
          System.out.println(ending);
        }
      }
    }
  }
}
