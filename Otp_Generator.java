package Project01;

import java.util.Random;

public class Otp_Generator 
{
	public static String generateOTP(int length)
	{
		String number= "0123456789"; // created string
				
		Random rndm_method = new Random(); //Random class Object
		
		char[] otp = new char[length]; //created new character Array 
		
		for(int i=0;i<length;i++)
		{
			otp[i] = number.charAt(rndm_method.nextInt(number.length()));
			
		}
		return new String(otp);	
	
	}
	
	public static void main(String[] args) throws InterruptedException //Start from this main method
//	If you want 4 digit OTP then put length 4
	{
		int length = 4;
		String otp = generateOTP(length); //created String as a OTP to call method
		
		System.out.println("Your OTP is:"+ otp);
		Thread.sleep(2000);
	}
	
	
//If you want 6 digit OTP then put length 6
	
	
	{
		int length = 6;
		String otp = generateOTP(length); //created String as a OTP to call method
		
		System.out.println("Your OTP is:"+ otp);
		
	}

}
