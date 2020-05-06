/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;



import java.util.Date;

/**
 *
 * @author Mrinal Sharma
 */
public class Customer {
    
    private static int customerId=0;
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String reenterPassword;
    private String email;
    private int age;
    private String mobileNumber;
    private String city;
    private Date createDate;
 
    
    public enum Gender{
        Male("Male"), Female("Female"), Other("Other");
        private String value;
        private Gender(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }
    public Customer() {
        ++customerId;
    }

    public static int getCustomerId() {
        return customerId;
    }

    public static void setCustomerId(int customerId) {
        Customer.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getReenterPassword() {
        return reenterPassword;
    }

    public void setReenterPassword(String reenterPassword) {
        this.reenterPassword = reenterPassword;
    }
    
}
