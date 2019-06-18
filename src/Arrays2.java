import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int input;

// #1| Prints out string in reverse
        System.out.println("Enter text: ");
        String testStr = keyboard.nextLine();
        for (int i = testStr.length() - 1; i>-1; i--){
            System.out.print(testStr.charAt(i));
        }
        System.out.println();

// #2| Tests for number of characters in string without .length();
//Converts string to char array and checks if null (char ascii null value = 0)
//then adds 1 for each non null value

        int sum =0;
        for (char c: testStr.toCharArray()){
           if (c != 0){
               sum = sum + 1;
           }
        }
        System.out.println("Length of String: " + sum);


//   #3 | Adds user inputs into an array but if that number exists it adds it as a NULL value


//     Couldnt get for each loop to work
/// !!! Didn't work because 'i' is not a counter in for each loop.
// looks for unique values but these are all 0
//        for (int i: userArray) {
//            System.out.println("Enter Value #" + i);
//            input = keyboard.nextInt();

//            userArray[i] = input;
//            System.out.println(i + ": " + userArray[i]);
//
//        }

        Integer userArray[] = new Integer[10]; //int didn't work because of null so changed to Integer
        for (int i = 0; i<userArray.length; i++){
            System.out.println("Enter Value #" + (i+1));
            input = keyboard.nextInt();
            userArray[i] = input;
            for (int h=0; h<i; h++){
                if (userArray[i]==userArray[h]){
                    userArray[i] = null;
                }
            }

        }
        System.out.println(Arrays.toString(userArray));



//  4|Given two arrays, determines the pairs that give sum of 13
//    Gives 6,7 AND 6,7 --Need only one
        int[] arrA = {1,7,5,6,9};
        int[] arrB = {2,7,6,3,4};
        for (int a : arrA){
            for (int b : arrB){
                if(a + b ==13){
                    System.out.println(a + ", " + b);
                }
            }
        }

// 5| Prompt user to input 10 values and store them into an array.
//    Output the total number of odd and even values in array
        int array5[] = new int[10];
        int evens = 0;
        int odds = 0;
        for (int i = 0; i<userArray.length; i++) {
            System.out.println("Enter Value #" + (i + 1));
            array5[i] = keyboard.nextInt();
            if (array5[i]%2==0){
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Number of even numbers: " + evens);
        System.out.println("Number of odd numbers: " + odds);







    }
}
