package com.shorewise.wiseconnect.lc;


public class LCResponse {
    private String status;
    private String lcNumber;

    public LCResponse(String status, String lcNumber) {
        this.status = status;
        this.lcNumber = lcNumber;
    }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getLcNumber() { return lcNumber; }
    public void setLcNumber(String lcNumber) { this.lcNumber = lcNumber; }
}
