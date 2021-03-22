package com.puwd.behavior.strategy.behavior.color;

import com.puwd.behavior.strategy.behavior.color.ColorBehavior;

/**
 * @author Administrator
 */
public class WhiteColorBehavior implements ColorBehavior {

    @Override
    public void color() {
        System.out.println("白色的！");
    }
}
