package com.delphix.bart;

import java.util.List;

/**
 * XML to POJO
 */
public class Etd {
    private String limited;
    private String destination;
    private List<Estimate> estimate;
    private String abbreviation;

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Estimate> getEstimate() {
        return estimate;
    }

    public void setEstimate(List<Estimate> estimate) {
        this.estimate = estimate;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public String toString() {
        return "Etd{" +
                "limited='" + limited + '\'' +
                ", destination='" + destination + '\'' +
                ", estimate=" + estimate +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}