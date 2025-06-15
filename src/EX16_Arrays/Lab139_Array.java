package EX16_Arrays;

import java.util.Arrays;

public class Lab139_Array {
    public static void main(String[] args) {

// Declaration
        int[] numbers;

// Initialization
        numbers = new int[5]; // default values are 0

        numbers[0]=10;
        numbers[1]=10;
        numbers[2]=10;
        numbers[3]=10;
        numbers[4]=10;
        System.out.println(numbers[0]);


        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
        //        System.out.println(marks[-1]); // //ArrayIndexOutOfBoundsException
//        System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException

// Declaration + Initialization
        String[] browsers = {"Chrome", "Firefox", "Edge"};
        System.out.println(browsers[0]);

//        String name="sai";
//        String name2 = Arrays.toString(name.split(""));
//        System.out.println(name2);

        //accessing arrays
//        for loop

        for(int i = 0;i< browsers.length;i++){
            System.out.println(browsers[i]);

        }

        //enhanced loop for each

        for(String browser:browsers){
            System.out.println(browser);
        }
    }
}
