public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setPhoneNumber(String number) {
        this.phoneNumber = number;
    }

    public String toString() {
        return "Name: " + getName() + "Number: " + getPhoneNumber();
    }
}

