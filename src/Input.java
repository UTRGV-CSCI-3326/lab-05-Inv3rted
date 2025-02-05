import java.util.Scanner;
public class Input{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your weight: ");
        float weight = input.nextFloat();
        System.out.print("True or False: You have a history of smoking. ");
        boolean smoker = input.nextBoolean();
        System.out.println("Here is all of your information:");
        System.out.println("Name: "+ name);        
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("History of smoking? " + smoker);
    }
}
