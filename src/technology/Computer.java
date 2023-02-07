package technology;

public class Computer {
    private String brand;
    private int storage;
    private boolean powerOn;

    public Computer(String brand, int storage, boolean powerOn){
        super();
        this.brand = brand;
        this.storage = storage;
        this.powerOn = powerOn;
    }
    public void increaseStorage (int x){
        this.storage = this.storage + x;
    }

    public boolean isPowerOn() {
        if (powerOn == true) {
            return true;
        } else {
            return false;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }
}
