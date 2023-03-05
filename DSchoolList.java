import java.util.ArrayList;

public class DSchoolList {
    // data section
    ArrayList<School> schools = new ArrayList<>();

    public void addSchool(School sc) {
        schools.add(sc);
    }

    public void display() {
        for (int i=0; i<schools.size(); i++) {
            System.out.println("School Name: " + schools.get(i).getName());
            System.out.println("School Address: " + schools.get(i).getAddress().getAddress());
            System.out.println("Principal: " + schools.get(i).getPrincipal());
            System.out.println("Average Mark: " + schools.get(i).getMarks().calcAvg());
            System.out.println();
        }
    }

}