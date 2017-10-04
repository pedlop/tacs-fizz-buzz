package br.com.ufg.inf.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTeste {

	@Test
	public void main(){
		
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		Assert.assertEquals("Fizz", fizzBuzz.ehFizzBuzz(66));
		Assert.assertEquals("Buzz", fizzBuzz.ehFizzBuzz(65));
		Assert.assertEquals("FizzBuzz", fizzBuzz.ehFizzBuzz(90));
		Assert.assertEquals("none", fizzBuzz.ehFizzBuzz(1));
	}
}
