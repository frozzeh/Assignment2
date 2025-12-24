import java.util.*;
public class Main {
    public static void main(String[] args) {
        Flight flight1 = new Flight("KC101", "Almaty", "Astana", "10:00", 52);
        Passenger passenger1 = new Passenger("Zharkyn", 18);

        Flight flight2 = new Flight("KC101", "Astana", "Shymkent","12:00", 67);
        Passenger passenger2 = new Passenger("Zharkyn", 18);

        Booking booking1 = new Booking(passenger1, flight1);
        Booking booking2 = new Booking(passenger2, flight2);

        System.out.println("Flight 1:\n" + booking1);
        System.out.println("Flight 2:\n" + booking2);

        System.out.println("Flights equal? " + flight1.equals(flight2));
        System.out.println("Passengers equal? " + passenger1.equals(passenger2));

        List<Flight> flights = new ArrayList<>();
        flights.add(flight1);
        flights.add(flight2);

        flights.sort(Comparator.comparing(Flight::getDepartureTime));
        System.out.println("\nFlights sorted by departure time:");
        for (Flight f : flights) {
            System.out.println(f);
        }

        System.out.println("\nFlights with more than 60 seats:");
        flights.stream()
                .filter(f -> f.getSeatsAvailable() > 60)
                .forEach(System.out::println);

        System.out.println("\nSearching for flight KC101:");
        flights.stream()
                .filter(f -> f.getFlightNumber().equals("KC101"))
                .forEach(System.out::println);

        flight1.updateSeats(-2);
        System.out.println("\nAfter booking seats:");
        System.out.println(flight1);

        List<User> users = new ArrayList<>();
        users.add(passenger1);
        users.add(passenger2);

        System.out.println("\nUsers list (polymorphism):");
        users.forEach(System.out::println);

        System.out.println("\nHash codes:");
        System.out.println("Flight1 hash: " + flight1.hashCode());
        System.out.println("Flight2 hash: " + flight2.hashCode());
        System.out.println("Passenger1 hash: " + passenger1.hashCode());
        System.out.println("Passenger2 hash: " + passenger2.hashCode());

    }
}
