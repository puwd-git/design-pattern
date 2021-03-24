package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public class StartLeaveState implements LeaveState {

    LeaveTicket leaveTicket;

    public StartLeaveState(LeaveTicket leaveTicket) {
        this.leaveTicket = leaveTicket;
    }

    @Override
    public void start() {
        System.out.println("你已经发起了请假了，不能重复发起");
    }

    @Override
    public void commit() {
        leaveTicket.setLeaveState(leaveTicket.commitLeaveState);
        System.out.println("提交请假申请");
    }

    @Override
    public void reject() {
        leaveTicket.setLeaveState(leaveTicket.noStartLeaveState);
        System.out.println("撤回请假申请");
    }

    @Override
    public void check() {
        System.out.println("请假申请还未提交");
    }
}
