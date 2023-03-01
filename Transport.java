public abstract class Transport {

    protected String model;
    protected int yearOfRelease;
    protected int enginePower;
    protected int engineCapacity;
    protected String color;

    public Transport(String model, int yearOfRelease, int enginePower, int engineCapacity, String color) {
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.enginePower = enginePower;
        this.engineCapacity = engineCapacity;
        this.color = color;
    }

    public Transport() {
        this.model = null;
        this.yearOfRelease = 0;
        this.enginePower = 0;
        this.engineCapacity = 0;
        this.color = null;
    }

    public String toString() {
        return String.format(" %s,  год выпуска: %d, мощность дыигателя: %d, объем двигателя: %d, цвет: %s",
                this.model, this.yearOfRelease, this.enginePower, this.engineCapacity, this.color);
    }

    public String getInfo() {
        return String.format("%s,  год выпуска: %d, мощность дыигателя: %d, объем двигателя: %d, цвет: %s",
                this.model, this.yearOfRelease, this.enginePower, this.engineCapacity, this.color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}