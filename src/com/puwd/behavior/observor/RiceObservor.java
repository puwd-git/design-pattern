package com.puwd.behavior.observor;

import com.puwd.behavior.observor.subject.Market;

/**
 * @author Administrator
 */
public class RiceObservor implements Observor {

    private Market market;

    public RiceObservor(Market market) {
        this.market = market;
        market.register(this);
    }

    @Override
    public void recieve() {
        System.out.println("米商观察者收到通知");
    }
}
