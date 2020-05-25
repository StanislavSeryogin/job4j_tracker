package packegesAndInterfaces;

import exception.QueueEmptyException;
import exception.QueueFullException;

public interface ICharQ {
    void put(char ch) throws QueueFullException;

    char get() throws QueueEmptyException;
}
