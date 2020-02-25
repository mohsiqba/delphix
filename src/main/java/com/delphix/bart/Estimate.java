package com.delphix.bart;

/**
 * Map Response XML attributes to POJO
 */
public class Estimate {
    private String delay;
    private String color;
    private String hexcolor;
    private String minutes;
    private String length;
    private String bikeflag;
    private String platform;
    private String direction;

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHexcolor() {
        return hexcolor;
    }

    public void setHexcolor(String hexcolor) {
        this.hexcolor = hexcolor;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getBikeflag() {
        return bikeflag;
    }

    public void setBikeflag(String bikeflag) {
        this.bikeflag = bikeflag;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "Estimate{" +
                "delay='" + delay + '\'' +
                ", color='" + color + '\'' +
                ", hexcolor='" + hexcolor + '\'' +
                ", minutes='" + minutes + '\'' +
                ", length='" + length + '\'' +
                ", bikeflag='" + bikeflag + '\'' +
                ", platform='" + platform + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}