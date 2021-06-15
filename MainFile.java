import java.util.Scanner;

public class MainFile {
    public static void main (String[] args){
        //Initialize
        int weight = 0; 
        WeeklyWeight W = new WeeklyWeight();
        int[] weights = new int[7];
        Scanner input = new Scanner (System.in);
        int remainingWeight= 0;
        int start = 0;
        int end = 0;
        int calculatedWeight = 0;

        // ask user the goal weight
        System.out.println("Please Enter Your Goal Weight in pounds: ");
        int goal = input.nextInt();

        //get weight of each day from the user and store it in array.
        for (int i = 0; i < 7; i++){
            System.out.println("Please Enter Weight of " + (i + 1) + "day of the week: ");
            weight = input.nextInt();
            W.addingInfo(weights, weight, i);
        }
        W.print(weights);

        //calculate the remaining weight for goal
        remainingWeight = weights[6] - goal;
        if (remainingWeight < 0){
            remainingWeight = remainingWeight * -1;
            System.out.println("you need to gain " + remainingWeight + " pounds.");
        } else {
            System.out.println("you need to lose " + remainingWeight + " pounds.");
        }

        System.out.println("From which day to day do you want to calculate you weight change? ");
        System.out.println("1: Monday");
        System.out.println("2: Tuesday");
        System.out.println("3: Wednesday");
        System.out.println("4: Thursday");
        System.out.println("5: Friday");
        System.out.println("6: Saturday");
        System.out.println("7: Sunday");

        start = input.nextInt();
        end = input.nextInt();

        calculatedWeight = W.calculateWeight(weights, start, end);
        
        System.out.println("The weight changes from day" + start + " to day" + end + " is " + calculatedWeight);
        input.close();
    }

    
}