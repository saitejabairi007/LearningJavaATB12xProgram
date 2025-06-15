package EX16_Arrays;

public class Lab143_Max_Min {
    public static void main(String[] args) {
        int[] marks ={1,2,3,4,5,9,2};

        int max=marks[0];
        int min=marks[0];

        for(int i=0;i< marks.length;i++){
            if(marks[i] > max){
                max = marks[i];
            }
        }
        System.out.println("Max is " +max);
        for(int i =0;i<marks.length;i++){
            if(marks[i]<min){
                min=marks[i];
            }
        }
        System.out.println("Min is "  + min);




        //enhanced loop
        for(int n:marks){
            if(n>max){
                max=n;
            }
        }
        System.out.println(max);

    }
}
