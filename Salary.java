import java.util.Scanner;

public class Salary {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Work hours per day: ");
        int fhour = input.nextInt();

        System.out.print("Work hours per day: ");
        int frate = input.nextInt();

        int daily = fhour*frate;
        int weekly = daily*5;
        int monthly= weekly*4;
        int yearly = monthly*12;
        
        input.close();

        System.out.println("Your hour(s) of work per day is " + fhour);
        System.out.println("Your hourly rate is " + fhour);
        System.out.println("----------");
        System.out.println("Salary per day: " + daily);
        System.out.println("Salary per week: " + weekly);
        System.out.println("Salary per month: " + monthly);
        System.out.println("Salary per year: " + yearly);
    }
}