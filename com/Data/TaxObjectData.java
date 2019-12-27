package com.Data;

public class TaxObjectData {
    String state;
    String status;
    Double hours;
    Double payRate;
    Double grossAmount;
    Double federalTax;
    Double stateTax;
    Double otherTax;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getPayRate() {
        return payRate;
    }

    public void setPayRate(Double payRate) {
        this.payRate = payRate;
    }

    public Double getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Double getFederalTax() {
        return federalTax;
    }

    public void setFederalTax(Double federalTax) {
        this.federalTax = federalTax;
    }

    public Double getStateTax() {
        return stateTax;
    }

    public void setStateTax(Double stateTax) {
        this.stateTax = stateTax;
    }

    public Double getOtherTax() {
        return otherTax;
    }

    public void setOtherTax(Double otherTax) {
        this.otherTax = otherTax;
    }
}
