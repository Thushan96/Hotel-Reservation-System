package View.tm;

import javafx.scene.control.Button;

public class Reservationtm {
    private String name;
    private String address;
    private String NIC;
    private String telephoneNo;
    private String email;
    private Button btn;
    private String rnumber;

    public Reservationtm(String rnumber,String name, String address, String NIC, String telephoneNo, String email, Button btn) {
        this.setRnumber(rnumber);
        this.setName(name);
        this.setAddress(address);
        this.setNIC(NIC);
        this.setTelephoneNo(telephoneNo);
        this.setEmail(email);
        this.setBtn(btn);
    }



    public Reservationtm() {
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    public String getRnumber() {
        return rnumber;
    }

    public void setRnumber(String rnumber) {
        this.rnumber = rnumber;
    }
}
