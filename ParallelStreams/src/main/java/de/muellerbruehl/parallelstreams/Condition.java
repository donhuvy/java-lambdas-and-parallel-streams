package de.muellerbruehl.parallelstreams;

public interface Condition<T> {

    boolean test(T t);

}
