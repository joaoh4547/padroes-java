package com.github.joaoh4547.objectpool.pools;

public interface Pool<T> {
    T acquire();
    void release(T object);
}
