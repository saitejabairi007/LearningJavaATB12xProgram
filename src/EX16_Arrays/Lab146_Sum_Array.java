package EX16_Arrays;

public class Lab146_Sum_Array {
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6,7,8};
int sum =0;
        for (int i:n) {
            sum=sum+i;
        }
        System.out.println("Sum of an array is: "+ sum);
    }
}
