package com.company;

public class employee {

    private String Fname, Lname, ID, gender, position;
    private int salary;

    public employee(String firstname, String Lastname, String Gender, int count) {
        this.Fname = firstname;
        this.Lname = Lastname;
        this.gender = Gender;
        if(this.Fname.length() > 0 && this.Lname.length() > 0 && this.gender.length() > 0) {
            this.ID = this.Fname.charAt(0) + this.Lname.charAt(0) + "umbc" + this.gender.toUpperCase().charAt(0) + count;
            System.out.println(this.Fname + " " + this.Lname + " ID number is " + this.ID);
        } else {
            System.out.println("Missing name or gender, ID set to default 0");
            this.ID = "0";
        }
    }
    public int returnSalary(){
        return salary;
    }
    public boolean hasBenefit(){
        return false;
    }
    public boolean haspension() {
        return false;
    }

}
