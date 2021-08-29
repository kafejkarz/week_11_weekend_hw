public class CabinCrewMember {

    private String name;
    private CabinCrewMemberType cabinCrewMemberType;

    public CabinCrewMember(String name, CabinCrewMemberType cabinCrewMemberType){
        this.name = name;
        this.cabinCrewMemberType = cabinCrewMemberType;
    }

    public String getName() {
        return name;
    }


    public CabinCrewMemberType getCabinCrewMemberType() {
        return cabinCrewMemberType;
    }
}
