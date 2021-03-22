package com.puwd.behavior.observor;

import com.puwd.behavior.observor.subject.Market;

/**
 * @author Administrator
 */
public class SaltObservor implements Observor {

    private Market market;

    public SaltObservor(Market market) {
        this.market = market;
        market.register(this);
    }

    @Override
    public void recieve() {
        System.out.println("盐商观察者收到通知");
    }
}
