import java.util.Scanner;

public class indexMethod {
    public static void main(String[]args){
        Scanner abc = new Scanner(System.in);
        System.out.print("Enter score to calculate : ");
        int total = abc.nextInt();
        
        double[]score = = new double[total];
        double sum = 0;
        int count = 0;
        
        for (int =0; i<score.length); ++i) {
            System.out.print("Score " + (i+1);
            score[i] = input.nextDouble();
            sum+= score[i];
        }
        
        double average = sum/scores.length;
        
        int numAbove, numBelow = 0;
        for (int i =0; i<scores.length; i++)
            if (scores[i])>= average)
                numAbove++;
            else
                numBelow++;
                
                System.out.println("______");
                System.out.println("average " + average);
                System.out.println(" above " + numAbove);
                System.out.println("below " + numBelow);
                
    }
}
    

