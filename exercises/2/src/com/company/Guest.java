package com.company;

import java.util.Date;

public class Guest extends Users {

    private Date loginTime = new Date();

    public Date getLoginTime() {
        return loginTime;
    }
}



