class X extends Hotel{
	X(Customer user,String[] dates){
		super("x",5,user,dates);

		cost=new int[][]{
			{100,120},
			{90,120}
		};
	}
}
