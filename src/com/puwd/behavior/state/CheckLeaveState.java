package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public class CheckLeaveState implements LeaveState {

    LeaveTicket leaveTicket;

    public CheckLeaveState(LeaveTicket leaveTicket) {
        this.leaveTicket = leaveTicket;
    }

    @Override
    public void start() {
        System.out.println("请假流程处理中，不能发起");
    }

    @Override
    public void commit() {
        System.out.println("请假流程处理中，不能提交");
    }

    @Override
    public void reject() {
        System.out.println("请假流程处理中，不能撤回");
    }

    @Override
    public void check() {
        leaveTicket.setLeaveState(leaveTicket.noStartLeaveState);
        System.out.println("审核完成");
    }
}
