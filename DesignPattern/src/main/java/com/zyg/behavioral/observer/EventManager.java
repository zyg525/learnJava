package com.zyg.behavioral.observer;

import java.util.HashSet;
import java.util.Set;

public class EventManager {
    private Set<Listener> listeners = new HashSet<>();

    public EventManager subscribe(Listener listener) {
        listeners.add(listener);
        return this;
    }

    public boolean unsubscribe(Listener listener) {
        return listeners.remove(listener);
    }

    public Set<Listener> getListeners() {
        return listeners;
    }
}
