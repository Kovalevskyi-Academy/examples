package examples.optional.without;

import java.util.List;
import java.util.UUID;

/**
 * A cute woolen pet in an unknown state.
 */
public record Cat(String name,
                  UUID uuid,
                  Double age,
                  Double weight,
                  List<Cat> relatives) {

}
