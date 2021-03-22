package com.puwd.behavior.observor.subject;

import com.puwd.behavior.observor.Observor;

import java.util.ArrayList;
import java.util.List;

public class HongQiMarket implements Market {

    private List<Observor> observorList;

    public HongQiMarket() {
        this.observorList = new ArrayList<>();
    }

    @Override
    public void register(Observor o) {
        observorList.add(o);
    }

    @Override
    public void remove(Observor o) {
        observorList.remove(o);
    }

    @Override
    public void notifyObservers() {
        observorList.forEach(Observor::recieve);
    }
}
