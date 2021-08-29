import java.util.ArrayList;

public class Flight{

    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private String flyNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;


    public Flight(String flyNumber, String destination, String departureAirport, String departureTime){
        this.flyNumber = flyNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }


    public String getFlyNumber() {
        return flyNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public void addCabinMembers(CabinCrewMember cabinCrewMember){
        cabinCrewMembers.add(cabinCrewMember);
    }
}
