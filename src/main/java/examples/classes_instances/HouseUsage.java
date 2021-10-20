package examples.classes_instances;

class HouseUsage {

  public static void main(String[] args) {
    House sampleHouse = new House();
    System.out.println("Identifier который присвоен объекту где-то внутри JVM: " + sampleHouse);
    // в моем случае это "House@7a81197d"

  }

}
