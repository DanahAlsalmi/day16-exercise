public class Truck implements Vehicle{

    private String type;
    private int week;
    private double weeklyRate=500;

    public Truck(String type, int week, double weeklyRate) {
        this.type = type;
        this.week = week;
        this.weeklyRate = weeklyRate;
    }

    public Truck(String type,int week) {
        this.week = week;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public double getWeeklyRate() {
        return weeklyRate;
    }

    public void setWeeklyRate(double weeklyRate) {
        this.weeklyRate = weeklyRate;
    }

    @Override
    public double calculateRentalCost() {
        return week*weeklyRate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck Type: " + type);
        System.out.println("Weekly Rental Rate: $" + weeklyRate);
        System.out.println("Rental Cost: $" + calculateRentalCost());

    }
}
