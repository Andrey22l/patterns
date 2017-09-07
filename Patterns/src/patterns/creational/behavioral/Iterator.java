/*
 * Pattern Iterator provides mechanism of sequentual search of elements in collections 
 * without disclosure of implementation. 
 */
package patterns.creational.behavioral;

/**
 *
 * @author Andrey
 */
public interface Iterator<E> {

    boolean hasNext();
    E next();
    default void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
