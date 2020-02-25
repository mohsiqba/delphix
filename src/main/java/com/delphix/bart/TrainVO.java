package com.delphix.bart;

public class TrainVO {
    private String minutes;
    private String platform;
    private String delay;
    private String direction;
    private String destinationName;
    private String destinationAbbr;

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getDestinationAbbr() {
        return destinationAbbr;
    }

    public void setDestinationAbbr(String destinationAbbr) {
        this.destinationAbbr = destinationAbbr;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "TrainVO{" +
                "minutes='" + minutes + '\'' +
                ", platform='" + platform + '\'' +
                ", delay='" + delay + '\'' +
                ", direction='" + direction + '\'' +
                ", destinationName='" + destinationName + '\'' +
                ", destinationAbbr='" + destinationAbbr + '\'' +
                '}';
    }
}
