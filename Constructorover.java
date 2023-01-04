

public class Constructorover {
	String username;
	String companyname;
	String place;
	int age;
	int userid;
	String position;
	
	public Constructorover(String username, String companyname , String place , int age , int userid , String position   )
	{
		
		this.username=username;
		this.companyname=companyname;
		this.place=place;
		this.age=age;
		this.userid=userid;
		this.position=position;		
	}
    public Constructorover(String username, String companyname)
    {
        this.username=username;
        this.companyname=companyname;

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
	     Constructorover u1 = new Constructorover("vinay", "tcs", "jaipur", 20 , 456 ,"fullstack");
          Constructorover u2 = new Constructorover("vj","Axis" , "jaipur", 21 , 459 ,"fullstack" );
	      u2.Display();
	      

	}


}