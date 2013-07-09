abstract class Hotel{
	private String name;
	private int rating;
	private Customer user;
	private String[] dates;

    void setTotal(int total) {
        this.total = total;
    }

    private int total = 0;

    public String[] getDates() {
        return dates;
    }

    protected int[][] cost;

	public Hotel(String name,int rating,Customer user,String[] dates){
		this.name=name;
		this.rating=rating;
		this.user=user;
		this.dates=dates;
	}

	public String getName(){
		return name;
	}

	public int getRating(){
		return rating;
	}

	public int getTotalPrice(){

        for(String day:dates){
			boolean weekEnd=isWeekEnd(day);
			total +=cost[user.getType()][weekEnd ? 1:0];
		}

		return total;
	}

	public boolean isWeekEnd(String day){
		int startIndex=day.indexOf("(");
		int endIndex=day.indexOf(")");
		String dayOfWeek=day.substring(startIndex+1,endIndex);
		return dayOfWeek.equals("sat")||dayOfWeek.equals("sun");
	}
}
