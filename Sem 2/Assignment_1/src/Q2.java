import java.util.Scanner;

// The body mass index (BMI) is commonly used by health and nutrition professionals to estimate
// human body fat in populations. It is computed by taking the individual's weight (mass) in
// kilograms and dividing it by the square of their height in meters. i.e.
// Metric: BMI = 𝑾𝒆𝒊𝒈𝒉𝒕 (𝒌𝒈)/(𝑯𝒆𝒊𝒈𝒉𝒕)𝟐 (𝒎𝟐)
// Write a java program by using conditional statement to show the category for a given BMI.
// Category BMI:

// Less than 18.5     Underweight
// 18.5 to 24.9       Normal Weight
// 25.0 to 29.9       Overweight
// 30.0 or more Obese


// Sample Run-1:
// Enter person Weight in kg: 68
// Enter height of person in meter: 2
// The person is Underweight.
// Sample Run-2:
// Enter person Weight in kg: 96
// Enter height of person in meter: 1.4
// The person is Obese.




public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person Weight in kg : ");
        int weight = sc.nextInt();
        System.out.print("Enter heigh of person in metre :");
        double height = sc.nextDouble();
        System.out.print("The Person is ");
        double bmi = weight/(height*height);
        if (bmi < 18.5)
            System.out.print("Underweight");
        else if (bmi > 18.5 && bmi < 24.9)
            System.out.print("Normal Weight");
        else if (bmi > 25.0 && bmi < 29.9)
            System.out.print("Overweight");
        else if (bmi >= 30.0)
            System.out.print("Obese");
    }

    
}
