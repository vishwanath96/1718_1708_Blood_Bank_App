package com.example.bloodline;

public class UserInformation {

    String Name;
    String donor_id;
    String donor_bloodGroup;
    String age;
    String gender;
    String city;
    String contact;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setDonor_id(String donor_id) {
        this.donor_id = donor_id;
    }

    public void setDonor_bloodGroup(String donor_bloodGroup) {
        this.donor_bloodGroup = donor_bloodGroup;
    }



    public UserInformation()
    {

    }

    public UserInformation(String donor_id, String name, String donor_bloodGroup, String age, String gender, String city, String contact) {
        this.donor_id = donor_id;
        this.Name=name;
        this.donor_bloodGroup=donor_bloodGroup;
        this.age=age;
        this.gender=gender;
        this.city=city;
        this.contact=contact;
    }

    public String getName() {
        return Name;
    }

    public String getDonor_id() {
        return donor_id;
    }

    public String getDonor_bloodGroup() {
        return donor_bloodGroup;
    }
}
