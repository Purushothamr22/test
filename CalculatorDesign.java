class CalculatorDesign{

    public static void main (String calculate[]){
	
	     int result1= add(58,54);
		 System.out.println(result1);
		 int result2 = sub(58,54);
		 System.out.println(result2);
		 int result3 = multi(58,54);
		 System.out.println(result3);
		 int result4 = div(58,54);
		 System.out.println(result4);
		 double result5 = sqrt(58);
		 System.out.println(result5);
		 double result6 = square(58);
		 System.out.println(result6);
		 double result7 = inverse(20);
		 System.out.println(result7);
		 double result8 = per(58,54);
		 System.out.println(result8);
	}


   public static int  add( int number1,int number2){
   
          int result1 = number1 + number2;
         return result1;
   
   }

   public static int sub(int number1,int number2){
	   
	   int result2 = number1 - number2;
	   return result2;
   }
   
   
   public static int multi( int number1, int number2){
	   int result3 =  number1 * number2;
	   return result3;
   }	   
   
   public static int div( int number1, int number2 ){

	   int result4 = number1 / number2;
	   return result4;
   }
   
   public static double sqrt( double number1){
	   
	   double result5 = Math.sqrt (number1);
	   return result5;   
   }
   
   public static double square(double number1){
	   
	   double result6 = (number1 * number1);
	   return result6;
   }
   
   public static double inverse( double number1){
	   
	   double result7 = (1 / number1);
	   return result7;
   }
   
   public static double per(double number1, double number2){
	   
	 double result8 = (number1/number2)*100;
	 return result8;
   }
}
