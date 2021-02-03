
package arraylab;

public class ArrayLab {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number of quiz scores to process: ");
        int totalScores = input.nextInt();
        System.out.println();
        
        double[]scores = new double[totalScores];
        double sum = 0;
        int count = 0;
        
        for (int i = 0; i< scores.length; ++i){
            System.out.print("Score " + (i + 1) + ":");
            scores[i] = input.nextDouble();
            sum+= scores[i];
        }
        
        double average = sum/scores.length;
        int numAbove = 0;
        int numBelow = 0;
        
        for (int i = 0; i< scores.length; i++)
            if (scores[i] >= average)
                numAbove++;
            else
                numBelow++;
        
        System.out.println("Results");
        System.out.println("Average: " + average);
        System.out.println("Above/Equal to Average: " + numAbove);
        System.out.println("Below Average: " + numBelow);
        
    }
    
}
