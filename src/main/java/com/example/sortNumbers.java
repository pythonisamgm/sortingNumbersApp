package com.example;
import javax.swing.JOptionPane;


public class sortNumbers {

    public static void bubbleAscSort(int numbersArray[], int n){
        int i, j, temp;
        boolean swapped; 
        for (i = 0; i < n; i++){
            swapped = false; 
            for (j = 0; j < n - i - 1; j++){
                if (numbersArray[j] > numbersArray[j+1]){
                    temp = numbersArray[j];
                    numbersArray[j] = numbersArray[j+1];
                    numbersArray[j+1]=temp;
                    swapped = true; 
                }
            }
            if (swapped == false)
            break; 
        }
    }

    public static void bubbleDescSort(int numbersArray[], int n){
        int i, j, temp;
        boolean swapped; 
        for (i = 0; i < n; i++){
            swapped = false; 
            for (j = 0; j < n - i - 1; j++){
                if (numbersArray[j] < numbersArray[j+1]){
                    temp = numbersArray[j];
                    numbersArray[j] = numbersArray[j+1];
                    numbersArray[j+1]=temp;
                    swapped = true; 
                }
            }
            if (swapped == false)
            break; 
        }
    }
    
    public static void main(String[] args){
        
        String userNumbersString = JOptionPane.showInputDialog( "Enter a list of numbers of your choice: ");
        System.out.println(userNumbersString);

        String[] options = {"ascending", "descending"};
        
        int selection = JOptionPane.showOptionDialog(null, "Select one:", "Number Sort App", 
        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, 
        options, options[0]); 

        String[] convertedNumbersArray = userNumbersString.split(", ");
        int[] numbersArray = new int[convertedNumbersArray.length];

        for (int i = 0; i < convertedNumbersArray.length; i++) {
        numbersArray[i] = Integer.parseInt(convertedNumbersArray[i]); }
        
        int n = numbersArray.length;
        if (selection == 0) {
            bubbleAscSort(numbersArray, n);
            }
        else if (selection == 1)  {
            bubbleDescSort(numbersArray, n);
            }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbersArray.length; i++ ){
            stringBuilder.append(numbersArray[i]);
                if (i < numbersArray.length)
                    {
                    stringBuilder.append(", ");
                    }
                }
        String arrayAsString = stringBuilder.toString();
        String replacedString = arrayAsString.replace("4", "(3+1)");
            
        JOptionPane.showMessageDialog(null, replacedString);  
    } 
}


