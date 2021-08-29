public class Pilot extends CabinCrewMember{

    private String licenceNumber;



    public Pilot(String name, CabinCrewMemberType cabinCrewMemberType, String licenceNumber){
        super(name, cabinCrewMemberType);
        this.licenceNumber = licenceNumber;

    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
}
