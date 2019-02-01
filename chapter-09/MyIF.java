/**
 * C09 L12
 */
public interface MyIF {

    int getNumber();

    default String getString() {
        return "Default String";
    }
}