package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public class NoStartLeaveState implements LeaveState {

    LeaveTicket leaveTicket;

    public NoStartLeaveState(LeaveTicket leaveTicket) {
        this.leaveTicket = leaveTicket;
    }

    @Override
    public void start() {
        leaveTicket.setLeaveState(leaveTicket.startLeaveState);
        System.out.println("发起了请假了");
    }

    @Override
    public void commit() {
        System.out.println("还未发起");
    }

    @Override
    public void reject() {
        System.out.println("还未发起");
    }

    @Override
    public void check() {
        System.out.println("还未发起");
    }
}
