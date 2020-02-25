package com.delphix.bart;

import java.util.List;

public class Station {
    private List<Etd> etd;
    private String name;
    private String abbr;
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public List<Etd> getEtd() {
        return etd;
    }

    public void setEtd(List<Etd> etd) {
        this.etd = etd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbbr() {
        return abbr;
    }

    public void setAbbr(String abbr) {
        this.abbr = abbr;
    }

    @Override
    public String toString() {
        return "Station{" +
                "etd=" + etd +
                ", name='" + name + '\'' +
                ", abbr='" + abbr + '\'' +
                ", message=" + message +
                '}';
    }
}