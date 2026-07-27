public class DigitSum {
	public static int digitSumOpt(int number, String option){
		String digitString = String.valueOf(Math.abs(number));
		int totalSum = 0;
		
		for(int i=0; i<digitString.length(); i++){
			int digit = Character.getNumericValue(digitString.charAt(i));
			
			if(option.equalsIgnoreCase("even") && digit%2 ==0 ){
				totalSum += digit;
			} else if (option.equalsIgnoreCase("odd") && digit%2 != 0){

				totalSum += digit;
			}
		}
		return totalSum;
	}
	public static void main(String[] args){
		System.out.println(digitSumOpt(123456, "even"));
		System.out.println(digitSumOpt(123456, "odd"));
	}
}