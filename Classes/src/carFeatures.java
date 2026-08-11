public class carFeatures {
    private int fuel = 100;
    private int distance = 100;
    private double fuelConsumption;
    private Boolean isRunning, isDriving;

    public void setIsRunning(Boolean isRunning) {
        this.isRunning = isRunning;
    }

    public void setFuelConsumption(double fuelConsumption)
    {
        this.fuelConsumption = fuelConsumption;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setFuel(int fuel)
    {
        this.fuel = fuel;
    }

    public void setIsDriving(Boolean isDriving) {
        this.isDriving = isDriving;
    }

    public boolean getIsRunning()
    {
        return isRunning;
    }

    public int getFuel()
    {
        return fuel;
    }

    public int  getFuelConsumption()
    {
        return fuel -= (distance/(10));
    }
}
