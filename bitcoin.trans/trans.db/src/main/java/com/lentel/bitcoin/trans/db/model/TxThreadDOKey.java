package com.lentel.bitcoin.trans.db.model;

public class TxThreadDOKey {
    private String user;

    private String market1;

    private String market2;

    private String symbol;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public String getMarket1() {
        return market1;
    }

    public void setMarket1(String market1) {
        this.market1 = market1 == null ? null : market1.trim();
    }

    public String getMarket2() {
        return market2;
    }

    public void setMarket2(String market2) {
        this.market2 = market2 == null ? null : market2.trim();
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol == null ? null : symbol.trim();
    }
}