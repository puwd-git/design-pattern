package com.puwd.behavior.state;

/**
 * @author Administrator
 */
public class LeaveTicket {

    public LeaveState noStartLeaveState;

    public LeaveState startLeaveState;

    public LeaveState commitLeaveState;

    public LeaveState checkLeaveState;

    private LeaveState leaveState;

    public LeaveTicket() {
        this.noStartLeaveState = new NoStartLeaveState(this);
        this.startLeaveState = new StartLeaveState(this);
        this.commitLeaveState = new CommitLeaveState(this);
        this.checkLeaveState = new CheckLeaveState(this);
        this.leaveState = noStartLeaveState;
    }

    public void setLeaveState(LeaveState leaveState) {
        this.leaveState = leaveState;
    }

    public void start() {
        leaveState.start();
    }

    public void commit() {
        leaveState.commit();
    }

    public void reject() {
        leaveState.reject();
    }

    public void check() {
        leaveState.check();
    }
}
