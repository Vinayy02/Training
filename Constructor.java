

public class Constructor {
	String username;
	String companyname;
	String place;
	int age;
	int userid;
	String position;
	
	public Constructor(String Name , String Companyname , String Place , int Age , int Id , String Position   )
	{
		
		username=Name;
		companyname=Companyname;
		place=Place;
		age=Age;
		userid=Id;
		position=Position;			
	}
	void Display()
    {
        System.out.println(username);
        System.out.println(companyname);
        System.out.println(place);
        System.out.println(age);
        System.out.println(userid);
        System.out.println(position);

    }
	

	    public static void main(String[] args){
	     Constructor u1 = new Constructor("vinay", "tcs", "jaipur", 20 , 456 ,"fullstack");
	      
	     u1.Display();

	}

}
