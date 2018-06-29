
public class AggregationExample {

	int eid;
	String empName;
	Address address;
	/**
	 * @param args
	 */
	public AggregationExample(int eid, String empName, Address address){
		this.eid=eid;
		this.empName=empName;
		this.address =address;
	}
	void display()
	{
		System.out.println(eid+" "+empName);
	    System.out.println(address.city+" "+address.state+" "+ address.country);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a1= new Address("kadapa","Andhra","India");
		Address a2=new Address("Secunderabad","Telangana","India");
		
		AggregationExample p = new AggregationExample(1,"Pavani",a1);
		AggregationExample s = new AggregationExample(2,"Srinivas",a2);
		
		p.display();
		s.display();

	}

}
