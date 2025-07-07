package EX22_ENUM;

public class Lab196_EnumP2 {
    public static void main(String[] args) {
        System.out.println(urls.katalon);
        if (urls.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}

enum urls{
    chrome,doodle,firefox,katalon;
}