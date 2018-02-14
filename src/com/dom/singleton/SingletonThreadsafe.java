package com.dom.singleton;

// Should always be threadsafe
public class SingletonThreadsafe {
    private static SingletonThreadsafe instance;

    private SingletonThreadsafe() {
    }

    // Least impact.
    // Could use synchronized keyword in method signature,
    // but that would create a huge performance hit for every
    // call to this method.
    public static SingletonThreadsafe getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadsafe.class) {
                if (instance == null) {
                    instance = new SingletonThreadsafe();
                }
            }
        }
        return instance;
    }
}
