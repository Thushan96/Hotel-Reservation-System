package Model;

public class Reservation {
    private String rnumber;
    private String name;
    private String address;
    private String NIC;
    private String telephoneNo;
    private String email;

    public Reservation(String rnumber,String name, String address, String NIC, String telephoneNo, String email) {
        this.setRnumber(rnumber);
        this.name = name;
        this.address = address;
        this.NIC = NIC;
        this.telephoneNo = telephoneNo;
        this.email = email;
    }

    public Reservation() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public String getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(String telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRnumber() {
        return rnumber;
    }

    public void setRnumber(String rnumber) {
        this.rnumber = rnumber;
    }
}
