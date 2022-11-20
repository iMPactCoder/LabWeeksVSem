class Person {
    String name;
    int ph_no;

    void setperson(String name, int ph_no) {
        this.name = name;
        this.ph_no = ph_no;
    }

    class Address {
        int house_no;
        int street;
        String city;
        String state;

        void setaddress(int house_no, int street, String city, String state) {
            this.house_no = house_no;
            this.street = street;
            this.city = city;
            this.state = state;
        }

        void displayadd() {
            System.out.println("Address : House no. " + house_no + ", street no. " + street + ", " + city + ", " + state);
        }

    }

    class DateOfBirth {
        int day;
        int month;
        int year;

        void serdateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayDOB() {
            System.out.println("DOB :" + day + "/" + month + "/" + year);
        }

    }

    void Display() {

        Address a = new Address();
        DateOfBirth dob = new DateOfBirth();
        System.out.println(name);
        a.displayadd();
        dob.displayDOB();
    }
}

public class W10Q1 {

}
