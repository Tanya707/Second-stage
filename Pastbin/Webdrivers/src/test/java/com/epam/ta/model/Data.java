package com.epam.ta.model;

import java.util.Objects;

public class Data {

    private String numberOfInstances;
    private String instanceType;
    private String datacenterLocation;
    private String commitedUsage;
    private String resultNumberOfInstances;
    private String resultInstancetype;
    private String resultTotalHours;
    private String resultCost;

    public Data(String numberOfInstances, String instanceType, String datacenterLocation, String commitedUsage, String resultNumberOfInstances, String resultInstancetype, String resultTotalHours, String resultCost) {
        this.numberOfInstances = numberOfInstances;
        this.instanceType = instanceType;
        this.datacenterLocation = datacenterLocation;
        this.commitedUsage = commitedUsage;
        this.resultNumberOfInstances = resultNumberOfInstances;
        this.resultInstancetype = resultInstancetype;
        this.resultTotalHours = resultTotalHours;
        this.resultCost = resultCost;
    }

    public String getNumberOfInstances() {
        return numberOfInstances;
    }

    public void setNumberOfInstances(String numberOfInstances) {
        this.numberOfInstances = numberOfInstances;
    }

    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public String getDatacenterLocation() {
        return datacenterLocation;
    }

    public void setDatacenterLocation(String datacenterLocation) {
        this.datacenterLocation = datacenterLocation;
    }

    public String getCommitedUsage() {
        return commitedUsage;
    }

    public void setCommitedUsage(String commitedUsage) {
        this.commitedUsage = commitedUsage;
    }

    public String getResultNumberOfInstances() {
        return resultNumberOfInstances;
    }

    public void setResultNumberOfInstances(String resultNumberOfInstances) {
        this.resultNumberOfInstances = resultNumberOfInstances;
    }

    public String getResultInstancetype() {
        return resultInstancetype;
    }

    public void setResultInstancetype(String resultInstancetype) {
        this.resultInstancetype = resultInstancetype;
    }

    public String getResultTotalHours() {
        return resultTotalHours;
    }

    public void setResultTotalHours(String resultTotalHours) {
        this.resultTotalHours = resultTotalHours;
    }

    public String getResultCost() {
        return resultCost;
    }

    public void setResultCost(String resultCost) {
        this.resultCost = resultCost;
    }

    @Override
    public String toString() {
        return "Data of form{" +
                "Number of instances='" + numberOfInstances + '\'' +
                ", Instance type'" + instanceType + '\''+
                ", Datacenter location'" + datacenterLocation+ '\''+
                ", Commited usage'" + commitedUsage+ '\''+
                ", Result number of instances'" + resultNumberOfInstances+ '\''+
                ", Result instance type'" + resultInstancetype+ '\''+
                ", Result total hours'" + resultTotalHours+ '\''+
                ", Result cost'" + resultCost+ '\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Data)) return false;
        Data user = (Data) o;
        return Objects.equals(getNumberOfInstances(), user.getNumberOfInstances()) &&
                Objects.equals(getInstanceType(), user.getInstanceType())&&
                Objects.equals(getDatacenterLocation(), user.getDatacenterLocation())&&
                Objects.equals(getCommitedUsage(), user.getCommitedUsage())&&
                Objects.equals(getResultNumberOfInstances(), user.getResultNumberOfInstances())&&
                Objects.equals(getResultInstancetype(), user.getResultInstancetype())&&
                Objects.equals(getResultTotalHours(), user.getResultTotalHours())&&
                Objects.equals(getResultCost(), user.getResultCost())
                ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumberOfInstances(), getInstanceType(), getDatacenterLocation(), getCommitedUsage(), getResultNumberOfInstances(), getResultInstancetype(), getResultTotalHours(), getResultCost());
    }
}
