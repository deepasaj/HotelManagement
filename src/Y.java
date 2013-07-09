class Y extends Hotel{
	Y(Customer user,String[] dates){
		super("y",5,user,dates);

		cost=new int[][]{
			{200,225},
			{180,200}
		};
	}
}
