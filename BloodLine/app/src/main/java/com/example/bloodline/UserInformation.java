package com.example.bloodline;

public class UserInformation {

    String Name;
    String donor_id;
    String donor_bloodGroup;

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

    public UserInformation(String donor_id, String name, String donor_bloodGroup) {
        this.donor_id = donor_id;
        this.Name=name;
        this.donor_bloodGroup=donor_bloodGroup;
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
