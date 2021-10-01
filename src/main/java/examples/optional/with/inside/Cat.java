package examples.optional.with.inside;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

/**
 * A cute woolen pet in an unknown state.
 */
public record Cat(@NotNull Optional<String> name,
                  UUID uuid,
                  @NotNull Optional<Double> age,
                  @NotNull Optional<Double> weight,
                  @NotNull Optional<List<Cat>> relatives) {

  public Cat {
    Optional.ofNullable(uuid).orElseThrow(
        () -> new IllegalArgumentException("UUID can't be empty!"));
  }

}
