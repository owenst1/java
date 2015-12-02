/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Person {

    private String name;
    private int age;
    private String street;
    private String city;
    private String state;
    private String zip;
    private int inch;
    private int feet;
    private double height;
    private double weight;

    public void readPersonInput() {

        this.name = JOptionPane.showInputDialog("Please enter your name?");
        String ageString = JOptionPane.showInputDialog("Please enter your age?");
        try {
            this.age = Integer.parseInt(ageString);
        } catch (NumberFormatException nfe) {
            System.out.println("Error: NO age inputed");
            System.exit(0);
        }
        this.setStreet(JOptionPane.showInputDialog("Please enter your Street?"));
        this.setCity(JOptionPane.showInputDialog("Please enter your City?"));
        this.setState(JOptionPane.showInputDialog("Please enter your State?"));
        this.setZip(JOptionPane.showInputDialog("Please enter your zip?"));
        String heightString = JOptionPane.showInputDialog("Please enter your Height in inches?");
        this.setHeight(Double.parseDouble(heightString));
        String weightString = JOptionPane.showInputDialog("Please enter your Weight in pound?");
        this.setWeight(Double.parseDouble(weightString));
        this.setPerson(name, age);
        this.setAddress(street, city, state, zip);

        System.out.println(this.toString());
        this.outputAddress();
        this.outputHeight();
        this.outputWeight();
    }

    public String toString() {
        return "Name: " + name + "\nAge: ";
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

    public boolean equals(Person otherPerson) {
        return this.name.equalsIgnoreCase(otherPerson.getName())
                && this.age == otherPerson.age;
    }

    public int compareAge(Person otherPerson) {
        return this.age - otherPerson.age;
    }

    public void outputAddress() {
        System.out.println("Street: " + this.street + "\nCity: "
                + this.city + "\nState: " + this.state + "\nZip: " + this.zip);
    }

    public void outputHeight() {
        System.out.println("Height: " + this.feet + "' " + this.inch + " '' ");
    }

    public void outputWeight() {
        System.out.printf("Weight: %.2f lbs", this.weight);
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

    public void setAddress(String state, String zip) {
        setAddress(null, null, state, zip);
    }

    public void setAddress(String city, String state, String zip) {
        setAddress(null, city, state, zip);
    }

    public void setAddress(String street, String city, String state, String zip) {
        if (street == null || street.trim().equals("")) {
            street = "Unknown";
        }
        if (city == null || city.trim().equals("")) {
            city = "Unknown";
        }
        if (state == null || state.trim().equals("")) {
            System.out.println("State cannot be empty");
            System.exit(0);
        }
        if (zip == null || zip.trim().equals("")) {
            System.out.println("Zip cannot be empty");
            System.exit(0);
        }
        this.setStreet(street);
        this.setCity(city);
        this.setState(state);
        this.setZip(zip);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setHeight(double inch) {
        this.height = inch;
    }

    public void setHeight(int inches) {

    }

    public void setHeight(int feet, int inches) {

    }

    public void setHeightCm(double centimeters) {

    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setWeight(int pounds) {

    }

    public void setWeightKilo(double kilograms) {

    }
}
