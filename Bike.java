public class Bike implements Vehicle{
    private String brand;
    private int hour;
    private double hourlyRate=10.0;

    public Bike(String brand, int hour, double hourlyRate) {
        this.brand = brand;
        this.hour = hour;
        this.hourlyRate = hourlyRate;
    }

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateRentalCost() {
        return hour*hourlyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Hourly Rental Rate: $" + hourlyRate);
        System.out.println("Rental Cost: $" + calculateRentalCost());
    }
}
