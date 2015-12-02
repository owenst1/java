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
public class PersonDemo {

    public static void main(String[] args) {
        int answer;
        JOptionPane.showMessageDialog(null, "Welcome to the person compare.");
        do {
            Person s1 = new Person();
            s1.readPersonInput();
            s1.getName();

            Person s2 = new Person();
            s2.readPersonInput();

            if (s1.name.equalsIgnoreCase(s2.name)) {
                String nameCompare = ("This is the same person!!");
                JOptionPane.showMessageDialog(null, nameCompare);
            }

            String ageCompare = "Please enter ages.";

            if (s1.compareAge(s2) == 0) {
                ageCompare = (s1.name + " and " + s2.name + " are the same age");

            } else if (s1.compareAge(s2) > 0) {
                ageCompare = (s1.name + " is older then " + s2.name);

            } else if (s1.compareAge(s2) < 0) {
                ageCompare = (s1.name + " is younger then " + s2.name);
            }
            JOptionPane.showMessageDialog(null, ageCompare);

            Person adult = Person.createAdult();
            //test
            if (!adult.getName().equalsIgnoreCase("An Adult") || adult.getAge() != 21) {
                System.out.println("Named constructor error adult!");
            }

            Person defaultPerson = new Person();

            if (!defaultPerson.getName().equals("No name yet") || defaultPerson.getAge() != 0) {

                System.out.println("Default constructor error!");
            }

            Person masterPerson = new Person("Sam", 7);
            //test
            if ((!masterPerson.getName().equals("Sam")) || masterPerson.getAge() != 7) {
                System.out.println("Master constructor error!");
            }

            Person namedPerson = new Person("Fred", 5);
            //test
            if (!namedPerson.getName().equals("Fred") || namedPerson.getAge() != 5) {
                System.out.println("Named constructor error!");
            }
            Person toddler = Person.createToddler();
            //test
            if (!toddler.getName().equalsIgnoreCase("A Toddler") || toddler.getAge() != 2) {
                System.out.println("Named constructor error toddler!");
            }
            Person Preschooler = Person.createPreschooler();
            //test
            if (!Preschooler.getName().equalsIgnoreCase("A Preschooler") || Preschooler.getAge() != 5) {
                System.out.println("Named constructor error Preschooler!");
            }
            Person Adolescent = Person.createAdolescent();
            //test
            if (!Adolescent.getName().equalsIgnoreCase("An Adolescent") || Adolescent.getAge() != 9) {
                System.out.println("Named constructor error Adolescent!");
            }
            Person Teenager = Person.createTeenager();
            //test
            if (!Teenager.getName().equalsIgnoreCase("A Teenager") || Teenager.getAge() != 15) {
                System.out.println("Named constructor error Teenager!");
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            answer = JOptionPane.showConfirmDialog(null, "Do you want to run this program again?", "Click Yes or No:", JOptionPane.YES_NO_OPTION);
        } while (answer == JOptionPane.YES_OPTION);
        System.exit(0);

    }

}
