package details;

public class Engine {
    protected int enginePower;
    protected String manufacturer;

    public Engine(int enginePower, String manufacturer) {
        this.enginePower = enginePower;
        this.manufacturer = manufacturer;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "enginePower=" + enginePower +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
