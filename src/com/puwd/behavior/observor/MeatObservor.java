package com.puwd.behavior.observor;

import com.puwd.behavior.observor.subject.Market;

/**
 * @author Administrator
 */
public class MeatObservor implements Observor {

    private Market market;

    public MeatObservor(Market market) {
        this.market = market;
        market.register(this);
    }

    @Override
    public void recieve() {
        System.out.println("肉类观察者收到通知");
    }
}
