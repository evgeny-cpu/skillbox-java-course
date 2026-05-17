package ConsoleCustomerList;

public class Customer {
    private String name;
    private String phone;
    private String email;

    public Customer(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Клиент " +
                "name= " + name + '\'' +
                ", phone= " + phone + '\'' +
                ", email= " + email + '\'' + "\n";
    }
}
