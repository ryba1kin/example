package com.bell.car;

public class Lorry extends Car {
    private double loadWeight;

    public Lorry(String brand, double weight, long power) {
        super(brand, weight, power);
    }

    public Lorry(String brand, double weight, long power, double loadWeight) {
        this(brand, weight, power);
        this.loadWeight = loadWeight;
    }

    public void setBrand(String brand) {
        super.brand = brand;
    }

    /**
     *
     * @param loadWeight дельта для изменения грузоподьемности
     * @return статус изменения грузоподьемности, true если изменилась, иначе false
     */
    public boolean changeLoadWeight(double loadWeight) {
        try {
            this.loadWeight += loadWeight;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
