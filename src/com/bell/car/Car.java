package com.bell.car;

public class Car {
    protected String brand;
    protected double weight;
    protected long power;

    public Car(String brand, double weight, long power) {
        this.brand = brand;
        this.weight = weight;
        this.power = power;
    }

    public void setPower(long power) {
        this.power = power;
    }

    /**
     * метод изменения мощности(не сеттер)
     * @param power дельта, на которую нужно изменить мощность
     * @return статус изменения мощности, true если изменилась, иначе false
     */
    public boolean changePower(long power) {
        try {
            this.power += power;
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
