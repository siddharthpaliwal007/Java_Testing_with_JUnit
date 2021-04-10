// Author - Shruti, Siddharth

package TrigonometricFunc;

public class Func_Trigo {

	public static final double piVal = 3.141592;
	public static final double angleVal = 360;	
	
	
	// This method is used to convert the degree value to radiant value 
	// Input - Double value of x (angle in radiant)
	// Output - the degree value of the angle which is in radiant
	public static double convert_deg_to_rad (double i)
	{
		return (2* i * piVal)/ angleVal ;
	}
	
	// This method is used to normalize the radiant value 
	// Input - Double value of i (angle in radiant)
	// Output - the normalized value of angle
	public static double normalize_rad (double i)
	{
		return i % (piVal*2);
	}
	
	// This method is used to calculate factorial 
	// Input - integer value k(radiant value of the angle)
	// Output - factorial of the angle
	public static long calculate_factorial(int k)
	{
		long first=1;
		
		if(k >=0)
		{
			for(int j=1; j<=k; j++)
			{
				first = first*j;
			}
		}
		
		return first;
	}
	
	// This method is used to return the base raised to exponent value 
	// Input - integer j(exponent) and double i(base)
	// Output - Base raised to exponent value
	public static double calculate_power(double i, int j)
	{
		double PowerVal=1;
		
		if(j == 0)
			return PowerVal;
		
		for(int a=1; a<=j; a++)
			PowerVal = PowerVal * i;
		
		return PowerVal;
		
	}
	
	// Calculates the sine value of an angle in radiant
	// Input: double givAngle(radiant)
	// Output: sine value of the given angle
	public static double calculate_sine(double givAngle)
	{
		double sinVal=0;
		double normalize_angle = normalize_rad(givAngle);
		
		for(int i=1;i<=11;i++)
		{
			sinVal = sinVal + (calculate_power(-1, i-1)*
					calculate_power(normalize_angle, (2*i)-1)/calculate_factorial((2*i)-1));
		}
		
		return sinVal;
	}
	
	
	
	
	// Calculates the cosine value of an angle in radiant
	// Input: double givAngle(radiant)
	// Output: cosine value of the given angle
	public static double calculate_cosine(double givAngle)
	{
		double cosVal=0;
		double normalize_angle = normalize_rad(givAngle);
				
		for(int i=1;i<=11;i++)
		{
			cosVal = cosVal + (calculate_power(-1, i-1)*
					calculate_power(normalize_angle, 2*(i-1))/calculate_factorial(2*(i-1)));
		}
		
		return cosVal;
	}
	
	// Calculates the tangent value of an angle in radiant
	// Input: double givAngle(radiant)
	// Output: tangent value of the given angle
	public static double calculate_tangent(double angle)
	{
		double tanVal=0;
		
		tanVal = calculate_sine(angle) / calculate_cosine (angle);
		
		return tanVal;
	}

}
