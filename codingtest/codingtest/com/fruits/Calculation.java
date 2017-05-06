package codingtest.com.fruits;



public class Calculation {

	/** One Banana Cost = 10.00*/
	private final int bananaCost = 10;
	/** One OrangeCost = 15.00*/
	private final int orangeCost = 15;
	/** One Apple Cost = 20.50*/
	private final int appleCost = 20;
	/** One Lemon Cost = 14.00*/
	private final int lemonCost = 14;
	/** One Peaches Cost = 22.50*/
	private final int peachesCost = 22;

	/**
	 * Calculate total cost of all fruits available in bucket
	 * @param bucket
	 * @return return sum of all cost
	 */
	public int calculateTotalCost(Bucket bucket) {
		int totalCost = 0;
		// calculate apples cost
		if(!isEmpty(bucket.getApples())){
			try{
				totalCost = totalCost + Integer.parseInt(bucket.getApples()) * appleCost;
			} catch (NumberFormatException e) {
				totalCost = totalCost + 0;
			}
		}
		//calculate oranges cost
		if(!isEmpty(bucket.getOranges())){
			try{
				totalCost = totalCost + Integer.parseInt(bucket.getOranges()) * orangeCost;
			} catch (NumberFormatException e) {
				totalCost = totalCost + 0;
			}
		}
		//calculate bananas cost
		if(!isEmpty(bucket.getBananas())){
			try{
				totalCost = totalCost + Integer.parseInt(bucket.getBananas()) * bananaCost;
			} catch (NumberFormatException e) {
				totalCost = totalCost + 0;
			}
		}
		//calculate lemons cost
		if(!isEmpty(bucket.getLemons())){
			try{
				totalCost = totalCost + Integer.parseInt(bucket.getLemons()) * lemonCost;
			} catch (NumberFormatException e) {
				totalCost = totalCost + 0;
			}
		}
		//calculate peaches cost
		if(!isEmpty(bucket.getPeaches())){
			try{
				totalCost = totalCost + Integer.parseInt(bucket.getPeaches()) * peachesCost;
			} catch (NumberFormatException e) {
				totalCost = totalCost + 0;
			}
		}
		return totalCost;
	}

	/**
	 * Check weather input is empty or not
	 * @param input - String
	 * @return Boolean as yes or no
	 */
	public boolean isEmpty(String input){
		return (null == input) ? true :("".equals(input.trim()))? true:false ;
	}
}
