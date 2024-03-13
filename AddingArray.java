class AddingArray{
	 public static int[] plusOne(int[] digits) {

      for (int i = digits.length -1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;//digit[i]=> 4+1=> 5
		      return digits;
	        }
	    digits[i] = 0;
}
int digits2[] = new int[digits.length + 1];
 return digits2;  
}
    public static void main  (String num[]){
	
	int number[]={9,2,99,9};
int value[]=plusOne(number);
	
	for(int i=0;i<value.length;i++){
		System.out.print(value[i]);
	}
	}
	
}
