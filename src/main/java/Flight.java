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
    }

}
