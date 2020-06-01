package generics.queue;

import exception.QueueEmptyException;
import exception.QueueFullException;

public interface IGenQ<T> {
    void put(T ch) throws QueueFullException;

    T get() throws QueueEmptyException;
}
