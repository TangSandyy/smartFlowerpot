package org.example;

public class Flowerpot {
    //private long id;
    private double uv;
    private double moisture;
    private double temperature;

    public Flowerpot(double uv, double moisture, double temperature) {
        this.uv = uv;
        this.moisture = moisture;
        this.temperature = temperature;
    }

    /*public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
*/
    public double getUv() {
        return uv;
    }

    public void setUv(double uv) {
        this.uv = uv;
    }

    public double getMoisture() {
        return moisture;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
