import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        //initalize scanner
        Scanner scanner = new Scanner(System.in);
        
        //output and input
        System.out.println("Please enter your birth month (1 - 12): ");
        int birthMonth = scanner.nextInt();

        
        //process and output user input
        if (birthMonth >= 1 && birthMonth <= 12 ){
            System.out.println("Your birth month is: " + birthMonth);
            
        } else {
            System.out.println("You have entered an incorrect month value: " + birthMonth);
        }
        
    }
}
