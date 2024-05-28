package com.example;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Hello world!
 */
public class sortNumbers {
    public static void main(String[] args){
        List<Integer> userNumbers = new ArrayList<>();
        String userInputString = JOptionPane.showInputDialog( "Enter a list of numbers of your choice: ");
        System.out.println(userInputString);
        String[] options = {"ascending", "descending"};
        int selection = JOptionPane.showOptionDialog(null, "Select one:", "Number Sort App", 0, 0, null, options, options[0]); 
        
        
        
    }
//input enter a list of numbers of your choice
//input 
//order it in ascending order
//order it in descending order


}
