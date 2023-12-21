import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Queue;

public class AirlineManagementSystem {

    public static void main(String[] args) {
        // Example usage of the classes

        // ArrayList for Passenger Lists
        PassengerList passengerList = new PassengerList();
        passengerList.addPassenger("John Doe");
        passengerList.addPassenger("Jane Smith");
        System.out.println("Passenger List: " + passengerList.getPassengers());

        // LinkedList for Flight Schedules
        FlightSchedule flightSchedule = new FlightSchedule();
        flightSchedule.addFlight("Flight 101 - New York to London");
        flightSchedule.addFlight("Flight 202 - Paris to Tokyo");
        System.out.println("Flight Schedule: " + flightSchedule.getFlights());

        // HashSet for Airport Codes
        AirportCodes airportCodes = new AirportCodes();
        airportCodes.addAirportCode("JFK");
        airportCodes.addAirportCode("LHR");
        System.out.println("Airport Codes: " + airportCodes.getAirportCodes());

        // Queue for Boarding Process
        BoardingQueue boardingQueue = new BoardingQueue();
        boardingQueue.enqueue("Passenger A");
        boardingQueue.enqueue("Passenger B");
        System.out.println("Boarding Queue: " + boardingQueue.getBoardingQueue());
        boardingQueue.dequeue();
        System.out.println("After Dequeue: " + boardingQueue.getBoardingQueue());
    }
}

class PassengerList {
    private ArrayList<String> passengers;

    public PassengerList() {
        passengers = new ArrayList<>();
    }

    public void addPassenger(String passengerName) {
        passengers.add(passengerName);
    }

    public ArrayList<String> getPassengers() {
        return passengers;
    }
}

class FlightSchedule {
    private LinkedList<String> flights;

    public FlightSchedule() {
        flights = new LinkedList<>();
    }

    public void addFlight(String flightDetails) {
        flights.add(flightDetails);
    }

    public LinkedList<String> getFlights() {
        return flights;
    }
}

class AirportCodes {
    private HashSet<String> airportCodes;

    public AirportCodes() {
        airportCodes = new HashSet<>();
    }

    public void addAirportCode(String code) {
        airportCodes.add(code);
    }

    public HashSet<String> getAirportCodes() {
        return airportCodes;
    }
}

class BoardingQueue {
    private Queue<String> boardingQueue;

    public BoardingQueue() {
        boardingQueue = new LinkedList<>();
    }

    public void enqueue(String passenger) {
        boardingQueue.add(passenger);
    }

    public void dequeue() {
        if (!boardingQueue.isEmpty()) {
            boardingQueue.poll();
        }
    }

    public Queue<String> getBoardingQueue() {
        return boardingQueue;
    }
}
