public interface MyCollection {

    default boolean add(String s) {
        return true;
    }

    default boolean remove(String s) {
        return false;
    }

    default boolean contains(Object o) {
        return false;
    }
}
