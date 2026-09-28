import java.util.*;
public class IT26101404lab10Q1 {
     public static void validateMarks(double marks){
        assert ((marks >= 0)&&(marks <= 100)) : "\nmarks is not in correct range";
        System.out.println("\nMark is Validated");
    }
    public static char calcGrade(double marks){
        if (marks < 40) {
            return 'F';
        } else if(marks < 50){
            return 'D';
        } else if (marks < 60) {
            return 'C';
        }else if (marks < 75) {
            return 'B';
        }else {
            return 'A';
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double marks ;
        System.out.print("\nEnteer the mark (0 - 100) : ");



        marks = input.nextDouble();
        validateMarks(marks);

        char grade = calcGrade(marks);

        if (marks >= 75) {
            assert (grade == 'A') : "Incorrect Grade Assigned";
        } else if (marks >= 60 && marks <= 74) {
            assert (grade == 'B') : "Incorrect Grade Assigned";
        } else if (marks >= 50 && marks <= 59) {
            assert (grade == 'C') : "Incorrect Grade Assigned";
        } else if (marks >= 40 && marks <= 49) {
            assert (grade == 'D') : "Incorrect Grade Assigned";
        } else {
            assert (grade == 'F') : "Incorrect Grade Assigned";
        }
        System.out.println("\nThe Grade for the Entered Mark is: " + grade+"\n\n");
        
    }
}
