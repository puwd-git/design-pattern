package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public class CommitLeaveState implements LeaveState {

    LeaveTicket leaveTicket;

    public CommitLeaveState(LeaveTicket leaveTicket) {
        this.leaveTicket = leaveTicket;
    }

    @Override
    public void start() {
        System.out.println("请假流程处理中，不能重复发起");
    }

    @Override
    public void commit() {
        System.out.println("请假流程处理中，不能重复提交");
    }

    @Override
    public void reject() {
        System.out.println("请假流程处理中，不能撤回");
    }

    @Override
    public void check() {
        leaveTicket.setLeaveState(leaveTicket.checkLeaveState);
        System.out.println("等待审核");
    }
}
