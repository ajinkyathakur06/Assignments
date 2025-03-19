package assQuestion7;

public class BookARide {
	/**
     * A class representing the shared cab service for booking seats.
     */
    private int totalNoOfBookings;

    public BookARide() {
        this.totalNoOfBookings = 0;
    }

    public void bookSeat(int noOfSeats) throws RideOverBooked {
        /**
         * Books the specified number of seats.
         * If total bookings exceed 4, throws RideOverBooked exception.
         *
         * @param noOfSeats Number of seats to be booked.
         */
        if (this.totalNoOfBookings + noOfSeats > 4) {
            throw new RideOverBooked();
        }
        this.totalNoOfBookings += noOfSeats;
        System.out.println("Booking successful! Total booked seats: " + this.totalNoOfBookings);
    }

    public static void main(String[] args) {
        try {
            BookARide ride = new BookARide();
            ride.bookSeat(2); // Booking 2 seats
            ride.bookSeat(1); // Booking 1 seat
            ride.bookSeat(2); // Attempting to book 2 more seats, exceeding the limit
        } catch (RideOverBooked e) {
            System.out.println(e.getMessage());
        }
    }
}
