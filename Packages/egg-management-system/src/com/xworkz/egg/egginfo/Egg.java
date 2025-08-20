package com.xworkz.egg.egginfo;

public class Egg {
   private String size;
  private   double pricePerDozen;
    private String type;
    private int count;
    private String farmName;
    private float weightPerEgg;

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setPricePerDozen(double pricePerDozen) {
        this.pricePerDozen = pricePerDozen;
    }

    public double getPricePerDozen() {
        return pricePerDozen;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setWeightPerEgg(float weightPerEgg) {
        this.weightPerEgg = weightPerEgg;
    }

    public float getWeightPerEgg() {
        return weightPerEgg;
    }
}
