package UC4DeleteContact;

public class Person {
    public String fname;
    String lname;
    String city;
    String state;
    long zip;
    long phonenumber;
    String email;
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public long getZip() {
        return zip;
    }
    public void setZip(long zip) {
        this.zip = zip;
    }
    public long getPhonenumber() {
        return phonenumber;
    }
    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Person [fname=" + fname + ", lname=" + lname + ", city=" + city + ", state=" + state + ", zip=" + zip
                + ", phonenumber=" + phonenumber + ", email=" + email + "]";
    }
}
