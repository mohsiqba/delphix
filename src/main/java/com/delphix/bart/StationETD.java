package com.delphix.bart;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "root")
public class StationETD {
    private String date;
    private Station station;
    private String time;
    private Message message;
    private String uri;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return "StationETD{" +
                "date='" + date + '\'' +
                ", station=" + station +
                ", time='" + time + '\'' +
                ", message='" + message + '\'' +
                ", uri='" + uri + '\'' +
                '}';
    }
}
