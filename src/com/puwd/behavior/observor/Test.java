package com.puwd.behavior.observor;

import com.puwd.behavior.observor.subject.HongQiMarket;
import com.puwd.behavior.observor.subject.Market;

/**
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {
        Market market = new HongQiMarket();
        Observor o1 = new MeatObservor(market);
        Observor o2 = new RiceObservor(market);
        Observor o3 = new SaltObservor(market);
        market.notifyObservers();
    }
}
