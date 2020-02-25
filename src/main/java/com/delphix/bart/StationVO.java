package com.delphix.bart;

import java.util.List;

public class StationVO {

    private String stationName;
    private String stationAbbr;
    private String date;
    private String time;
    List<TrainVO> trains;

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationAbbr() {
        return stationAbbr;
    }

    public void setStationAbbr(String stationAbbr) {
        this.stationAbbr = stationAbbr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<TrainVO> getTrains() {
        return trains;
    }

    public void setTrains(List<TrainVO> trains) {
        this.trains = trains;
    }

    @Override
    public String toString() {
        return "StationVO{" +
                "stationName='" + stationName + '\'' +
                ", stationAbbr='" + stationAbbr + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", trains=" + trains +
                '}';
    }
}
