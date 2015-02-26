import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Statistic1 {

	public static void main(String[] args) {

		// Vnos spremenljivk
		Scanner s = new Scanner(System.in);
		System.out.println("Vnesi število spremenljivk......");
		int vnos1 = Integer.parseInt(s.nextLine());

		ArrayList<Double> vnosi = new ArrayList<Double>();

		for (int i = 0; i < vnos1; i++) {
			System.out.println(i + 1 + ".spremenljivka je?");
			double inp = Double.parseDouble(s.nextLine());
			vnosi.add(inp);
		}
		s.close();
		System.out.println("\nVnesel si naslednje spremenljivke:\t " + vnosi);
		Collections.sort(vnosi);
		System.out.println("Po velikosti sortirano:\t\t\t " + vnosi);

		// Izraèun povpreèja
		double vsota = 0;
		for (int i = 0; i < vnosi.size(); i++) {
			vsota = vsota + vnosi.get(i);

		}

		System.out.println("\nPovpreèje vnesenih spremenljivk je: "
				+ (vsota / vnosi.size()));

	}

}
