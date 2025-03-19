package assQuestion7;

public class RideOverBooked extends Exception {
	/**
     * Custom exception to be raised when the total number of bookings exceeds the allowed limit.
     */
    public RideOverBooked(String message) {
        super(message);
    }

    public RideOverBooked() {
        super("Total number of bookings exceeds the allowed limit of 4 seats.");
    }

}
