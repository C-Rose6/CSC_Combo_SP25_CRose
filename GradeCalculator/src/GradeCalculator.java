import java.util.Scanner;

public class GradeCalculator {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter number grade");
	
		double numGrade = input.nextDouble();	
		
		if (numGrade >= 0.0 && numGrade < 60.0) {
			System.out.println("Your grade is an F"); }
			
		if (numGrade >= 60.0 && numGrade < 67.0) {
			System.out.println("Your grade is an D"); }
		
		if (numGrade >= 67.0 && numGrade < 69.0) {
			System.out.println("Your grade is an D+"); }
		
		if (numGrade >= 69.0 && numGrade < 72.0) {
			System.out.println("Your grade is an C-"); }
		
		if (numGrade >= 72.0 && numGrade < 77.0) {
			System.out.println("Your grade is an C"); }
		
		if (numGrade >= 77.0 && numGrade < 79.0) {
			System.out.println("Your grade is an C+"); }
		
		if (numGrade >= 79.0 && numGrade < 82.0) {
			System.out.println("Your grade is a B-"); }
		
		if (numGrade >= 82.0 && numGrade < 87.0) {
			System.out.println("Your grade is a B"); }
		
		if (numGrade >=87.0 && numGrade < 89.0) {
			System.out.println("Your grade is a B+"); }
		
		if (numGrade >= 89.0 && numGrade < 92.0) {
			System.out.println("Your grade is a A-"); }
		
		if (numGrade >= 92.0) {
			System.out.println("Your grade is a A"); }
		}
	
}


