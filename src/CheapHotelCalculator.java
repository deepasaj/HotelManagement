import java.io.*;
import java.util.Arrays;

class CheapHotelCalculator{
	private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to the Efficient Hotel Finder");
		System.out.println("Enter type of customer and days of stay:");
		System.out.println("Format: <Regular/Rewardee>:<16Mar2010(sun)>,<19Mar2010(wed)>");

		String[] input=br.readLine().split(":");

		Customer user=new Customer(input[0]);
		String[] dates=input[1].split(",");

		Hotel[] hotels=new Hotel[]{
			new X(user,dates),
			new Y(user,dates),
			new Z(user,dates)
		};

		for(Hotel h:hotels){
			System.out.println("Hotel "+h.getName()+" costs "+h.getTotalPrice());
		}

		Arrays.sort(hotels,new HotelComparator());
		System.out.println("Cheapest Hotel is:"+hotels[0].getName());
	}
}
