package com.easeArch.common.entry;

public class Temp {
    String account;
    String faccount;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFaccount() {
        return faccount;
    }

    public void setFaccount(String faccount) {
        this.faccount = faccount;
    }

    @Override
    public String toString() {
        return "Temp{" +
                "account='" + account + '\'' +
                ", faccount='" + faccount + '\'' +
                '}';
    }
}
