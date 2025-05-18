package EX03_Java_Basics_Literals;

public class Lab023_Literals {
    public static void main(String[] args) {
        char A1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
       //char A = "A"; // "" == String = Bunch of Chars
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; // blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Sai Teja \n is a good boy");
        System.out.println("Sai Teja\tis a good boy");
        System.out.println("Sai Teja\bis a good boy");
        System.out.println("Sai Teja\ris a good boy");

        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");


        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';


    }
}
