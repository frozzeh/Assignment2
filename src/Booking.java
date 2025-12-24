import java.util.Objects;

public class Booking {
    private Passenger passenger;
    private Flight flight;

    public Booking(Passenger passenger, Flight flight) {
        this.passenger = passenger;
        this.flight = flight;
    }

    public Passenger getPassenger() { return passenger; }
    public void setPassenger(Passenger passenger) { this.passenger = passenger; }

    public Flight getFlight() { return flight; }
    public void setFlight(Flight flight) { this.flight = flight; }

    @Override public String toString() {
        return "Booking:\n" + passenger.toString() + "\nFlight: " + flight.toString();
    }

    @Override public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Booking)) return false;
        Booking other = (Booking) obj;
        return Objects.equals(passenger, other.passenger) && Objects.equals(flight, other.flight);
    }

    @Override public int hashCode() {
        return Objects.hash(passenger, flight);
    }
}