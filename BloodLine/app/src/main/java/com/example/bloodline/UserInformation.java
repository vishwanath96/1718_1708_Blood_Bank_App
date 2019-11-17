package com.example.bloodline;

public class UserInformation {

    public String Name;
    public String donor_id;
    public String donor_bloodGroup;

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
