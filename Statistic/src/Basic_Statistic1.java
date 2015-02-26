public class Basic_Statistic1 {

	public static void main(String[] args) {

		double sum = 0;
		double variance = 0;

		for (int i = 0; i < args.length; i++) {
			sum = sum + Double.parseDouble(args[i]);
		}
		
		System.out.println("Number of args:\t\t" + args.length);
		System.out.println("Sum of the args is:\t" + sum);
		double mean = (sum) / args.length;
		System.out.println("The mean value is:\t" + mean);

		for (int i = 0; i < args.length; i++) {
			double temp = Double.parseDouble(args[i]);
			variance = variance + Math.pow(temp - mean, 2);
		}

		variance = variance / (args.length - 1);
		System.out.println("Variance:\t\t" + variance);
		System.out.println("Standard deviation:\t" + Math.sqrt(variance));
		
	}

}
