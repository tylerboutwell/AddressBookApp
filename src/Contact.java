public class Contact {
    private String name;
    private String phoneNumber;
    private int idNumber;

    public Contact(String name, String number, int id) {
        this.name = name;
        this.phoneNumber = number;
        this.idNumber = id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String toString() {
        return "ID#" + getIdNumber() + "\nName: " + getName() + "\nNumber: " + getPhoneNumber() + "\n";
    }
}

