/** 
 * @author: A0258524Y
**/

abstract class Person {

  private String name;
  
  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {

    return this.name;
  };
}

