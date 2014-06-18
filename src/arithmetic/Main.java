package arithmetic;

import java.util.Scanner;

import arithmetic.model.Addition;
import arithmetic.model.ArithmeticOperation;

public class Main {
	public static void main(String[] args) {
		ArithmeticOperation[] operations = {new Addition()};
		Scanner sc = new Scanner(System.in);
		double a, b, result = Double.NaN;
		char symbol;

		System.out.print("a: ");
		a = sc.nextDouble();		

		System.out.print("b: ");
		b = sc.nextDouble();

		System.out.print("Masukkan simbol: ");
		symbol = sc.next().charAt(0);
		
		for (ArithmeticOperation operation: operations) {
			if (symbol == operation.getSign()) {
				result = operation.compute(a, b);
			}
		}
		
		System.out.println("Hasil(edit yohan): " + result);
		
		sc.close();
	}
}
