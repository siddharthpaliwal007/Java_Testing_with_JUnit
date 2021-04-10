package TrigonometricFunc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class Func_TrigoTest {
	
	double dec_Val = 0.0001;
	
	////////////////////////////////////1 Zero Radiant Test //////////////////////////////////////
	
	// Testing sine value for zero radiant value as actual output with the math.sin() method as expected output.
	@Test
	void test_sin_zero_method() 
	{
		
	assertEquals(Math.sin(0), Func_Trigo.calculate_sine(0), dec_Val);
	}
	
	// Testing cosine value for zero radiant value as actual output with the math.cos() method as expected output.
	@Test	
	void test_cos_zero_method() 
	{
		
	assertEquals(Math.cos(0), Func_Trigo.calculate_cosine(0), dec_Val);
	}
	
	
	// Testing tangent value for zero radiant value as actual output with the math.tan() method as expected output.
	@Test
	void test_tan_zero_method()
	{
		
	assertEquals(Math.tan(0), Func_Trigo.calculate_tangent(0), dec_Val);
	}

	//////////////////////////////2 Degree value as input////////////////////////
	
	// Testing sine value for 45 degree to radiant value as actual output with the math.sin() of 45 degree method as expected output.
	@Test
	void test_sin_degree_to_rad() 
	{
		
	assertEquals(Math.sin(Math.toRadians(45)), Func_Trigo.calculate_sine(Func_Trigo.convert_deg_to_rad(45)), dec_Val);
	}
	
	// Testing cosine value for 45 degree to radiant value as actual output with the math.cos() of 45 degree method as expected output.
	@Test
	void test_cos_degree_to_rad() 
	{
		
	assertEquals(Math.cos(Math.toRadians(45)), Func_Trigo.calculate_cosine(Func_Trigo.convert_deg_to_rad(45)), dec_Val);
	}
	
	// Testing tangent value for 45 degree to radiant value as actual output with the math.tan() of 45 degree method as expected output.
	@Test
	void test_tan_degree_to_rad() 
	{
		
	assertEquals(Math.tan(Math.toRadians(45)), Func_Trigo.calculate_tangent(Func_Trigo.convert_deg_to_rad(45)), dec_Val);
	}
	
	
	
	///////////////////////////////////////3 Large Radiant Value ////////////////////////////////////////////////////
	
	//Testing sine value for 5156.62 radiant value as actual output with the math.sin() method as expected output.
	@Test
	void test_Sin_Large_Rad() 
	{
	assertEquals(Math.sin(5156.62), Func_Trigo.calculate_sine(5156.62), dec_Val);
	}
	
	//Testing cosine value for 5156.62 radiant value as actual output with the math.cos() method as expected output.
	@Test
	void test_Cos_Large_Rad() 
	{
	assertEquals(Math.cos(5156.62), Func_Trigo.calculate_cosine(5156.62), dec_Val);
	}
	
	//Testing tangent value for 5156.62 radiant value as actual output with the math.tan() method as expected output.
	@Test
	void test_Tan_Large_Rad() 
	{
	assertEquals(Math.tan(5156.62), Func_Trigo.calculate_tangent(5156.62), dec_Val);
	}
	
	
	/////////////////////////////////////////// 4 Negative Radiant Value ////////////////////////////////////////////////////
	
	//Testing sine value for -5156.62 radiant value as actual output with the math.sin() method as expected output.
	@Test
	void test_Sin_Negative_Radian() 
	{
	assertEquals(Math.sin(-5156.62), Func_Trigo.calculate_sine(-5156.62), dec_Val);
	}
	
	//Testing cosine value for -5156.62 radiant value as actual output with the math.cos() method as expected output.
	@Test
	void test_Cos_Negative_Radian() 
	{
	assertEquals(Math.cos(-5156.62), Func_Trigo.calculate_cosine(-5156.62), dec_Val);
	}
	
	//Testing tangent value for -5156.62 radiant value as actual output with the math.tan() method as expected output.
	@Test
	void test_Tan_Negative_Radian()
	{
	assertEquals(Math.tan(-5156.62), Func_Trigo.calculate_tangent(-5156.62), dec_Val);
	}
	

	/////////////////////////////////////////// 5 - Factorial Function Positive Case ////////////////////////////////////////////////////
	
	
	//Testing factorial of positive number (5) with the the given factorial value(120) of 5
	@Test
	void test_factorial_positive_method() 
	{
	assertEquals(120, Func_Trigo.calculate_factorial(5));
	}
	
	
	
	/////////////////////////////////////////// 6 - Factorial Function Negative Case ////////////////////////////////////////////////////
	
	//Testing factorial of negative number (-5) is null
	@Test
	void test_factorial_negative_method()
	{
	assertNull(Func_Trigo.calculate_factorial(-5));
	}
	
	
	/////////////////////////////////////////// 7 - Exponent and Base value Positive ////////////////////////////////////////////////////
		
	//Testing the output of positive exponent(8) and positive base(2) with the math.pow(2,8) is equal
	@Test
	void test_exponent_positive_method()
	{
	assertEquals(Math.pow(2, 8), Func_Trigo.calculate_power(2, 8));
	}	
	
	
	/////////////////////////////////////////// 8 - Exponent value Negative ////////////////////////////////////////////////////
	
	//Testing the output of negative exponent(-8) and positive base(2) with the math.pow(2,-8) is equal
	@Test
	void test_exponent_negative_method()
	{
	assertEquals(Math.pow(2, -8), Func_Trigo.calculate_power(2, -8));
	}
	
	
	
	
	/////////////////////////////////////////// 9 - Base value Negative ////////////////////////////////////////////////////
	
	//Testing the output of positive exponent(8) and negative base(-2) with the math.pow(-2,8) is equal
	@Test
	void test_base_negative_method()
	{
	assertEquals(Math.pow(-2, 8), Func_Trigo.calculate_power(-2, 8));
	}


	/////////////////////////////////////////// 10 - Exponent and Base value Negative ////////////////////////////////////////////////////
	
	//Testing the output of negative exponent(-8) and negative base(-2) with the math.pow(-2,-8) is equal
	@Test
	void test_exponent_base_negative_method()
	{
	assertEquals(Math.pow(-2, -8), Func_Trigo.calculate_power(-2, -8));
	}

}









