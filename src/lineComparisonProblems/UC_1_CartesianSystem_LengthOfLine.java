package lineComparisonProblems;

import java.util.Scanner;

public class UC_1_CartesianSystem_LengthOfLine {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Co-ordinates(x1,y1): \n");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        System.out.printf("First Co-ordinates (x1= %g , y1= %g)%n",x1,y1);
        System.out.print("Enter Second Co-ordinates(x2,y2): \n");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        scan.close();
        System.out.printf("Second Co-ordinates (x2= %g , y2= %g)%n",x2,y2);
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length = (double)Math.sqrt(a);
        System.out.println();
        System.out.println("Length of a line: "+length);
    }
}
