package examples.records;

import examples.records.recordFoos.HumanRecordWithBuilder;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;

public class ReflectionUsage {

  public static void main(String[] args) {
    var humanRecord = crateHuman();
    var clazz = humanRecord.getClass();
    // 1
    System.out.println(clazz.isRecord());
    // 2
    getComponents(humanRecord, clazz);
    getDeclaredFields(humanRecord, clazz);

    // printMethods(clazz);
    //System.out.println(humanRecord);
  }
  
  private static <T> void getDeclaredFields(Object humanRecord, Class<T> clazz) {
    for (var field : clazz.getDeclaredFields()) {
      field.setAccessible(true);
      try {
        /*if (field.getType().equals(String.class)) {
          field.set(humanRecord, "TROLOLO");
        }*/
        System.out.println("field: " + field.get(humanRecord));
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }
  }
  
  private static <T> void getComponents(Object humanRecord, Class<T> clazz) {
    for (var component : clazz.getRecordComponents()) {
      try {
        System.out.println("component: " + component.getAccessor().invoke(humanRecord, null));
      } catch (IllegalAccessException | InvocationTargetException e) {
        e.printStackTrace();
      }
    }
  }

  private static <T> void printMethods(Class<T> clazz) {
    System.out.println("##METHODS NAME##      ##DECLARED CLASS##");
    for (var method : clazz.getMethods()) {
      System.out.println(method.getName() + "\t\t\t\t\t\t\t" + method.getDeclaringClass());
    }
  }

  private static HumanRecordWithBuilder crateHuman() {
    return new HumanRecordWithBuilder.Builder()
        .favoriteEat(Eat.banana)
        .name("Paramon")
        .surname("Smith")
        .born(LocalDate.of(1954, 1, 1))
        .crazy(false)
        .viripotent(true)
        .children(50)
        .build();
  }

}
