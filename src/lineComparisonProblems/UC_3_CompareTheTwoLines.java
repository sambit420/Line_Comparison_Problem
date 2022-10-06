package lineComparisonProblems;

import java.util.Scanner;

public class UC_3_CompareTheTwoLines {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First line End Points:-");
        System.out.print("Enter First Co-ordinates(x1,y1): \n");
        double x1= scan.nextDouble();
        double y1= scan.nextDouble();
        System.out.printf("First Co-ordinates (x1= %g , y1= %g)%n",x1,y1);
        System.out.print("Enter Second Co-ordinates(x2,y2): \n");
        double x2= scan.nextDouble();
        double y2= scan.nextDouble();
        System.out.printf("Second Co-ordinates (x2= %g , y2= %g)%n",x2,y2);
        double a = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        double length1 = (double)Math.sqrt(a);
        System.out.println();
        System.out.println("Length of the line 1: "+length1+"\n");
        System.out.println("Enter Second line End Points:-");
        System.out.print("Enter First Co-ordinates(x3,y3): \n");
        double x3= scan.nextDouble();
        double y3= scan.nextDouble();
        System.out.printf("First Co-ordinates (x3= %g , y3= %g)%n",x3,y3);
        System.out.print("Enter Second Co-ordinates(x4,y4): \n");
        double x4= scan.nextDouble();
        double y4= scan.nextDouble();
        scan.close();
        System.out.printf("Second Co-ordinates (x4= %g , y4= %g)%n",x4,y4);
        double b = (x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3);
        double length2 = (double)Math.sqrt(b);
        System.out.println();
        System.out.println("Length of the line 2: "+length2);

        //Comparing both the lines.
        String l1 = Double.toString(length1);
        String l2 = Double.toString(length2);
        boolean equal = l1.equals(l2);
        System.out.println("Equality of two lines using Java equals method is: "+equal);
        int comp = l2.compareTo(l1);
        System.out.println("Comparing two lines using Java compareTo method is: "+comp);
        if (comp > 0)
            System.out.println("Line-1 is greater than Line-2");
        else if (comp < 0)
            System.out.println("Line-1 is less than Line-2");
        else
            System.out.println("Line-1 is equal to Line-2");
    }
}
