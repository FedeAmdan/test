package com.mulesoft.training.tdd;

public class Distance {
    private int amount;
    private Unit unit;

    public enum Unit {
        KM(1000, "km"),
        METERS(1, "m");

        private int multiplier;
        private String shortName;

        private Unit(int multiplier, String shortName) {
            this.multiplier = multiplier;
            this.shortName = shortName;
        }

        public int getBaseUnitAmount(int n) {
            return n * multiplier;
        }

        @Override
        public String toString() {
            return shortName;
        }
    }

    public static Distance km(int n) {
        return new Distance(n, Unit.KM);
    }

    public static Distance meters(int n) {
        return new Distance(n, Unit.METERS);
    }

    public Distance(int amount, Unit unit) {
        this.amount = amount;
        this.unit = unit;
    }

    public Distance asMeters() {
        if (unit.equals(Unit.METERS)) {
            return this;
        } else {
            return new Distance(getBaseUnitAmount(), Unit.METERS);
        }
    }

    @Override
    public int hashCode() {
        return getBaseUnitAmount();
    }

    @Override
    public boolean equals(Object o) {
        return o != null && o.getClass().equals(this.getClass()) && ((Distance) o).getBaseUnitAmount() == getBaseUnitAmount();
    }

    private int getBaseUnitAmount() {
        return unit.getBaseUnitAmount(amount);
    }

    @Override
    public String toString() {
        return amount + " " + unit;
    }
}
