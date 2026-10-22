/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentinformationsystem;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentInformationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        float marks1, marks2, total;
        
        System.out.println("Student Name: AMAR HAIQAL BIN SHAIFUL RIZAL");
        System.out.println("Student ID: S88338");
        
        System.out.println("Enter your marks 1: ");
        marks1 = input.nextFloat();
        
        System.out.println("Enter your marks 2: ");
        marks2 = input.nextFloat();
        
        total = (marks1 + marks2)/2;
        
        if (total >= 80){
            System.out.println("Result: EXCELLENT");
        }else if(total >= 50 && total <= 79){
            System.out.println("Result: GOOD");
        }else {
            System.out.println("Result: NEEDS IMPROVEMENT");
        }
        
    }
    
}
