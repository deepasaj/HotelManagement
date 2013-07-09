import java.util.Comparator;

public class HotelComparator implements Comparator<Hotel>{
	public int compare(Hotel a,Hotel b){
		if(a.getTotalPrice()>b.getTotalPrice())
			return 1;
		else if(a.getTotalPrice()<b.getTotalPrice())
			return -1;
		else if(a.getRating()>b.getRating())
			return -1;
		else
			return 1;
	}
}
