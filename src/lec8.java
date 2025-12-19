import java.util.Scanner;

public class lec8 {
    public static void main(String[] args) {
        System.out.println("License Age calculator");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age > 18){
           System.out.println("you are eligible for license");
        }else{
            System.out.println("Not eligible");
        }
    }
}
