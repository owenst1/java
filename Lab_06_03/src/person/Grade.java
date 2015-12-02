package person;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Grade {
    public static final double QWEIGHT=.25;
    public static final double MWEIGHT=.25;
    public static final double FWEIGHT=.50;
    public double quiz1,quiz2,midterm,exam;
    public double quiz;
    public double total;
    public String grade;
    
    /**
     * @param args the command line arguments
     */
    public void readGradeInput(){
      
        String quiz1String = JOptionPane.showInputDialog("Quiz 1 score");
        quiz1=Integer.parseInt(quiz1String);
        String quiz2String = JOptionPane.showInputDialog("Quiz 2 score");
        quiz2=Integer.parseInt(quiz2String);
        String midtermString = JOptionPane.showInputDialog("Midterm score");
        midterm=Integer.parseInt(midtermString);
        String examString = JOptionPane.showInputDialog("Exam score");
        exam=Integer.parseInt(examString);   
    }
    
    public void calcGrade(){
        quiz=(quiz1+quiz2)/20;
        total=((quiz *QWEIGHT)+((midterm/100) * MWEIGHT)+((exam/100) * FWEIGHT))*100;
         if (total>=90){
            grade="A";
        }
        else if (total>=80){
            grade="B";
        }
        else if (total>=70){
            grade="C";
        }
        else if (total>=60){
            grade="D";
        }        
        else{
            grade="F";
        } 
    }

    public void writeGrade(){
       String out ="Your final precent is %1.2f%% which is a ";
        out = String.format(out, total);
        JOptionPane.showMessageDialog(null,out + grade);
    }
}
