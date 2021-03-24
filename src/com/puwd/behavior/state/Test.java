package com.puwd.behavior.state;


import com.puwd.behavior.template.AbstractCooking;
import com.puwd.behavior.template.NoodlesCooking;
import com.puwd.behavior.template.RiceCooking;

public class Test {

    public static void main(String[] args) {

        LeaveTicket leaveTicket = new LeaveTicket();
        leaveTicket.start();
        leaveTicket.commit();
        leaveTicket.reject();
        leaveTicket.check();
    }
}
