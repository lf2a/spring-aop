package com.lf2a.afterreturning.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
    public void addSillyMember() {
        System.out.println(getClass() + " DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }

    public void goSleep() {
        System.out.println(getClass() + " DOING STUFF: ADDING A MEMBERSHIP ACCOUNT");
    }
}
