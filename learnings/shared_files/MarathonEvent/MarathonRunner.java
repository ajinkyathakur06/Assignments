package assQuestion24;

public class MarathonRunner {
	private String name;
    private int badgeNbr;
    private double startTime;
    private double endTime;

    // Constructor
    public MarathonRunner(String name, int badgeNbr, double startTime, double endTime) {
        this.name = name;
        this.badgeNbr = badgeNbr;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Method to calculate total time taken
    public double getFinishTime() {
        return endTime - startTime;
    }

    // Getters for properties
    public String getName() {
        return name;
    }

    public int getBadgeNbr() {
        return badgeNbr;
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    // Method to display runner details
    public void displayDetails() {
        System.out.println("Name: " + name +
                ", Badge Number: " + badgeNbr +
                ", Start Time: " + startTime +
                ", End Time: " + endTime +
                ", Total Time: " + getFinishTime());
    }
}
