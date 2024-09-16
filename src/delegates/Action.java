package delegates;

@FunctionalInterface
public interface Action {
    String invoke(String... dependencies);
}
