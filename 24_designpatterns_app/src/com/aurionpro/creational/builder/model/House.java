package com.aurionpro.creational.builder.model;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    private House() {}

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public boolean isPainted() {
        return painted;
    }

    public static class Builder {
        private House house;

        public Builder() {
            house = new House();
        }

        public Builder buildFoundation(String foundation) {
            house.foundation = foundation;
            return this;
        }

        public Builder buildStructure(String structure) {
            house.structure = structure;
            return this;
        }

        public Builder buildRoof(String roof) {
            house.roof = roof;
            return this;
        }

        public Builder furnish(boolean furnished) {
            house.furnished = furnished;
            return this;
        }

        public Builder paint(boolean painted) {
            house.painted = painted;
            return this;
        }

        public House build() {
            return house;
        }
    }
}

