package com.lentel.bitcoin.trans.db.model;

public class TxThreadDO extends TxThreadDOKey {
    private String appKey1;

    private String secretKey1;

    private String appKey2;

    private String secretKey2;

    private Integer priceDeg;

    private Integer volumeDeg;

    private Float transPer;

    private String isProcess;

    public String getAppKey1() {
        return appKey1;
    }

    public void setAppKey1(String appKey1) {
        this.appKey1 = appKey1 == null ? null : appKey1.trim();
    }

    public String getSecretKey1() {
        return secretKey1;
    }

    public void setSecretKey1(String secretKey1) {
        this.secretKey1 = secretKey1 == null ? null : secretKey1.trim();
    }

    public String getAppKey2() {
        return appKey2;
    }

    public void setAppKey2(String appKey2) {
        this.appKey2 = appKey2 == null ? null : appKey2.trim();
    }

    public String getSecretKey2() {
        return secretKey2;
    }

    public void setSecretKey2(String secretKey2) {
        this.secretKey2 = secretKey2 == null ? null : secretKey2.trim();
    }

    public Integer getPriceDeg() {
        return priceDeg;
    }

    public void setPriceDeg(Integer priceDeg) {
        this.priceDeg = priceDeg;
    }

    public Integer getVolumeDeg() {
        return volumeDeg;
    }

    public void setVolumeDeg(Integer volumeDeg) {
        this.volumeDeg = volumeDeg;
    }

    public Float getTransPer() {
        return transPer;
    }

    public void setTransPer(Float transPer) {
        this.transPer = transPer;
    }

    public String getIsProcess() {
        return isProcess;
    }

    public void setIsProcess(String isProcess) {
        this.isProcess = isProcess == null ? null : isProcess.trim();
    }
}