import java.util.Scanner;

public class Main {
    // Application code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //School Number 1
        DSchoolList dl = new DSchoolList();
        School sch1 = new School();
        Address address1 = new Address("Gunung Rapat", "Ipoh", "31350", "Perak");
        Marks marks1 = new Marks(3);

        sch1.setName("SMK GUNUNG RAPAT");
        sch1.setAddress(address1);
        sch1.setPrincipal("Encik Mohammad Khairul");

        for(int i=0; i<3; i++){
            System.out.print("Mark of participant No." + (i+1) +": ");
            int mark = sc.nextInt();
            try {
                marks1.setMark(mark, i);
            }
            catch (Exception ex) {
                System.out.print("Marks must be positive");
                ex.printStackTrace();
            }
        }
        sch1.setMarks(marks1);
        dl.addSchool(sch1);
        System.out.println();

        //School Number 2
        School sch2 = new School();
        Address address2 = new Address("Jalan Pasir Puteh", "Ipoh", "31250", "Perak");
        Marks marks2 = new Marks(3);

        sch2.setName("SMK JALAN PASIR PUTEH");
        sch2.setAddress(address2);
        sch2.setPrincipal("Sir Sundra Mukthakhir");

        for(int i=0; i<3; i++){
            System.out.print("Mark of participant No." + (i+1) +": ");
            int mark = sc.nextInt();
            try {
                marks2.setMark(mark, i);
            }
            catch (Exception ex) {
                System.out.print("Marks must be positive");
                ex.printStackTrace();
            }
        }
        sch2.setMarks(marks2);
        dl.addSchool(sch2);
        System.out.println();

        dl.display();
    }
}
