package com.Data;

public interface TaxObject {
    public String getState();
    public void setState(String state);
    public String getStatus();
    public void setStatus(String status);
    public Double getHours();
    public void setHours(Double hours);
    public Double getPayRate();
    public void setPayRate(Double payRate);
    public Double getGrossAmount();
    public void setGrossAmount(Double grossAmount);
    public Double getFederalTax();
    public void setFederalTax(Double federalTax);
    public Double getStateTax() ;
    public void setStateTax(Double stateTax);
    public Double getOtherTax() ;
    public void setOtherTax(Double otherTax);
}
