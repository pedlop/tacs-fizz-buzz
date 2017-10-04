package br.com.ufg.inf.fizzBuzz;

public class FizzBuzz {

	public String ehFizzBuzz(int num) {

		if (num % 15 == 0) {
			System.out.println("FizzBuzz");
			return "FizzBuzz";
		} else if (num % 3 == 0) {
			System.out.println("Fizz");
			return "Fizz";
		} else if (num % 5 == 0) {
			System.out.println("Buzz");
			return "Buzz";
		} else {
			System.out.println(String.valueOf(num));
			return "none";
		}
	}

}
