/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Person {

    public String name;
    public int age;
    private String street;
    private String city;
    private String state;
    private String zip;

    public void readPersonInput() {

        this.name = JOptionPane.showInputDialog("Please enter your name?");
        String ageString = JOptionPane.showInputDialog("Please enter your age?");
        this.age = Integer.parseInt(ageString);
        Grade g1 = new Grade();
        // JOptionPane.showMessageDialog(null, "Welcome to the Weighted Grade Calc " + this.name + ".");
        //  g1.readGradeInput();
        //  g1.calcGrade();
        // g1.writeGrade();
        System.out.println(this.toString());
    }

    public String toString() {
        return "Name: " + this.name + "\n Age: " + this.age;
    }

    public Person() {
        name = "No name yet";
        age = 0;
    }

    public Person(String name, int age) {
        set(name, age);
    }

    public Person(String name) {
        this(name, 0);
    }

    public void setPerson(String name, int age) {
        set(name, age);
    }

    private void set(String name, int age) {
        this.name = name;

        if (age < 0) {
            System.out.println("Error: Negative age");
            System.exit(0);
        } else {
            this.age = age;
        }
    }

    public static Person createAdult() {
        Person t = new Person("An Adult", 21);
        return t;
    }

    public static Person createToddler() {
        Person t = new Person("A Toddler", 2);
        return t;
    }

    public static Person createPreschooler() {
        Person p = new Person("A Preschooler", 5);
        return p;
    }

    public static Person createAdolescent() {
        Person t = new Person("An Adolescent", 9);
        return t;
    }

    public static Person createTeenager() {
        Person t = new Person("A Teenager", 15);
        return t;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Street: " + getStreet());
        System.out.println("City: " + getCity());
        System.out.println("State: " + getState());
        System.out.println("Zip: " + getZip());
    }

    public boolean equals(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.getName())
                && this.age == otherPerson.age;
    }

    public int compareAge(Person otherPerson) {
        return this.age - otherPerson.age;
    }

    /**
     * ****************ACCESSORS************************
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @param street the street to set
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the zip
     */
    public String getZip() {
        return zip;
    }

    /**
     * @param zip the zip to set
     */
    public void setZip(String zip) {
        this.zip = zip;
    }
    

}
