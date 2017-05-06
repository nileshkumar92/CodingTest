package codingtest.com.fruits;


public class Main {

	public static void main(String[] args) {
		/* Bucket --> bananas, oranges, apples, lemons, peaches */
		Bucket bucket = new Bucket("1", "2", "3", "4", "5");
		System.out.println(new Calculation().calculateTotalCost(bucket));
	}

}
