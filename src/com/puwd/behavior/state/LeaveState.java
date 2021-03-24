package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public interface LeaveState {

    void start();

    void commit();

    void reject();

    void check();
}
