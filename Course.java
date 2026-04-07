public class course{
    private String id; // format CSXXX
    private String name;
    private int registeredStudents; 
    private int maxSeats;
    private String[] prerequisites; // separated by comma 

    // Constructor to initialize from file data 
    public course(String id, String name, int registered, int max, String[] prereqs) {
        this.id = id;
        this.name = name;
        this.registeredStudents = registered;
        this.maxSeats = max;
        this.prerequisites = prereqs;
    }

    // sort by course ID method
    public int compareTo(course other) {
        return this.id.compareTo(other.id);
    }

    // check for open seats helper method
    public boolean hasOpenSeats() {
        return registeredStudents < maxSeats;
    }
}

// + getID(): String
// + getName(): String
// + getStatus(): String 
// + hasOpenSeats(): boolean 
// + toString(): String
