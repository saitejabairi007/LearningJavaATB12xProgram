package EX12_Do_While;

public class Lab110_While_DoWhile_Diff_While {
    public static void main(String[] args) {
        int a=1;
        while(a<0){//false
            System.out.println(a);
        }
        do{//prints once
            System.out.println(a);
        }while(a<0);
    }
}
