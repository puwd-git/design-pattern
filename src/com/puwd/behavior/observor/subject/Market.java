package com.puwd.behavior.observor.subject;

import com.puwd.behavior.observor.Observor;

public interface Market {

    void register(Observor o);

    void remove(Observor o);

    void notifyObservers();
}
